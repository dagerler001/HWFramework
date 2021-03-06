package com.huawei.device.connectivitychrlog;

public class ENCWifiHalDriverExceptionReason extends Cenum {
    public ENCWifiHalDriverExceptionReason() {
        this.map.put("CHR_WIFI_DRV_ERROR_ARP_TX_FAIL", Integer.valueOf(1));
        this.map.put("CHR_WIFI_DRV_ERROR_EAPOL_TX_FAIL", Integer.valueOf(2));
        this.map.put("CHR_WIFI_DRV_ERROR_BEAT_HEART_TIMEOUT", Integer.valueOf(3));
        this.map.put("CHR_WIFI_DRV_ERROR_WAKEUP_FAIL", Integer.valueOf(4));
        this.map.put("CHR_WIFI_DRV_ERROR_DEVICE_PANIC", Integer.valueOf(5));
        this.map.put("CHR_WIFI_DRV_ERROR_SDIO_TRANS_FAIL", Integer.valueOf(6));
        this.map.put("CHR_WIFI_DRV_ERROR_WATCHDOG_TIMEOUT", Integer.valueOf(7));
        this.map.put("CHR_WIFI_HAL_ERROR_MODE_CHANGE_FAIL", Integer.valueOf(8));
        this.map.put("CHR_WIFI_HAL_ERROR_WPS_FAIL", Integer.valueOf(9));
        this.map.put("CHR_WIFI_HAL_ERROR_CMD_SEND_FAIL", Integer.valueOf(10));
        this.map.put("CHR_WIFI_HAL_ERROR_CONNECT_FAIL", Integer.valueOf(11));
        this.map.put("CHR_WIFI_HAL_ERROR_DISCONNECT_EVENT_RECV", Integer.valueOf(12));
        this.map.put("CHR_PLAT_DRV_ERROR_RECV_LASTWORD", Integer.valueOf(13));
        this.map.put("CHR_PLAT_DRV_ERROR_WAKEUP_DEV", Integer.valueOf(14));
        this.map.put("CHR_PLAT_DRV_ERROR_BEAT_TIMEOUT", Integer.valueOf(15));
        setLength(1);
    }
}
