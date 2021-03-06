package com.huawei.hsm.permission;

import android.os.Binder;
import android.util.Log;
import huawei.com.android.internal.widget.HwFragmentContainer;

public class AppListPermission {
    private static final String TAG = "AppListPermission";
    private int mPermissionType;
    private int mPid;
    private int mUid;

    public AppListPermission() {
        this.mPermissionType = StubController.PERMISSION_GET_PACKAGE_LIST;
        this.mUid = Binder.getCallingUid();
        this.mPid = Binder.getCallingPid();
    }

    public boolean allowOp() {
        if (this.mPermissionType == 0 || !StubController.checkPrecondition(this.mUid) || !isGlobalSwitchOn(this.mUid, this.mPid)) {
            return true;
        }
        switch (StubController.holdForGetPermissionSelection(this.mPermissionType, this.mUid, this.mPid, null)) {
            case HwFragmentContainer.SPLITE_MODE_DEFAULT_SEPARATE /*0*/:
                Log.e(TAG, "AppListPermission holdForGetPermissionSelection error");
                return false;
            case HwFragmentContainer.TRANSITION_SLIDE_HORIZONTAL /*2*/:
                return false;
            default:
                return true;
        }
    }

    private boolean isGlobalSwitchOn(int uid, int pid) {
        return true;
    }
}
