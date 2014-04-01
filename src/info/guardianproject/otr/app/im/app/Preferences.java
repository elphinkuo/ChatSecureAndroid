package info.guardianproject.otr.app.im.app;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Ӧ�ó���������Ϣ��
 * <p>
 * ԭ�����������Ӧ��ȫ�ֵ����ã�ÿ��ģ���ڲ�������ʹ���Լ������á�ʹ�� {@link Preferences#build(android.content.Context, String)}
 * �������á�
 * </p>
 *
 * @author Mark Guo
 * @version 1.0.0
 */
public class Preferences {

    private Context mContext;
        private SharedPreferences mSp;
        private SharedPreferences.Editor mEditor = null;
        
        /** Ĭ�������ļ����� */
        public static final String SP_NAME = "map_pref";

        /**
         * ˽�й�������
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
     * ���� Preferences ʵ����
     * @param context Context
     * @param cfgName �����ļ�����
     * @return
     */
    public static Preferences build(Context context,String cfgName) {
        return new Preferences(context,cfgName);
    }
    /**
     * ʹ��Ĭ������("map_pref") ���� Preferences ʵ����
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

