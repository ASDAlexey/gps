package cordova.plugin.gpsbackground;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GPSBackground extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("add")) {
            this.add(args, callbackContext);
            return true;
        }
        return false;
    }

    private void add(JSONArray args, CallbackContext callback) {
        if(args != null) {
            try {
                callback.success("" + 15);
            } catch(Exception ex) {
                callback.error("Something went wrong " + ex);
            }
        } else {
            callback.error("Please don't pass null value");
        }
    }
}
