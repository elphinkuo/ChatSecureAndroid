package info.guardianproject.otr.app.im.app;

/**
 * Created with IntelliJ IDEA.
 * 
 * @author liguoqing
 * @version 1.0
 * @date 13-7-2 ����4:18
 */
public interface GlobalConfigKey {
    /** ������� **/
    public final static String APP_FIRST_LAUNCH = "app_first_launch";
    public final static String APP_LAST_VERSION_CODE = "app_version_code";

        public final static String LAST_LOC_CITY_ID = "last_loc_city_id";

        public final static String LAST_LOC_CITY_NAME = "last_loc_city_name";

    public final static String ROAM_CURRENT_CITY_INFO = "roam_cruuent_city_info";

        public final static String FAVOURITE_LAYER_SWITCH = "favourite_layer_switch";

        public final static String INDOOR_LAYER_SWITCH = "indoor_layer_switch";
        /** ������� **/
        // POI �б�
    public static String POI_LIST_SHOW_IMAGE_WITH_NO_WIFI = "poi_list_show_image_without_wifi"; // 0δ���õ���ʾͼƬ,1���ÿ���,2���ùر�
        public static final String SYSCFG_ALBRIGHT = "nalbright"; // ��Ļ�Ƿ���1.����
        public static final String SYSCFG_RECEIVE_PUSH = "nis_receive_push"; // �Ƿ����������Ϣ
        public static final String SYSCFG_3D_GESTURE = "n3d_gesture"; // 3D����
        public static final String SYSCFG_SATE_OPEN = "nsateopen"; // ����ͼ�Ƿ���,VInt
        public static final String SYSCFG_ROUTE_ITS = "nroute_its"; // ;����··��
        public static final String SYSCFG_CLEAR_OVERLAY = "nclear_overlay"; // ���ͼ��
        public static final String SYSCFG_FRIEND_OPEN = "nflsopen"; // �����Ƿ���,VInt
        public static final String SYSCFG_FAV_OPEN = "nfavopen"; // �ղؼ�ͼ���Ƿ���,VInt
        public static final String SYSCFG_INDOOR_OPEN = "nindooropen";// ����ͼ�Ƿ���
        public static final String SYSCFG_TRAFFIC_OPEN = "ntrafficopen";// ʵʱ��ͨ�Ƿ���,VInt
        public static final String SYSCFG_FLAX_SAVE = "nflax_save"; // ��ʡ������


        /** ��½�˺ű�� Key **/
        public static final String SYSCFG_IS_FIRST_USE = "nis_first_usefav"; // �Ƿ��ǵ�һ��ʹ���ղؼ�
        public static final String SYSCFG_IS_LOGIN_JUST = "nis_login_just"; // �Ƿ�յ�½�ɹ�
        public static final String SYSCFG_IS_LOGIN = "nis_login"; // �Ƿ��ǵ�½״̬
        public static final String SYSCF_IS_LOGOUT = "nis_logout"; // �Ƿ�ע��

    // ... ����
    public static String MAIN_MAP_TONIGHT_HOTEL_CLICKED_DATE = "main_map_tonight_hotel_clicked_date";
    public static String HAS_CLEAN_OUT_DATE_SHORTCUT = "has_clean_out_date_shortcut";
    
    public static final String SYSCFG_STREET_SCAPE_ENABLED = "syscfg_street_scape_enabled";
    public static final String SYSCFG_SHARELOCATION_SHORTCUT_SHOW = "firstsharelocgoingshow";//�Ƿ��һ����λ�ù����׽�����ֽ����л
    public static final String STREETSCAPE_CONFIRM_NO_WIFI = "streetscape_confirm_no_wifi";
    public static final String SYSCFG_STREET_ROAD_OPEN = "syscfg_street_road_open";

    // ���ߵ�ͼ
    public static String LOCAL_MAP_DATA_UPDATE_TIME = "local_map_data_update_time"; // ��������
    public static String LOCAL_MAP_DATA_TIP_TIME = "local_map_data_tip_time"; // �ϴ���������
    public static String LOCAL_MAP_SDCARD_CHECK_TIME = "local_map_sdcard_check_time"; // ��¼�ϴμ��˫sdcard��ʱ��
    public static String LOCAL_MAP_FIRST_LOCATE_CITYID = "local_map_first_locate_cityid"; // ��¼�Ƿ���й���һ�ζ�λ�����ص�ǰ���к�ȫ�����ߵ�ͼ
    public static String LOCAL_MAP_TASKS_MANUALLY_PAUSED_CITYARRAY = "local_map_tasks_manually_paused_cityarray"; // ��¼�����˳�ǰ�������ص�����

}
