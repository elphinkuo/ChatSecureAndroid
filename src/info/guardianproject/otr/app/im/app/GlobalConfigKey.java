package info.guardianproject.otr.app.im.app;

/**
 * Created with IntelliJ IDEA.
 * 
 * @author liguoqing
 * @version 1.0
 * @date 13-7-2 下午4:18
 */
public interface GlobalConfigKey {
    /** 启动相关 **/
    public final static String APP_FIRST_LAUNCH = "app_first_launch";
    public final static String APP_LAST_VERSION_CODE = "app_version_code";

        public final static String LAST_LOC_CITY_ID = "last_loc_city_id";

        public final static String LAST_LOC_CITY_NAME = "last_loc_city_name";

    public final static String ROAM_CURRENT_CITY_INFO = "roam_cruuent_city_info";

        public final static String FAVOURITE_LAYER_SWITCH = "favourite_layer_switch";

        public final static String INDOOR_LAYER_SWITCH = "indoor_layer_switch";
        /** 设置相关 **/
        // POI 列表
    public static String POI_LIST_SHOW_IMAGE_WITH_NO_WIFI = "poi_list_show_image_without_wifi"; // 0未设置但显示图片,1设置开启,2设置关闭
        public static final String SYSCFG_ALBRIGHT = "nalbright"; // 屏幕是否常亮1.常亮
        public static final String SYSCFG_RECEIVE_PUSH = "nis_receive_push"; // 是否接受推送消息
        public static final String SYSCFG_3D_GESTURE = "n3d_gesture"; // 3D手势
        public static final String SYSCFG_SATE_OPEN = "nsateopen"; // 卫星图是否开启,VInt
        public static final String SYSCFG_ROUTE_ITS = "nroute_its"; // 途径道路路况
        public static final String SYSCFG_CLEAR_OVERLAY = "nclear_overlay"; // 清空图层
        public static final String SYSCFG_FRIEND_OPEN = "nflsopen"; // 好友是否开启,VInt
        public static final String SYSCFG_FAV_OPEN = "nfavopen"; // 收藏夹图层是否开启,VInt
        public static final String SYSCFG_INDOOR_OPEN = "nindooropen";// 室内图是否开启
        public static final String SYSCFG_TRAFFIC_OPEN = "ntrafficopen";// 实时交通是否开启,VInt
        public static final String SYSCFG_FLAX_SAVE = "nflax_save"; // 节省的流量


        /** 登陆账号标记 Key **/
        public static final String SYSCFG_IS_FIRST_USE = "nis_first_usefav"; // 是否是第一次使用收藏夹
        public static final String SYSCFG_IS_LOGIN_JUST = "nis_login_just"; // 是否刚登陆成功
        public static final String SYSCFG_IS_LOGIN = "nis_login"; // 是否是登陆状态
        public static final String SYSCF_IS_LOGOUT = "nis_logout"; // 是否注销

    // ... 其他
    public static String MAIN_MAP_TONIGHT_HOTEL_CLICKED_DATE = "main_map_tonight_hotel_clicked_date";
    public static String HAS_CLEAN_OUT_DATE_SHORTCUT = "has_clean_out_date_shortcut";
    
    public static final String SYSCFG_STREET_SCAPE_ENABLED = "syscfg_street_scape_enabled";
    public static final String SYSCFG_SHARELOCATION_SHORTCUT_SHOW = "firstsharelocgoingshow";//是否第一次在位置共享首界面出现进行中活动
    public static final String STREETSCAPE_CONFIRM_NO_WIFI = "streetscape_confirm_no_wifi";
    public static final String SYSCFG_STREET_ROAD_OPEN = "syscfg_street_road_open";

    // 离线地图
    public static String LOCAL_MAP_DATA_UPDATE_TIME = "local_map_data_update_time"; // 更新日期
    public static String LOCAL_MAP_DATA_TIP_TIME = "local_map_data_tip_time"; // 上次提醒日期
    public static String LOCAL_MAP_SDCARD_CHECK_TIME = "local_map_sdcard_check_time"; // 记录上次检测双sdcard的时间
    public static String LOCAL_MAP_FIRST_LOCATE_CITYID = "local_map_first_locate_cityid"; // 记录是否进行过第一次定位并下载当前城市和全国离线地图
    public static String LOCAL_MAP_TASKS_MANUALLY_PAUSED_CITYARRAY = "local_map_tasks_manually_paused_cityarray"; // 记录程序退出前正在下载的任务

}
