package com.vghaisas.cordova.plugin.lockinfo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.KeyguardManager;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

class LockInfoPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("isLocked")) {
            this.isLocked(callbackContext);
            return true;
        }
        return false;
    }

    public boolean isLocked(CallbackContext context) {
        KeyguardManager kgMgr = (KeyguardManager) this.cordova.getActivity()
            .getApplicationContext()
            .getSystemService(Context.KEYGUARD_SERVICE);
        context.success(kgMgr.inKeyguardRestrictedInputMode());
    }
}
