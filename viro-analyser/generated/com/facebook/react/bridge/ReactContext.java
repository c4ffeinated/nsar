// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/bridge/ReactContext.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT360Image.java

/*

used in :

    public VRT360Image(ReactContext context) {
        super(context);
        mMainHandler = new Handler(Looper.getMainLooper());
        mImageNeedsDownload = false;
        mIsHdr = false;
    }

    private void imageDownloadDidStart() {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_LOAD_START,
                null
        );
    }

    private void imageDownloadDidFinish() {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_LOAD_END,
                null
        );
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT360Video.java

/*

used in :

    public VRT360Video(ReactContext reactContext) {
        super(reactContext);
    }

    private void reactVideoBufferStartCallback() {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_BUFFER_START,
                null);
    }

    private void reactVideoBufferEndCallback() {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_BUFFER_END,
                null);
    }

    private void reactVideoFinishedCallback() {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_FINISH,
                null);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT3DSceneNavigator.java

/*

used in :

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTAnimatedComponent.java

/*

used in :

        public AnimatedComponentAnimation(ReactContext context, VRTComponent parent) {
            super(context, parent);
            mAnimationManager = context.getNativeModule(AnimationManager.class);
        }

    public VRTAnimatedComponent(ReactContext context) {
        super(context);
        mManagedAnimation = new AnimatedComponentAnimation(context, this);
        mAnimationManager = context.getNativeModule(AnimationManager.class);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTARSceneNavigator.java

/*

used in :

    public VRTARSceneNavigator(ReactContext context) {
        super(context, ReactViroPackage.ViroPlatform.AR);
        final  WeakReference<VRTARSceneNavigator> weakSceneARRef = new WeakReference<VRTARSceneNavigator>(this);
        mRotationListener = new DisplayRotationListener(context) {
            @Override
            public void onDisplayRotationChanged(int rotation) {
                VRTARSceneNavigator navigator = weakSceneARRef.get();
                if (navigator != null) {
                    ViroViewARCore view = navigator.getARView();
                    if (view != null) {
                        view.setCameraRotation(rotation);
                    }
                }
            }
        };
        mRotationListener.enable();
    }

     Override the parent method to use the ViroARView.
    @Override
    protected ViroView createViroView(ReactContext reactContext) {
        return new ViroViewARCore(reactContext.getCurrentActivity(),
                new StartupListenerARCore(this));
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTBaseSound.java

/*

used in :

    public VRTBaseSound(ReactContext reactContext) {
        super(reactContext.getBaseContext(), null, -1, -1, reactContext);
    }

    private SoundData getSoundDataForName(String name) {
        SoundModule soundModule = mReactContext.getNativeModule(SoundModule.class);
        return soundModule.getSoundData(name);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTComponent.java

/*

used in :

    public VRTComponent(ReactContext reactContext) {
        this(reactContext.getBaseContext(), null, -1, -1, reactContext);
    }

    public VRTComponent(Context context, AttributeSet attrs, int defStyleAttr,
                        int defStyleRes, ReactContext reactContext) {
        super(context);
        mReactContext = reactContext;
    }

    
     * Invoke this control's onError callback, if it has one, with the given
     * message.
     *
     * @param error The error message.
    public void onError(String error) {
        WritableMap event = Arguments.createMap();
        event.putString("error", error);

        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_ERROR,
                event);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTController.java

/*

used in :

    public VRTController(ReactContext reactContext) {
        super(reactContext);
        mEventDelegateJni = new EventDelegate();
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTLightingEnvironment.java

/*

used in :

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTManagedAnimation.java

/*

used in :

    public VRTManagedAnimation(ReactContext context, VRTComponent parent) {
        mReactContext = context;
        mParentComponent = parent;
    }


     * This method should be called when an animation starts and notifies the JS bridge

    private void onStartAnimation() {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                mParentComponent.getId(),
                ViroEvents.ON_ANIMATION_START,
                null);
    }


     * This method should be called by the JNI layer when the animation ends and notifies the JS
     * bridge. It also handles looping logic.

    private void onFinishAnimation(ExecutableAnimation animation) {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                mParentComponent.getId(),
                ViroEvents.ON_ANIMATION_FINISH,
                null);

        // If the animation changed, we won't terminate or loop
        if (mExecutableAnimation == animation) {
            mState = AnimationState.TERMINATED;
            if (mLoop && mRun) {
                playAnimation();
            }
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTManagedAnimation.java

/*

used in :

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTMaterialVideo.java

/*

used in :

    public VRTMaterialVideo(ReactContext reactContext) {
        super(reactContext.getBaseContext(), null, -1, -1, reactContext);
    }

    public void setMaterial(String material) {
        mMaterial = material;
        mMaterialChanged = true;
        MaterialManager materialManager = this.getReactContext().getNativeModule(MaterialManager.class);
        materialManager.setMaterialChangeListener(mMaterial, this);
        //pause previous video texture if it exists.
        if(mVideoTexture != null) {
            mVideoTexture.pause();
        }
    }

    private void updateVideoTexture() {
        mVideoTexture = null;
          // get material manager
        MaterialManager materialManager = this.getReactContext().getNativeModule(MaterialManager.class);
        Material nativeMaterial = materialManager.getMaterial(mMaterial);

        if (nativeMaterial.getDiffuseTexture() instanceof VideoTexture) {
            mDelegate = new VRTMaterialVideo.VideoSurfaceDelegate(this);
            mVideoTexture = ((VideoTexture) nativeMaterial.getDiffuseTexture());
            mVideoTexture.setPlaybackListener(mDelegate);
        }
    }

    private void playerBufferStart() {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_BUFFER_START,
                null);
    }

    private void playerBufferEnd() {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_BUFFER_END,
                null);
    }

    private void playerDidFinishPlaying() {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_FINISH,
                null);
    }

    private void playerOnUpdateTime(float currentTime, float totalTime) {
        WritableMap event = Arguments.createMap();
        event.putDouble("currentTime", (double) currentTime);
        event.putDouble("totalTime", (double) totalTime);

        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_UPDATE_TIME,
                event);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSkyBox.java

/*

used in :

    public VRTSkyBox(ReactContext context) {
        super(context);
        mContext = context;
        mImageDownloader = new ImageDownloader(getContext());
        mColor = COLOR_NOT_SET;
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSound.java

/*

used in :

    public VRTSound(ReactContext reactContext) {
        super(reactContext);
    }

    @Override
    public void onSoundFinish(Sound sound) {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(getId(),
                ViroEvents.ON_FINISH,
                null);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSoundField.java

/*

used in :

    public VRTSoundField(ReactContext reactContext) {
        super(reactContext);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSpatialSound.java

/*

used in :

    public VRTSpatialSound(ReactContext reactContext, Node parentNode) {
        super(reactContext);
        mParentNode = parentNode;
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSpatialSoundWrapper.java

/*

used in :

    public VRTSpatialSoundWrapper(ReactContext reactContext) {
        super(reactContext);
        mInnerSound = new VRTSpatialSound(reactContext, getNodeJni());
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTVRSceneNavigator.java

/*

used in :

    public VRTVRSceneNavigator(ReactContext reactContext,
                               ReactViroPackage.ViroPlatform platform) {
        super(reactContext, platform);
    }

    protected ViroView createViroView(ReactContext reactContext) {
        switch (mPlatform) {
            case OVR_MOBILE:
                return new ViroViewOVR(reactContext.getCurrentActivity(),
                        new StartupListenerOVR(this));
            case GVR:
                // default case is to use GVR
            default:
                return new ViroViewGVR(reactContext.getCurrentActivity(),
                        new StartupListenerGVR(this), new OnGVRExitListener(this), null, false);
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARImageMarker.java

/*

used in :

    public VRTARImageMarker(ReactContext context) {
        super(context);
    }

    private void updateARDeclarativeImageNode(final boolean shouldAddToScene) {
        ARTrackingTargetsModule trackingTargetsModule = getReactContext().getNativeModule(ARTrackingTargetsModule.class);
        ARTrackingTargetsModule.ARTargetPromise promise = trackingTargetsModule.getARTargetPromise(mTargetName);
        if (promise != null) {
            promise.wait(new ARTrackingTargetsModule.ARTargetPromiseListener() {
                @Override
                public void onComplete(String key, ARImageTarget newTarget) {
                    ARDeclarativeImageNode imageNode = (ARDeclarativeImageNode) getNodeJni();
                    if (imageNode != null) {
                        ARImageTarget oldTarget = imageNode.getARImageTarget();
                        imageNode.setARImageTarget(newTarget);
                        ARScene arScene = (ARScene) mScene.getNativeScene();
                        if (arScene != null) {
                            if (shouldAddToScene) {
                                // add the node
                                arScene.addARDeclarativeNode(imageNode);
                            } else {
                                // remove old ARImageTarget and update the ARNode
                                if (oldTarget != null) {
                                    arScene.removeARImageTargetDeclarative(oldTarget);
                                }
                                arScene.updateARDeclarativeNode(imageNode);
                            }
                            // always add the ARImageTarget
                            arScene.addARImageTargetDeclarative(newTarget);
                        }
                    }
                }

                @Override
                public void onError(Exception e) {
                    throw new IllegalStateException("ARImageMarker - unable to fetch target", e);
                }
            });
        } else {
            throw new IllegalArgumentException("ARImageMarker - unknown target [" + mTargetName + "]");
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARNode.java

/*

used in :

    public VRTARNode(ReactContext context) {
        super(context);
    }

    // -- ARNodeDelegate implementation --

    @Override
    public void onAnchorFound(ARAnchor arAnchor) {
        mIsAnchored = true;
        handleAppearanceChange();
        WritableMap returnMap = Arguments.createMap();
        returnMap.putMap("anchorFoundMap", ARUtils.mapFromARAnchor(arAnchor));
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_ANCHOR_FOUND,
                returnMap);
    }

    @Override
    public void onAnchorUpdated(ARAnchor arAnchor) {
        WritableMap returnMap = Arguments.createMap();
        returnMap.putMap("anchorUpdatedMap", ARUtils.mapFromARAnchor(arAnchor));
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_ANCHOR_UPDATED,
                returnMap);
    }

    @Override
    public void onAnchorRemoved() {
        mIsAnchored = false;
        handleAppearanceChange();
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_ANCHOR_REMOVED,
                null);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARObjectMarker.java

/*

used in :

    public VRTARObjectMarker(ReactContext context) {
        super(context);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARPlane.java

/*

used in :

    public VRTARPlane(ReactContext context) {
        super(context);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARScene.java

/*

used in :

    public VRTARScene(ReactContext reactContext) {
        super(reactContext);
        mMainHandler = new Handler(Looper.getMainLooper());
    }

    // -- ARSceneDelegate Implementation --

    @Override
    public void onTrackingUpdated(ARScene.TrackingState state, ARScene.TrackingStateReason reason) {
        WritableMap returnMap = Arguments.createMap();
        returnMap.putInt("state", state.getId());
        returnMap.putInt("reason", reason.getId());

        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_TRACKING_UPDATED,
                returnMap);
    }

    @Override
    public void onTrackingInitialized() {
        //No-op
    }

    @Override
    public void onAmbientLightUpdate(float intensity, Vector color) {
        // Multiply by the inverse of the rebalancing factor to compensate for the
        // brightness reduction caused by rebalancing color correction.
        float lightIntensity = intensity * 1.0f / kLightEstimateIntensityRebalance;

        // ARCore returns light values in gamma space in the range 0.5 to 1.5. First convert
        // to linear color, then rebalance so the values do not breach 1.0. The brightness is
        // diminished but this is compensated by multiplying estimated intensity by the inverse
        // of the rebalance constant (above).
        String lightColor = String.format("#%02x%02x%02x",
                (int) Math.min(255, Math.max(0, color.x * kLightEstimateIntensityRebalance * 255)),
                (int) Math.min(255, Math.max(0, color.y * kLightEstimateIntensityRebalance * 255)),
                (int) Math.min(255, Math.max(0, color.z * kLightEstimateIntensityRebalance * 255)));

        WritableMap lightInfoMap = Arguments.createMap();
        lightInfoMap.putDouble(AMBIENT_INTENSITY_KEY, (double) lightIntensity);
        lightInfoMap.putString(AMBIENT_COLOR_KEY, lightColor);

        WritableMap event = Arguments.createMap();
        event.putMap(AMBIENT_LIGHT_INFO_KEY, lightInfoMap);

        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_AMBIENT_LIGHT_UPDATE,
                event);
    }

    @Override
    public void onAnchorFound(ARAnchor arAnchor, ARNode node) {
        WritableMap returnMap = Arguments.createMap();
        returnMap.putMap("anchor", ARUtils.mapFromARAnchor(arAnchor));

        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
            getId(),
            ViroEvents.ON_ANCHOR_FOUND,
            returnMap);
    }

    @Override
    public void onAnchorUpdated(ARAnchor arAnchor, ARNode node) {
        WritableMap returnMap = Arguments.createMap();
        returnMap.putMap("anchor", ARUtils.mapFromARAnchor(arAnchor));

        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
            getId(),
            ViroEvents.ON_ANCHOR_UPDATED,
            returnMap);
    }

    @Override
    public void onAnchorRemoved(ARAnchor arAnchor, ARNode node) {
        WritableMap returnMap = Arguments.createMap();
        returnMap.putMap("anchor", ARUtils.mapFromARAnchor(arAnchor));

        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
            getId(),
            ViroEvents.ON_ANCHOR_REMOVED,
            returnMap);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTCamera.java

/*

used in :

    public VRTCamera(ReactContext context) {
        super(context);
        mNodeRootTransformCamera = new VRTNode(getReactContext());
        mNativeCamera = new Camera();

        // set the node to copy camera head rotation to.
        mNativeCamera.setRefNodeToCopyRotation(getNodeJni());

        //add the camera to the root node.
        mNodeRootTransformCamera.getNodeJni().setCamera(mNativeCamera);
        //now add this base node of VRTNode as the a child of the root camera node.
        mNodeRootTransformCamera.getNodeJni().addChildNode(getNodeJni());
        //change the animations to affect the root camera node.
        mNodeAnimation.setNode(mNodeRootTransformCamera);
    }

    @Override
    public void onPropsSet() {
        super.onPropsSet();

        if(mNodeRootTransformCamera == null) {
            mNodeRootTransformCamera = new VRTNode(getReactContext());
        }

        mNativeCamera.setPosition(new Vector(mPosition));
        mNativeCamera.setRotationType(getRotationType());
        mNativeCamera.setFieldOfView(mFieldOfView);
        mNativeCamera.setRotation(Helper.toRadiansVector(mRotation));

    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTFlexView.java

/*

used in :

    public VRTFlexView(ReactContext context) {
        super(context);
        mDefaultMaterial = new Material();
        mDefaultMaterial.setDiffuseColor(Color.TRANSPARENT);
        getNodeJni().setHierarchicalRendering(true);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTNode.java

/*

used in :

        public NodeAnimation(ReactContext context, VRTNode parent) {
            super(context, parent);
            super.setNode(parent);
            mAnimationManager = context.getNativeModule(AnimationManager.class);
        }

    public VRTNode(ReactContext reactContext) {
        this(reactContext.getBaseContext(), null, -1, -1, reactContext);
    }

    public VRTNode(Context context, AttributeSet attrs, int defStyleAttr,
                   int defStyleRes, ReactContext reactContext) {
        super(context, attrs, defStyleAttr, defStyleRes, reactContext);
        mNodeJni = createNodeJni();

        // Create and attach callbacks.
        mComponentEventDelegate = new ComponentEventDelegate(this);
        mEventDelegateJni = new EventDelegate();
        mEventDelegateJni.setEventDelegateCallback(mComponentEventDelegate);
        mNodeJni.setEventDelegate(mEventDelegateJni);

        mNodeAnimation = new NodeAnimation(reactContext, this);

        // Default position, rotation and scale values.
        mPosition = new float[] {0, 0, 0};
        mRotation = new float[] {0, 0, 0};
        mScale = new float[] {1, 1, 1};
        mRotationPivot = new float[] {0, 0, 0};
        mScalePivot = new float[] {0, 0, 0};
    }

    public void setViroContext(ViroContext context) {
        super.setViroContext(context);
        // CCheck if this material has video materials. Reset the materials if we do.
        if (mMaterials != null) {
            boolean materialsChanged = false;
            ArrayList<Material> nativeMaterials = new ArrayList<>();
            MaterialManager materialManager = getReactContext().getNativeModule(MaterialManager.class);
            for (int i = 0; i < mMaterials.size(); i++) {
                String materialName = mMaterials.get(i).getName();
                Material nativeMaterial = materialManager.getMaterial(materialName);
                if (materialManager.isVideoMaterial(materialName)) {
                    if (!(nativeMaterial.getDiffuseTexture() instanceof VideoTexture)) {
                        // Recreate the material with the proper context.
                            MaterialManager.MaterialWrapper materialWrapper = materialManager.getMaterialWrapper(materialName);
                            VideoTexture videoTexture = new VideoTexture(context, materialWrapper.getVideoTextureURI());
                            materialWrapper.recreate(videoTexture);
                            nativeMaterial = materialWrapper.getNativeMaterial();
                            materialsChanged = true;
                    }
                }

                if (nativeMaterial == null) {
                    throw new IllegalArgumentException("Material [" + materialName + "] not found. Did you create it?");
                }

                nativeMaterials.add(nativeMaterial);
            }

            if (materialsChanged) {
                setMaterials(nativeMaterials);
            }
        }

        if (hasPhysicsBody) {
            if (mPhysicsDelegate != null) {
                mNodeJni.getPhysicsBody().setCollisionListener(mPhysicsDelegate);
            } else {
                mNodeJni.getPhysicsBody().setCollisionListener(null);
            }
        }
    }

        @Override
        public void onCollided(String collidedTag, Vector collidedPoint, Vector collidedNormal) {
            VRTComponent node = weakComponent.get();
            if (node == null){
                return;
            }

            WritableArray points = Arguments.createArray();
            points.pushDouble(collidedPoint.x);
            points.pushDouble(collidedPoint.y);
            points.pushDouble(collidedPoint.z);

            WritableArray normals = Arguments.createArray();
            normals.pushDouble(collidedNormal.x);
            normals.pushDouble(collidedNormal.y);
            normals.pushDouble(collidedNormal.z);

            WritableMap event = Arguments.createMap();
            event.putString("viroTag", collidedTag);
            event.putArray("collidedPoint", points);
            event.putArray("collidedNormal", normals);

            node.getReactContext().getJSModule(RCTEventEmitter.class).receiveEvent(
                    node.getId(),
                    ViroEvents.ON_COLLIDED,
                    event);
        }

    protected class NodeTransformDelegate implements Node.TransformListener {
        private WeakReference<VRTComponent> weakComponent;
        public NodeTransformDelegate(VRTComponent component){
            weakComponent = new WeakReference<VRTComponent>(component);
        }

        @Override
        public void onPositionUpdate(Vector pos) {
            VRTComponent node = weakComponent.get();
            if (node == null){
                return;
            }

            WritableArray position = Arguments.createArray();
            position.pushDouble(pos.x);
            position.pushDouble(pos.y);
            position.pushDouble(pos.z);

            WritableMap event = Arguments.createMap();
            event.putArray("position", position);

            node.getReactContext().getJSModule(RCTEventEmitter.class).receiveEvent(
                    node.getId(),
                    ViroEvents.ON_TRANSFORM_DELEGATE,
                    event);
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTOrbitCamera.java

/*

used in :

    public VRTOrbitCamera(ReactContext context) {
        super(context);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTPortal.java

/*

used in :

    public VRTPortal(ReactContext context) {
        super(context);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTPortalScene.java

/*

used in :

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTScene.java

/*

used in :

    public VRTScene(ReactContext reactContext) {
        super(reactContext);
        mVisible = true; // Scenes are always visible!
        mParentHasAppeared = true;
    }

    private void notifyPlatformInformation() {
        WritableMap event = Arguments.createMap();
        event.putString("platform", mPlatform);
        event.putString("headset", mHeadset);
        event.putString("controller", mController);
        WritableMap eventContainer = Arguments.createMap();
        eventContainer.putMap("platformInfoViro", event);
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_PLATFORM_UPDATE,
                eventContainer);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRT3DObject.java

/*

used in :

        public Object3dAnimation(ReactContext context, VRT3DObject parent) {
           super(context, parent);
            mNodeWeak =  new WeakReference<Node>(parent.getNodeJni());
        }

    public VRT3DObject(ReactContext reactContext) {
        super(reactContext);
        mNodeAnimation = new Object3dAnimation(reactContext, this);
        mNodeAnimation.setNode(this);
    }

    public void setSource(String source) {
        if (source == null || source.trim().isEmpty()) {
            throw new IllegalArgumentException("source is a required prop for Viro3DObject");
        }
        mSource = Helper.parseUri(source, mReactContext);
        mSourceChanged = true;
    }

    private void loadDidStart() {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_LOAD_START,
                null
        );
    }

    public void loadDidEnd() {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_LOAD_END,
                null
        );
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTAnimatedImage.java

/*

used in :

    public VRTAnimatedImage(ReactContext context) {
        super(context);
        mLatestImageTexture = null;
        mPendingTextureLoad = false;
        mPaused = false;
        mLoop = true;
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTBox.java

/*

used in :

    public VRTBox(ReactContext reactContext) {
        super(reactContext);
        mNativeBox = new Box(1, 1, 1);
        setGeometry(mNativeBox);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTControl.java

/*

used in :

    public VRTControl(ReactContext reactContext) {
        this(reactContext.getBaseContext(), null, -1, -1, reactContext);
    }

    public VRTControl(Context context, AttributeSet attrs, int defStyleAttr,
                      int defStyleRes, ReactContext reactContext) {
        super(context, attrs, defStyleAttr, defStyleRes, reactContext);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTControl.java

/*

used in :

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTGeometry.java

/*

used in :

    public VRTGeometry(ReactContext reactContext) {
        super(reactContext);
        mGeometry = new Geometry();
        super.setGeometry(mGeometry);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTImage.java

/*

used in :

    public VRTImage(ReactContext context) {
        super(context);
        mDefaultMaterial = new Material();
        mMainHandler = new Handler(Looper.getMainLooper());
        mImageNeedsDownload = false;
    }

    void imageDownloadDidStart() {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_LOAD_START,
                null
        );
    }

    void imageDownloadDidFinish() {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_LOAD_END,
                null
        );
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTParticleEmitter.java

/*

used in :

    public VRTParticleEmitter(ReactContext reactContext) {
        super(reactContext);
        mDefaultAlphaMod = new ParticleEmitter.ParticleModifierFloatArray(new float[]{1, 0, 0});
        mDefaultScaleMode = new ParticleEmitter.ParticleModifierFloatArray(new float[]{1, 1, 1});
        mDefaultRotMod = new ParticleEmitter.ParticleModifierFloatArray(new float[]{0, 0, 0});
        mDefaultColorMod = new ParticleEmitter.ParticleModifierFloatArray(new float[]{1, 1, 1});
        mDefaultVelocity = new ParticleEmitter.ParticleModifierFloatArray(new float[]{-0.5f, 1, 0}, new float[]{0.5f, 1, 0});
        mDefaultAccelerationMod = new ParticleEmitter.ParticleModifierFloatArray(new float[]{0, 0, 0});
        mMainHandler = new Handler(Looper.getMainLooper());
        mNativeQuad = new Quad(1,1, 0, 0, 1, 1);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTPolygon.java

/*

used in :

    public VRTPolygon(ReactContext reactContext) {
        super(reactContext);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTPolyline.java

/*

used in :

    public VRTPolyline(ReactContext reactContext)  {
        super(reactContext);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTQuad.java

/*

used in :

    public VRTQuad(ReactContext reactContext) {
        super(reactContext);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTSphere.java

/*

used in :

    public VRTSphere(ReactContext reactContext) {
        super(reactContext);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTText.java

/*

used in :

    public VRTText(ReactContext context) {
        super(context);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTText.java

/*

used in :

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTVideoSurface.java

/*

used in :

    public VRTVideoSurface(ReactContext reactContext) {
        super(reactContext);
    }

    private void playerBufferStart() {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_BUFFER_START,
                null);
    }

    private void playerBufferEnd() {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_BUFFER_END,
                null);
    }

    private void playerDidFinishPlaying() {
        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_FINISH,
                null);
    }

    private void playerOnUpdateTime(float currentTime, float totalTime) {
        WritableMap event = Arguments.createMap();
        event.putDouble("currentTime", (double) currentTime);
        event.putDouble("totalTime", (double) totalTime);

        mReactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                getId(),
                ViroEvents.ON_UPDATE_TIME,
                event);
    }

*/
