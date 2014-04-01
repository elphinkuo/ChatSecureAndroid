package info.guardianproject.otr.app.im.app;

//import com.baidu.BaiduMap.R;
//import com.baidu.baidumaps.BaiduMapApplication;
//import com.baidu.baidumaps.GuideScreen;
//import com.baidu.baidumaps.MapsActivity;
//import com.baidu.baidumaps.GuideScreen.ViewPageAdapter;
//import com.baidu.baidumaps.common.app.GlobalConfig;
//import com.baidu.baidumaps.common.customize.util.CstmUtility;
//import com.baidu.baidumaps.common.customize.util.LogUtils;
import info.guardianproject.otr.app.im.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GuideScreen extends Activity {
    private ViewPager mPager = null; //页面内容
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_view_page);
        findViewById(R.id.guide_button_ok).setOnClickListener(deleteButtonOnclick);
        mPager = (ViewPager) findViewById(R.id.guide_view_page);
        mPager.setAdapter(new ViewPageAdapter());
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            //pre-install
//            if (CstmUtility.DEBUG) {
//                LogUtils.uo(GuideScreen.this.getClass().getName(), "按back键");
//            }
            //pre-install - end

            startLogin();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void startLogin() {

        Intent intent = new Intent(this, info.guardianproject.otr.app.im.app.WelcomeActivity.class);
//        Intent intent = new Intent(this, info.guardianproject.otr.app.im.app.AccountActivity.class);
        startActivity(intent);
//        Intent intent = new Intent(this, MapsActivity.class);
//        intent.setAction(Intent.ACTION_MAIN);
//        intent.putExtra(BaiduMapApplication.INTENT_KEY_FROM_LAUNCHER,false);
//        startActivity(intent);
//
//        // 新版本启动之后,更改为最新版本号.
//        PackageManager manager = BaiduMapApplication.getInstance().getApplicationContext().getPackageManager();
//        try {
//            PackageInfo info = manager.getPackageInfo(BaiduMapApplication.getInstance().getApplicationContext()
//                    .getPackageName(), 0);
//            GlobalConfig.getInstance().setLastAppVersionCode(info.versionCode);
//        } catch (Exception e) {
//        }
//
//        GuideScreen.this.finish();
    }

    View.OnClickListener deleteButtonOnclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            //pre-install
//            if (CstmUtility.DEBUG) {
//                LogUtils.uo(GuideScreen.this.getClass().getName(), "点击【删除】");
//            }
            //pre-install - end

            startLogin();
        }
    };

    View.OnClickListener startMapOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            //pre-install
//            if (CstmUtility.DEBUG) {
//                LogUtils.uo(GuideScreen.this.getClass().getName(), "点击【点击开启智能生活】");
//            }
            //pre-install - end

            startLogin();
        }
    };

    /**
     * 页面适配器
     */
    class ViewPageAdapter extends PagerAdapter {
        private static final int COUNT = 4;
        private View[] mViews = new View[COUNT];

        @Override
        public int getItemPosition(Object object) {
            return super.getItemPosition(object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            if(position<0||position>COUNT)
                return null;

            if (mViews[position] == null) {
                final LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
                switch (position) {
                    case 0: {
                        mViews[position] = inflater.inflate(R.layout.guide_view_page1, null);
                        break;
                    }

                    case 1: {
                        mViews[position] = inflater.inflate(R.layout.guide_view_page2, null);
                        break;
                    }
                    case 2: {
                        mViews[position] = inflater.inflate(R.layout.guide_view_page3, null);
                        break;
                    }

                    case 3: {
                        mViews[position] = inflater.inflate(R.layout.guide_view_page4, null);
                        mViews[position].findViewById(R.id.start_map).setOnClickListener(startMapOnClick);
                        break;
                    }


                    default:
                        break;
                }
            }
            container.addView(mViews[position]);
            return mViews[position];
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            if (object != null && object.equals(mViews[position])) {
                container.removeView((View) object);
            }
        }

        @Override
        public int getCount() {
            // 4张引导图
            return COUNT;
        }

        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {
            return arg1 != null && arg1.equals(arg0);
        }

    }

}

