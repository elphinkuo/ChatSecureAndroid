package info.guardianproject.otr.app.im.app;


/*
 * to place the global config of the IM app here
 */
public class GlobalConfig {
    private static class Holder {
        static final GlobalConfig GLOBAL_CONFIG = new GlobalConfig();
    }
    
    public static GlobalConfig getInstance() {
        return Holder.GLOBAL_CONFIG;
    }
    
    private GlobalConfig() {
        mPreferences = Preferences.build(ImApp.getApplication(), "global_app");
    }
    
    private Preferences mPreferences;

    private int roamCityID = 0;
    
    public boolean isAppFirstLaunch() {
        return mPreferences.getBoolean(GlobalConfigKey.APP_FIRST_LAUNCH, true);
    }
    
    public void setAppFirstLaunch(boolean flag) {
        mPreferences.putBoolean(GlobalConfigKey.APP_FIRST_LAUNCH, flag);
    }

}
