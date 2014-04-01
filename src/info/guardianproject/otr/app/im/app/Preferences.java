package info.guardianproject.otr.app.im.app;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * 应用程序设置信息。
 * <p>
 * 原则上如果不是应用全局的设置，每个模块内部的配置使用自己的配置。使用 {@link Preferences#build(android.content.Context, String)}
 * 访问配置。
 * </p>
 *
 * @author Mark Guo
 * @version 1.0.0
 */
public class Preferences {

    private Context mContext;
        private SharedPreferences mSp;
        private SharedPreferences.Editor mEditor = null;
        
        /** 默认配置文件名。 */
        public static final String SP_NAME = "map_pref";

        /**
         * 私有构造器。
         * 
         * @param context
         * @param cfgName
         * @version 1.0
         */
        private Preferences(Context context, String cfgName){
                mContext = context;
                mSp = mContext.getSharedPreferences(cfgName, Context.MODE_PRIVATE);
        }

    /**
     * 构建 Preferences 实例。
     * @param context Context
     * @param cfgName 配置文件名称
     * @return
     */
    public static Preferences build(Context context,String cfgName) {
        return new Preferences(context,cfgName);
    }
    /**
     * 使用默认名称("map_pref") 构建 Preferences 实例。
     * @param context Context
     * @return
     */
    public static Preferences build(Context context) {
        return new Preferences(context,SP_NAME);
    }
        
        public boolean contains(String key){
            return mSp.contains(key);
        }

        public int getInt(String key,int defValue){
                return mSp.getInt(key, defValue);
        }
        public String getString(String key,String defValue){
                return mSp.getString(key, defValue);
        }
        public boolean getBoolean(String key,boolean defValue){
                return mSp.getBoolean(key, defValue);
        }
        public float getFloat(String key,float defValue){
                return mSp.getFloat(key, defValue);
        }
        public long getLong(String key,long defValue){
                return mSp.getLong(key, defValue);
        }

        public boolean putInt(String key,int value){
                mEditor = mSp.edit();
                mEditor.putInt(key, value);
                return mEditor.commit();
        }

        public boolean putLong(String key,long value){
                mEditor = mSp.edit();
                mEditor.putLong(key, value);
                return mEditor.commit();
        }

        public boolean putBoolean(String key,boolean value){
                mEditor = mSp.edit();
                mEditor.putBoolean(key, value);
                return mEditor.commit();
        }

        public boolean putFloat(String key,float value){
                mEditor = mSp.edit();
                mEditor.putFloat(key, value);
                return mEditor.commit();
        }

        public boolean putString(String key,String value){
                mEditor = mSp.edit();
                mEditor.putString(key, value);
                return mEditor.commit();
        }



}

