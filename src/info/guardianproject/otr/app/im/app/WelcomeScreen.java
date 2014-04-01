package info.guardianproject.otr.app.im.app;

import java.util.HashSet;

//import com.baidu.baidumaps.BaiduMapApplication;
//import com.baidu.baidumaps.GuideScreen;
//import com.baidu.baidumaps.MapsActivity;
//import com.baidu.baidumaps.WelcomeScreen;
//import com.baidu.baidumaps.WelcomeScreen.SplashHandler;
//import com.baidu.baidumaps.common.app.GlobalConfig;
//import com.baidu.baidumaps.common.app.startup.ServiceTermsHint;
//import com.baidu.baidumaps.common.customize.util.CstmUtility;
//import com.baidu.baidumaps.common.util.AppUtils;
//import com.baidu.baidumaps.framework.app.fpstack.TaskManagerFactory;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;

public class WelcomeScreen extends Activity {

    private static final String TAG = WelcomeScreen.class.getSimpleName();

    private static final int MSG_INIT_OK = 1; //不是第一次启动，则直接跳到地图
    private static final int MSG_GOTO_GUIDE = 2; //第一次启动，点击接受条款后，进入新功能引导页
    private static final int MSG_REJECT_EXIT = 3; //第一次启动，点击拒绝条款后，退出百度地图
//    private static final int MAX_SPLASH_TIME = 50;
//    private static long SPLASH_START_TM = 0;
    public static final int MSG_EXIT = 100;

    public static final SplashHandler SPLASH_HANDLER = new SplashHandler(
            Looper.getMainLooper());

//    private final CountDownLatch mInitLatch = new CountDownLatch(1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SPLASH_HANDLER.attach(this);
        checkServiceHint();
//        mInitLatch.countDown();

    }

    /**
     * 启动欢迎页
     */
    private void startGuidePage() {
        if (isFromLauncher()) {
            Intent intent = new Intent();
            intent.setClass(WelcomeScreen.this, GuideScreen.class);
            startActivity(intent);
        } else {
            startMap();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SPLASH_HANDLER.detach(this);
    }

    @Override
    public void onBackPressed() {

    }

    /**
     * 跳转至默认界面
     */
    private void startMap() {
        
        
//        Intent intent = getCurrentIntent().setClassName(this, MapsActivity.class.getName());
//        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
//        startActivity(intent);
    }

    private Intent getCurrentIntent() {
        if (getIntent() != null) {
            return getIntent();
        } else {
            return new Intent();
        }
    }

    private boolean isFromLauncher() {
        Intent intent = getIntent();
        boolean b = intent != null &&
                !TextUtils.isEmpty(intent.getAction()) &&
                intent.getAction().equals(Intent.ACTION_MAIN);
        return b;
    }

    private void checkServiceHint() {
        mPopupServiceHintThread.start();
    }

    private Thread mPopupServiceHintThread = new Thread() {
        public void run() {
//            try {
//                mInitLatch.await();
//            } catch (InterruptedException e) {
//            }

            final boolean bFirstStart = GlobalConfig.getInstance().isAppFirstLaunch();

            if (bFirstStart) {
                
                GlobalConfig.getInstance().setAppFirstLaunch(false);

                final Message msg = SPLASH_HANDLER.obtainMessage();
                msg.what = MSG_GOTO_GUIDE;
                msg.obj = WelcomeScreen.this;
                msg.sendToTarget();
                
                //添加删除提示
                /*final DialogInterface.OnClickListener okButtonListener = new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {

                        GlobalConfig.getInstance().setAppFirstLaunch(false);

                        final Message msg = SPLASH_HANDLER.obtainMessage();
                        msg.what = MSG_GOTO_GUIDE;
                        msg.obj = WelcomeScreen.this;
                        msg.sendToTarget();
                    }
                };
                final DialogInterface.OnClickListener cancelButtonListener = new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {

                        GlobalConfig.getInstance().setAppFirstLaunch(true);
                        final Message msg = SPLASH_HANDLER.obtainMessage();
                        msg.what = MSG_REJECT_EXIT;
                        msg.obj = WelcomeScreen.this;
                        msg.sendToTarget();

                    }
                };
                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        //pre-install
                        if (!WelcomeScreen.this.isFinishing()) {
                            mServiceTermsHint.showFlowHint(CstmUtility.OP_SERVICE_HINT,
                                    WelcomeScreen.this, okButtonListener, cancelButtonListener, SPLASH_HANDLER);
                        }
                        //pre-install - end
                    }
                });*/
                
                
            } else {
                final Message msg = SPLASH_HANDLER.obtainMessage();
                msg.what = MSG_GOTO_GUIDE;
                msg.obj = WelcomeScreen.this;
                msg.sendToTarget();
                
                /*
                int lastVersionCode = GlobalConfig.getInstance().getLastAppVersionCode();
                int curVersionCode = 0;
                PackageManager manager = BaiduMapApplication.getInstance().getApplicationContext().getPackageManager();
                try {
                    PackageInfo info = manager.getPackageInfo(BaiduMapApplication.getInstance().getApplicationContext().getPackageName(), 0);
                    curVersionCode = info.versionCode;
                } catch (Exception e) {
                }

                // 新版本启动时,启动引导页.
                if (curVersionCode > lastVersionCode) {
                    final Message msg = SPLASH_HANDLER.obtainMessage();
                    msg.what = MSG_GOTO_GUIDE;
                    msg.obj = WelcomeScreen.this;
                    msg.sendToTarget();
                } else {
                    final Message msg = SPLASH_HANDLER.obtainMessage();
                    msg.what = MSG_INIT_OK;
                    msg.obj = WelcomeScreen.this;
                    msg.sendToTarget();
                }
                */
            }
        }
    };

    private static class SplashHandler extends Handler {
        private HashSet<WelcomeScreen> set = new HashSet<WelcomeScreen>();

        public SplashHandler(Looper looper) {
            super(looper);
        }

        public void attach(WelcomeScreen page) {
            if (page != null) {
                set.add(page);
            }
        }

        public void detach(WelcomeScreen page) {
            if (page != null) {
                set.remove(page);
            }
        }

        public void handleMessage(Message msg) {
            if (msg.what == MSG_EXIT) {
                for (WelcomeScreen map : set) {
                    map.finish();
                }
//                BaiduMapApplication.getInstance().exitApp();
                return;
            }
            if (!set.contains(msg.obj)) {
                return;
            }
            final WelcomeScreen page = (WelcomeScreen) msg.obj;

            switch (msg.what) {
                case MSG_INIT_OK:
                    page.startMap();
                    page.finish();
                    break;
                case MSG_GOTO_GUIDE:
                    page.startGuidePage();
//                    AppUtils.installAppShortCut(page);
                    page.finish();
                    break;
                case MSG_REJECT_EXIT:
//                    TaskManagerFactory.getTaskManager().destroy();
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(0);
                        break;
                default:
                    break;
            }

        }
    }
}