package samde.domain;

import java.util.LinkedHashMap;
import java.util.Map;

public class Attributes {

    private Map<String, Integer> attributes = new LinkedHashMap<>();

    private Attributes() {
    }

    public Map<String, Integer> getAttributes() {
        return attributes;
    }

    public static Attributes newInstance() {
        Attributes attr = new Attributes();
        attr.attributes.put("android.permission.ACCESS_CHECKIN_PROPERTIES", 0);
        attr.attributes.put("android.permission.ACCESS_COARSE_LOCATION", 0);
        attr.attributes.put("android.permission.ACCESS_FINE_LOCATION", 0);
        attr.attributes.put("android.permission.ACCESS_LOCATION_EXTRA_COMMANDS", 0);
        attr.attributes.put("android.permission.ACCESS_NETWORK_STATE", 0);
        attr.attributes.put("android.permission.ACCESS_NOTIFICATION_POLICY", 0);
        attr.attributes.put("android.permission.ACCESS_WIFI_STATE", 0);
        attr.attributes.put("android.permission.ACCOUNT_MANAGER", 0);
        attr.attributes.put("android.permission.ADD_VOICEMAIL", 0);
        attr.attributes.put("android.permission.ANSWER_PHONE_CALLS", 0);
        attr.attributes.put("android.permission.BATTERY_STATS", 0);
        attr.attributes.put("android.permission.BIND_ACCESSIBILITY_SERVICE", 0);
        attr.attributes.put("android.permission.BIND_APPWIDGET", 0);
        attr.attributes.put("android.permission.BIND_AUTOFILL_SERVICE", 0);
        attr.attributes.put("android.permission.BIND_CARRIER_MESSAGING_SERVICE", 0);
        attr.attributes.put("android.permission.BIND_CARRIER_SERVICES", 0);
        attr.attributes.put("android.permission.BIND_CHOOSER_TARGET_SERVICE", 0);
        attr.attributes.put("android.permission.BIND_CONDITION_PROVIDER_SERVICE", 0);
        attr.attributes.put("android.permission.BIND_DEVICE_ADMIN", 0);
        attr.attributes.put("android.permission.BIND_DREAM_SERVICE", 0);
        attr.attributes.put("android.permission.BIND_INCALL_SERVICE", 0);
        attr.attributes.put("android.permission.BIND_INPUT_METHOD", 0);
        attr.attributes.put("android.permission.BIND_MIDI_DEVICE_SERVICE", 0);
        attr.attributes.put("android.permission.BIND_NFC_SERVICE", 0);
        attr.attributes.put("android.permission.BIND_NOTIFICATION_LISTENER_SERVICE", 0);
        attr.attributes.put("android.permission.BIND_PRINT_SERVICE", 0);
        attr.attributes.put("android.permission.BIND_QUICK_SETTINGS_TILE", 0);
        attr.attributes.put("android.permission.BIND_REMOTEVIEWS", 0);
        attr.attributes.put("android.permission.BIND_SCREENING_SERVICE", 0);
        attr.attributes.put("android.permission.BIND_TELECOM_CONNECTION_SERVICE", 0);
        attr.attributes.put("android.permission.BIND_TEXT_SERVICE", 0);
        attr.attributes.put("android.permission.BIND_TV_INPUT", 0);
        attr.attributes.put("android.permission.BIND_VISUAL_VOICEMAIL_SERVICE", 0);
        attr.attributes.put("android.permission.BIND_VOICE_INTERACTION", 0);
        attr.attributes.put("android.permission.BIND_VPN_SERVICE", 0);
        attr.attributes.put("android.permission.BIND_VR_LISTENER_SERVICE", 0);
        attr.attributes.put("android.permission.BIND_WALLPAPER", 0);
        attr.attributes.put("android.permission.BLUETOOTH", 0);
        attr.attributes.put("android.permission.BLUETOOTH_ADMIN", 0);
        attr.attributes.put("android.permission.BLUETOOTH_PRIVILEGED", 0);
        attr.attributes.put("android.permission.BODY_SENSORS", 0);
        attr.attributes.put("android.permission.BROADCAST_PACKAGE_REMOVED", 0);
        attr.attributes.put("android.permission.BROADCAST_SMS", 0);
        attr.attributes.put("android.permission.BROADCAST_STICKY", 0);
        attr.attributes.put("android.permission.BROADCAST_WAP_PUSH", 0);
        attr.attributes.put("android.permission.CALL_PHONE", 0);
        attr.attributes.put("android.permission.CALL_PRIVILEGED", 0);
        attr.attributes.put("android.permission.CAMERA", 0);
        attr.attributes.put("android.permission.CAPTURE_AUDIO_OUTPUT", 0);
        attr.attributes.put("android.permission.CAPTURE_SECURE_VIDEO_OUTPUT", 0);
        attr.attributes.put("android.permission.CAPTURE_VIDEO_OUTPUT", 0);
        attr.attributes.put("android.permission.CHANGE_COMPONENT_ENABLED_STATE", 0);
        attr.attributes.put("android.permission.CHANGE_CONFIGURATION", 0);
        attr.attributes.put("android.permission.CHANGE_NETWORK_STATE", 0);
        attr.attributes.put("android.permission.CHANGE_WIFI_MULTICAST_STATE", 0);
        attr.attributes.put("android.permission.CHANGE_WIFI_STATE", 0);
        attr.attributes.put("android.permission.CLEAR_APP_CACHE", 0);
        attr.attributes.put("android.permission.CONTROL_LOCATION_UPDATES", 0);
        attr.attributes.put("android.permission.DELETE_CACHE_FILES", 0);
        attr.attributes.put("android.permission.DELETE_PACKAGES", 0);
        attr.attributes.put("android.permission.DIAGNOSTIC", 0);
        attr.attributes.put("android.permission.DISABLE_KEYGUARD", 0);
        attr.attributes.put("android.permission.DUMP", 0);
        attr.attributes.put("android.permission.EXPAND_STATUS_BAR", 0);
        attr.attributes.put("android.permission.FACTORY_TEST", 0);
        attr.attributes.put("android.permission.GET_ACCOUNTS", 0);
        attr.attributes.put("android.permission.GET_ACCOUNTS_PRIVILEGED", 0);
        attr.attributes.put("android.permission.GET_PACKAGE_SIZE", 0);
        attr.attributes.put("android.permission.GET_TASKS", 0);
        attr.attributes.put("android.permission.GLOBAL_SEARCH", 0);
        attr.attributes.put("android.permission.INSTALL_LOCATION_PROVIDER", 0);
        attr.attributes.put("android.permission.INSTALL_PACKAGES", 0);
        attr.attributes.put("android.permission.INSTALL_SHORTCUT", 0);
        attr.attributes.put("android.permission.INSTANT_APP_FOREGROUND_SERVICE", 0);
        attr.attributes.put("android.permission.INTERNET", 0);
        attr.attributes.put("android.permission.KILL_BACKGROUND_PROCESSES", 0);
        attr.attributes.put("android.permission.LOCATION_HARDWARE", 0);
        attr.attributes.put("android.permission.MANAGE_ACCOUNTS", 0);
        attr.attributes.put("android.permission.MANAGE_DOCUMENTS", 0);
        attr.attributes.put("android.permission.MANAGE_OWN_CALLS", 0);
        attr.attributes.put("android.permission.MASTER_CLEAR", 0);
        attr.attributes.put("android.permission.MEDIA_CONTENT_CONTROL", 0);
        attr.attributes.put("android.permission.MODIFY_AUDIO_SETTINGS", 0);
        attr.attributes.put("android.permission.MODIFY_PHONE_STATE", 0);
        attr.attributes.put("android.permission.MOUNT_FORMAT_FILESYSTEMS", 0);
        attr.attributes.put("android.permission.MOUNT_UNMOUNT_FILESYSTEMS", 0);
        attr.attributes.put("android.permission.NFC", 0);
        attr.attributes.put("android.permission.PACKAGE_USAGE_STATS", 0);
        attr.attributes.put("android.permission.PERSISTENT_ACTIVITY", 0);
        attr.attributes.put("android.permission.PROCESS_OUTGOING_CALLS", 0);
        attr.attributes.put("android.permission.READ_CALENDAR", 0);
        attr.attributes.put("android.permission.READ_CALL_LOG", 0);
        attr.attributes.put("android.permission.READ_CONTACTS", 0);
        attr.attributes.put("android.permission.READ_EXTERNAL_STORAGE", 0);
        attr.attributes.put("android.permission.READ_FRAME_BUFFER", 0);
        attr.attributes.put("android.permission.READ_INPUT_STATE", 0);
        attr.attributes.put("android.permission.READ_MEDIA_STORAGE", 0);
        attr.attributes.put("android.permission.READ_LOGS", 0);
        attr.attributes.put("android.permission.READ_PHONE_NUMBERS", 0);
        attr.attributes.put("android.permission.READ_PHONE_STATE", 0);
        attr.attributes.put("android.permission.READ_SMS", 0);
        attr.attributes.put("android.permission.READ_SYNC_SETTINGS", 0);
        attr.attributes.put("android.permission.READ_SYNC_STATS", 0);
        attr.attributes.put("android.permission.READ_VOICEMAIL", 0);
        attr.attributes.put("android.permission.REBOOT", 0);
        attr.attributes.put("android.permission.RECEIVE_BOOT_COMPLETED", 0);
        attr.attributes.put("android.permission.RECEIVE_MMS", 0);
        attr.attributes.put("android.permission.RECEIVE_SMS", 0);
        attr.attributes.put("android.permission.RECEIVE_WAP_PUSH", 0);
        attr.attributes.put("android.permission.RECORD_AUDIO", 0);
        attr.attributes.put("android.permission.REORDER_TASKS", 0);
        attr.attributes.put("android.permission.REQUEST_COMPANION_RUN_IN_BACKGROUND", 0);
        attr.attributes.put("android.permission.REQUEST_COMPANION_USE_DATA_IN_BACKGROUND", 0);
        attr.attributes.put("android.permission.REQUEST_DELETE_PACKAGES", 0);
        attr.attributes.put("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", 0);
        attr.attributes.put("android.permission.REQUEST_INSTALL_PACKAGES", 0);
        attr.attributes.put("android.permission.RESTART_PACKAGES", 0);
        attr.attributes.put("android.permission.SEND_RESPOND_VIA_MESSAGE", 0);
        attr.attributes.put("android.permission.SEND_SMS", 0);
        attr.attributes.put("android.permission.SET_ALARM", 0);
        attr.attributes.put("android.permission.SET_ALWAYS_FINISH", 0);
        attr.attributes.put("android.permission.SET_ANIMATION_SCALE", 0);
        attr.attributes.put("android.permission.SET_DEBUG_APP", 0);
        attr.attributes.put("android.permission.SET_PREFERRED_APPLICATIONS", 0);
        attr.attributes.put("android.permission.SET_PROCESS_LIMIT", 0);
        attr.attributes.put("android.permission.SET_TIME", 0);
        attr.attributes.put("android.permission.SET_TIME_ZONE", 0);
        attr.attributes.put("android.permission.SET_WALLPAPER", 0);
        attr.attributes.put("android.permission.SET_WALLPAPER_HINTS", 0);
        attr.attributes.put("android.permission.SIGNAL_PERSISTENT_PROCESSES", 0);
        attr.attributes.put("android.permission.STATUS_BAR", 0);
        attr.attributes.put("android.permission.SYSTEM_ALERT_WINDOW", 0);
        attr.attributes.put("android.permission.TRANSMIT_IR", 0);
        attr.attributes.put("android.permission.UNINSTALL_SHORTCUT", 0);
        attr.attributes.put("android.permission.UPDATE_DEVICE_STATS", 0);
        attr.attributes.put("android.permission.USE_CREDENTIALS", 0);
        attr.attributes.put("android.permission.USE_FINGERPRINT", 0);
        attr.attributes.put("android.permission.USE_SIP", 0);
        attr.attributes.put("android.permission.VIBRATE", 0);
        attr.attributes.put("android.permission.WAKE_LOCK", 0);
        attr.attributes.put("android.permission.WRITE_APN_SETTINGS", 0);
        attr.attributes.put("android.permission.WRITE_CALENDAR", 0);
        attr.attributes.put("android.permission.WRITE_CALL_LOG", 0);
        attr.attributes.put("android.permission.WRITE_CONTACTS", 0);
        attr.attributes.put("android.permission.WRITE_EXTERNAL_STORAGE", 0);
        attr.attributes.put("android.permission.WRITE_GSERVICES", 0);
        attr.attributes.put("android.permission.WRITE_MEDIA_STORAGE", 0);
        attr.attributes.put("android.permission.WRITE_SECURE_SETTINGS", 0);
        attr.attributes.put("android.permission.WRITE_SETTINGS", 0);
        attr.attributes.put("android.permission.WRITE_SMS", 0);
        attr.attributes.put("android.permission.WRITE_SYNC_SETTINGS", 0);
        attr.attributes.put("android.permission.WRITE_VOICEMAIL", 0);
        attr.attributes.put("android.permission.ACCESS_COARSE_UPDATES", 0);
        attr.attributes.put("android.permission.RECEIVE_USER_PRESENT", 0);
        attr.attributes.put("com.android.browser.permission.READ_HISTORY_BOOKMARKS", 0);
        attr.attributes.put("android.permission.USES_POLICY_FORCE_LOCK", 0);
        attr.attributes.put("com.android.alarm.permission.SET_ALARM", 0);
        attr.attributes.put("android.permission.READ_SETTINGS", 0);
        attr.attributes.put("android.permission.ACCESS_DOWNLOAD_MANAGER", 0);
        attr.attributes.put("android.permission.SYSTEM_OVERLAY_WINDOW", 0);
        attr.attributes.put("android.permission.DOWNLOAD_WITHOUT_NOTIFICATION", 0);
        attr.attributes.put("com.android.browser.permission.WRITE_HISTORY_BOOKMARKS", 0);
        attr.attributes.put("android.permission.READ_PROFILE", 0);
        attr.attributes.put("android.permission.FLASHLIGHT", 0);
        attr.attributes.put("android.permission.DEVICE_POWER", 0);
        attr.attributes.put("android.permission.FORCE_STOP_PACKAGES", 0);
        attr.attributes.put("android.permission.CLEAR_APP_USER_DATA", 0);
        attr.attributes.put("android.permission.ACCESS_MOCK_LOCATION", 0);
        attr.attributes.put("android.permission.AUTHENTICATE_ACCOUNTS", 0);
        return attr;
    }
}
