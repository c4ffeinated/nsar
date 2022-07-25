// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/ReactActivity.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ARSceneNavigatorModule.java

/*

used in :

    private void checkPermissionsAndRun(PermissionListener listener, boolean audioAndRecordingPerm){
        Activity activity = mContext.getCurrentActivity();

        // return if we already have permissions
        if (audioAndRecordingPerm && hasAudioAndRecordingPermissions(mContext)) {
            listener.onRequestPermissionsResult(0, null, null);
            return;
        } else if (!audioAndRecordingPerm && hasRecordingPermissions(mContext)) {
            listener.onRequestPermissionsResult(0, null, null);
            return;
        }

        if (!(activity instanceof ReactActivity)){
            Log.e("Viro","Error: Missing ReactActivity required for checking recording permissions!");

            // Trigger a permission failure callback.
            listener.onRequestPermissionsResult(0, null, null);
            return;
        }

        ReactActivity reactActivity = (ReactActivity) activity;
        if (audioAndRecordingPerm){
            reactActivity.requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.RECORD_AUDIO}, PERMISSION_REQ_CODE_AUDIO, listener);
        } else {
            reactActivity.requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    PERMISSION_REQ_CODE_STORAGE, listener);
        }
    }

*/

