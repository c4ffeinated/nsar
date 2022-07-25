// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/bridge/Callback.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ARSceneNavigatorModule.java

/*

    @ReactMethod
    public void startVideoRecording(final int sceneNavTag, final String fileName,
                                    final boolean saveToCameraRool, final Callback reactErrorDelegate) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (!(sceneView instanceof VRTARSceneNavigator)) {
                    throw new IllegalViewOperationException("Viro: Attempted to call startVideoRecording on a non-ARSceneNav view!");
                }
                VRTARSceneNavigator scene = (VRTARSceneNavigator) sceneView;

                // Grab the recorder from the ar scene view
                final ViroMediaRecorder recorder = scene.getARView().getRecorder();
                if (recorder == null){
                    reactErrorDelegate.invoke(UNSUPPORTED_PLATFORM_ERROR);
                    return;
                }

                // Construct an error listener callback that may be triggered during recording.
                final ViroMediaRecorder.RecordingErrorListener viroErrorDelegate = new ViroMediaRecorder.RecordingErrorListener() {
                    @Override
                    public void onRecordingFailed(Error error) {
                        reactErrorDelegate.invoke(error.toInt());
                    }
                };

                // Start recording if we have the right permissions
                checkPermissionsAndRun(new PermissionListener() {
                    @Override
                    public boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
                        recorder.startRecordingAsync(fileName, saveToCameraRool, viroErrorDelegate);
                        return true;
                    }
                }, true);
            }
        });
    }

        @ReactMethod
    public void stopVideoRecording(final int sceneNavTag, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (!(sceneView instanceof VRTARSceneNavigator)) {
                    throw new IllegalViewOperationException("Viro: Attempted to call startVideoRecording on a non-ARSceneNav view!");
                }
                VRTARSceneNavigator scene = (VRTARSceneNavigator) sceneView;

                // Grab the recorder from the ar scene view
                final ViroMediaRecorder recorder = scene.getARView().getRecorder();
                if (recorder == null){
                    WritableMap returnMap = Arguments.createMap();
                    returnMap.putBoolean(RECORDING_SUCCESS_KEY, false);
                    returnMap.putInt(RECORDING_ERROR_KEY, UNSUPPORTED_PLATFORM_ERROR);
                    returnMap.putString(RECORDING_URL_KEY, null);
                    promise.resolve(returnMap);
                    return;
                }

                // Construct a completion delegate callback to be notified of the result of the recording.
                final ViroMediaRecorder.VideoRecordingFinishListener completionCallback =
                        new ViroMediaRecorder.VideoRecordingFinishListener() {
                    @Override
                    public void onError(Error error) {
                        WritableMap returnMap = Arguments.createMap();
                        returnMap.putBoolean(RECORDING_SUCCESS_KEY, false);
                        returnMap.putInt(RECORDING_ERROR_KEY, error.toInt());
                        returnMap.putString(RECORDING_URL_KEY, null);
                        promise.resolve(returnMap);
                    }

                    @Override
                    public void onSuccess(String url) {
                        WritableMap returnMap = Arguments.createMap();
                        returnMap.putBoolean(RECORDING_SUCCESS_KEY, true);
                        returnMap.putInt(RECORDING_ERROR_KEY, Error.NONE.toInt());
                        returnMap.putString(RECORDING_URL_KEY, url);
                        promise.resolve(returnMap);
                    }
                };

                // Stop recording if we have the right permissions
                checkPermissionsAndRun(new PermissionListener() {
                    @Override
                    public boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
                        recorder.stopRecordingAsync(completionCallback);
                        return true;
                    }
                }, true);
            }
        });
    }

    @ReactMethod
    public void takeScreenshot(final int sceneNavTag, final String fileName,
                               final boolean saveToCameraRool, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (!(sceneView instanceof VRTARSceneNavigator)) {
                    throw new IllegalViewOperationException("Viro: Attempted to call startVideoRecording on a non-ARSceneNav view!");
                }
                VRTARSceneNavigator scene = (VRTARSceneNavigator) sceneView;

                // Grab the recorder from the ar scene view
                final ViroMediaRecorder recorder = scene.getARView().getRecorder();
                if (recorder == null){
                    WritableMap returnMap = Arguments.createMap();
                    returnMap.putBoolean(RECORDING_SUCCESS_KEY, false);
                    returnMap.putInt(RECORDING_ERROR_KEY, UNSUPPORTED_PLATFORM_ERROR);
                    returnMap.putString(RECORDING_URL_KEY, null);
                    promise.resolve(returnMap);
                    return;
                }

                // Construct a completion delegate callback to be notified of sceenshot results.
                final ViroMediaRecorder.ScreenshotFinishListener callback = new ViroMediaRecorder.ScreenshotFinishListener() {
                    @Override
                    public void onError(Error error) {
                        WritableMap returnMap = Arguments.createMap();
                        returnMap.putBoolean(RECORDING_SUCCESS_KEY, false);
                        returnMap.putInt(RECORDING_ERROR_KEY, error.toInt());
                        returnMap.putString(RECORDING_URL_KEY, null);
                        promise.resolve(returnMap);
                    }

                    @Override
                    public void onSuccess(Bitmap bitmap, String url) {
                        WritableMap returnMap = Arguments.createMap();
                        returnMap.putBoolean(RECORDING_SUCCESS_KEY, true);
                        returnMap.putInt(RECORDING_ERROR_KEY, Error.NONE.toInt());
                        returnMap.putString(RECORDING_URL_KEY, url);
                        promise.resolve(returnMap);
                    }
                };
                
                // Schedule taking a screen shot if we have the right permission
                checkPermissionsAndRun(new PermissionListener() {
                    @Override
                    public boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
                        recorder.takeScreenShotAsync(fileName, saveToCameraRool, callback);
                        return true;
                    }
                }, false);
            }
        });
    }

    @ReactMethod()
    public void isARSupportedOnDevice(final Callback successCallback) {
        ViroViewARCore.ARCoreAvailability availability = ViroViewARCore.isARSupportedOnDevice(getReactApplicationContext());
        successCallback.invoke(availability.toString());
    }

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