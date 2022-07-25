// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/bridge/ReadableMap.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT360Image.java

/*

    public void setSource(ReadableMap source) {
        mSourceMap = source;
        mImageNeedsDownload = true;
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT360ImageManager.java

/*

    @ReactProp(name = "source")
    public void setSource(VRT360Image view, ReadableMap source) {
        view.setSource(source);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT360VideoManager.java

/*

    @ReactProp(name = "source")
    public void setSource(VRT360Video view, @Nullable ReadableMap map) {
        view.setSource(map.getString("uri"));
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTBaseSound.java

/*

    public void setSource(ReadableMap source) {
        mSourceMap = source;
        mImageNeedsDownload = true;
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTLightingEnvironment.java

/*

    @ReactProp(name = "source")
    public void setSource(VRTLightingEnvironment view, ReadableMap source) {
        view.setSource(source);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTLightingEnvironmentManager.java

/*

    public void parseFromMap(ReadableMap map) {
        if (map != null && map.hasKey("delay")) {
            setDelay((float) map.getDouble("delay"));
        } else {
            setDelay(-1);
        }

        if (map != null && map.hasKey("duration")) {
            setOverrideDuration(map.getInt("duration"));
        } else {
            setOverrideDuration(-1);
        }

        if (map != null && map.hasKey("loop")) {
            setLoop(map.getBoolean("loop"));
        } else {
            setLoop(false);
        }

        if (map != null && map.hasKey("run")) {
            setRun(map.getBoolean("run"));
        } else {
            setRun(false);
        }

        if(map != null && map.hasKey("interruptible")) {
            setInterruptible(map.getBoolean("interruptible"));
        } else {
            setInterruptible(false);
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTManagedAnimation.java

/*



*/


//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSkyBox.java


/*

    public void setSource(ReadableMap source) {
        mSourceMap = source;
        mUseTextureForSkybox = (source != null);
        mSkyboxNeedsUpdate = true;
    }

    @Override
    public void onPropsSet() {
        super.onPropsSet();

        if (mSkyboxNeedsUpdate) {
            if (mUseTextureForSkybox && mSourceMap != null) {
                imageDownloadDidStart();
                ReadableMapKeySetIterator iterator = mSourceMap.keySetIterator();
                // We'll use this latch to find out when all the 6 images for the skybox have downloaded
                CountDownLatch latch = new CountDownLatch(6);

                while (iterator.hasNextKey()) {
                    String key = iterator.nextKey();
                    ReadableType type = mSourceMap.getType(key);
                    if (type.name().equals(ReadableType.Map.name())) {
                        getImageForCubeFace(key, mSourceMap.getMap(key), latch);
                    }
                }
            } else if (mColor != COLOR_NOT_SET) {
                setBackgroundCubeImageColor(mColor);
            }

            mSkyboxNeedsUpdate = false;
        }
    }


    private void getImageForCubeFace(final String cubeFaceName, ReadableMap map, final CountDownLatch latch) {
        if (map != null) {
            SkyboxImageDownloadListener listener = new SkyboxImageDownloadListener(cubeFaceName, latch);
            mDownloadListeners.add(listener);
            mImageDownloader.getImageAsync(map, listener);
        }
    }

    @Override
    public void onTearDown() {
        super.onTearDown();

        for (SkyboxImageDownloadListener listener : mDownloadListeners) {
            listener.invalidate();
        }

        if (!mImageMap.isEmpty() && mSourceMap != null) {
            ReadableMapKeySetIterator iterator = mSourceMap.keySetIterator();
            while (iterator.hasNextKey()) {
                String key = iterator.nextKey();
                mImageMap.get(key).destroy();
                mImageMap.remove(key);
            }
        }

        if (mLatestTexture != null) {
            mLatestTexture.dispose();
            mLatestTexture = null;
        }
    }

*/

/*

    @ReactProp(name = "source")
    public void setSource(VRTSkyBox view, ReadableMap source) {
        view.setSource(source);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSkyBoxManager.java

/*

    @ReactProp(name = "source")
    public void setSource(VRTSoundField sound, ReadableMap source) {
        sound.setSource(source);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSoundFieldManager.java

/*

    @ReactProp(name = "source")
    public void setSource(VRTSound sound, ReadableMap source) {
        sound.setSource(source);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSoundManager.java

/*

    @ReactProp(name = "source")
    public void setSource(VRTSpatialSoundWrapper sound, ReadableMap source) {
        sound.setSource(source);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSpatialSoundManager.java

/*

    public void setSource(ReadableMap source) {
        mInnerSound.setSource(source);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSpatialSoundWrapper.java

/*

    public void setPointCloudImage(ReadableMap pointCloudImage) {
        // If there's another download still running, invalidate it.
        if (mImageDownloadListener != null) {
            mImageDownloadListener.invalidate();
        }

        if (pointCloudImage == null) {
            ((ARScene) mNativeScene).resetPointCloudSurface();

            if (mPointCloudQuad != null) {
                mPointCloudQuad.dispose();
                mPointCloudQuad = null;
            }

            return;
        }

        final ImageDownloader downloader = new ImageDownloader(getContext());
        downloader.setTextureFormat(Texture.Format.RGBA8);

        mImageDownloadListener = new PointCloudImageDownloadListener();
        downloader.getImageAsync(pointCloudImage, mImageDownloadListener);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARScene.java

/*

    @ReactProp(name="pointCloudImage")
    public void setPointCloudImage(VRTARScene scene, ReadableMap pointCloudImage) {
        scene.setPointCloudImage(pointCloudImage);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARSceneManager.java

/*

    @ReactProp(name = "dragPlane")
    public void setDragPlane(VRTNode view, ReadableMap dragPlane) {
        view.setDragPlane(dragPlane);
    }

    @ReactProp(name = "animation")
    public void setAnimation(VRTNode view, @androidx.annotation.Nullable ReadableMap map) {
        view.setAnimation(map);
    }

    @ReactProp(name = "physicsBody")
    public void setPhysicsBody(VRTNode view, ReadableMap map) {
        view.setPhysicsBody(map);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTNode.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTNodeManager.java

/*

    public void setAnimation(ReadableMap animation) {
        mNodeAnimation.parseFromMap(animation);

        if (animation != null && animation.hasKey("name")) {
            mNodeAnimation.setAnimationName(animation.getString("name"));
        } else {
            mNodeAnimation.setAnimationName(null);
        }

        mNodeAnimation.updateAnimation();
    }

    public void setDragPlane(ReadableMap map) {
        if (isTornDown()) {
            return;
        }

        if (map.hasKey("planePoint") && map.hasKey("planeNormal")) {
            ReadableArray planePointArr = map.getArray("planePoint");
            ReadableArray planeNormalArr = map.getArray("planeNormal");
            mNodeJni.setDragPlanePoint(new Vector(
                    planePointArr.getDouble(0), planePointArr.getDouble(1), planePointArr.getDouble(2)));
            mNodeJni.setDragPlaneNormal(new Vector(
                    planeNormalArr.getDouble(0), planeNormalArr.getDouble(1), planeNormalArr.getDouble(2)));
        }

        if (map.hasKey("maxDistance")) {
            mNodeJni.setDragMaxDistance((float) map.getDouble("maxDistance"));
        }

    }

    public void setPhysicsBody(ReadableMap map) {
        // If un-setting the physicsBody, clear it from the node.
        if (map == null) {
            clearPhysicsBody();
            mPhysicsMap = map;
            return;
        }

        // Else update the current physicsBody with the new properties, recreating
        // the body if needed.
        recreatePhysicsBodyIfNeeded(map);
        updatePhysicsBodyProperties(map);
        applyForcesOnBody(map);

        // Finally save a copy of the last known set physics properties.
        mPhysicsMap = map;
    }

    private void recreatePhysicsBodyIfNeeded(ReadableMap map){
        float mass = 0;
        if (map.hasKey("mass")){
            mass = (float) map.getDouble("mass");
        }

        // Determine if the physics body type has changed
        String bodyTypeProp = map.getString("type");
        String bodyTypeCurrent = (mPhysicsMap != null && mPhysicsMap.hasKey("type")) ?
                mPhysicsMap.getString("type") : null;
        boolean hasBodyTypeChanged = bodyTypeProp != bodyTypeCurrent;
        if (bodyTypeProp != null){
            hasBodyTypeChanged = !bodyTypeProp.equals(bodyTypeCurrent);
        }

        String bodyTypeError = PhysicsBody.checkIsValidBodyType(bodyTypeProp, mass);
        if (bodyTypeError != null){
            throw new JSApplicationCausedNativeException(bodyTypeError);
        }

        PhysicsBody.RigidBodyType rigidBodyType;
        if (bodyTypeProp.equalsIgnoreCase("Dynamic")) {
            rigidBodyType = PhysicsBody.RigidBodyType.DYNAMIC;
        }
        else if (bodyTypeProp.equalsIgnoreCase("Static")) {
            rigidBodyType = PhysicsBody.RigidBodyType.STATIC;
        }
        else if (bodyTypeProp.equalsIgnoreCase("Kinematic")) {
            rigidBodyType = PhysicsBody.RigidBodyType.KINEMATIC;
        }
        else {
            throw new JSApplicationCausedNativeException("Invalid physics body type [" + bodyTypeProp + "]");
        }

        // Determine if the physics shape has changed
        ReadableMap shapeTypeProp = map.hasKey("shape") ? map.getMap("shape") : null;
        ReadableMap shapeTypeCurrent = (mPhysicsMap != null && mPhysicsMap.hasKey("shape")) ?
                mPhysicsMap.getMap("shape") : null;
        boolean hasShapeChanged = shapeTypeProp != shapeTypeCurrent;
        if (shapeTypeProp != null){
            hasShapeChanged = !shapeTypeProp.equals(shapeTypeCurrent);
        }

        // Create or update the VROPhysicsBody only if needed
        if (!hasPhysicsBody || hasBodyTypeChanged || hasShapeChanged){
            String propShapeType = null;
            float params[] = {};
            PhysicsShape shape = null;

            // Recreate a physics shape with the latest properties by grabbing
            // the current shapeType (required in JS if providing a physics shape)
            if (shapeTypeProp != null) {
                propShapeType = shapeTypeProp.getString("type");
                if (shapeTypeProp.hasKey("params")) {
                    ReadableArray readableParams = shapeTypeProp.getArray("params");
                    params = new float[readableParams.size()];
                    for (int i = 0; i < readableParams.size(); i++) {
                        params[i] = (float) readableParams.getDouble(i);
                    }
                }

                String error = PhysicsBody.checkIsValidShapeType(propShapeType, params);
                if (error != null){
                    throw new JSApplicationCausedNativeException(error);
                }

                if (propShapeType.equalsIgnoreCase("sphere")) {
                    shape = new PhysicsShapeSphere(params[0]);
                }
                else if (propShapeType.equalsIgnoreCase("box")) {
                    shape = new PhysicsShapeBox(params[0], params[1], params[2]);
                }
                else if (propShapeType.equalsIgnoreCase("compound")) {
                    shape = new PhysicsShapeAutoCompound();
                }
                else {
                    throw new JSApplicationCausedNativeException("Invalid shape type [" + propShapeType + "]");
                }
            }

            if (!hasPhysicsBody || hasBodyTypeChanged){
                clearPhysicsBody();
                createPhysicsBody(rigidBodyType, mass, shape);
            } else {
                mNodeJni.getPhysicsBody().setShape(shape);
            }
        }
    }

    private void updatePhysicsBodyProperties(ReadableMap map){
        if (map.hasKey("mass")) {
            float mass = (float)map.getDouble("mass");
            String bodyType = map.getString("type");
            String bodyTypeError = PhysicsBody.checkIsValidBodyType(bodyType, mass);
            if (bodyTypeError != null){
                throw new JSApplicationCausedNativeException(bodyTypeError);
            }
            mNodeJni.getPhysicsBody().setMass(mass);
        }

        if (map.hasKey("inertia")){
            ReadableArray paramsArray = map.getArray("inertia");
            float inertiaArray[] = new float[paramsArray.size()];
            for (int i = 0; i < paramsArray.size(); i ++){
                inertiaArray[i] = (float) paramsArray.getDouble(i);
            }

            if (inertiaArray.length != 3){
                throw new JSApplicationCausedNativeException("Incorrect parameters " +
                        "provided for inertia, expected: [x, y, z]!");
            }

            mNodeJni.getPhysicsBody().setMomentOfInertia(new Vector(inertiaArray));
        }

        if (map.hasKey("friction")) {
            mNodeJni.getPhysicsBody().setFriction((float)map.getDouble("friction"));
        }

        if (map.hasKey("restitution")) {
            mNodeJni.getPhysicsBody().setRestitution((float)map.getDouble("restitution"));
        }

        if (map.hasKey("enabled")) {
            mPhysicsEnabled = map.getBoolean("enabled");
        } else {
            mPhysicsEnabled = true;
        }
        mNodeJni.getPhysicsBody().setEnabled(shouldAppear() && mPhysicsEnabled);

        if (map.hasKey("useGravity")) {
            String bodyType = map.getString("type");
            if (!bodyType.equalsIgnoreCase("dynamic")){
                ViroLog.warn(TAG,"Attempted to set useGravity for non-dynamic phsyics bodies.");
            } else {
                mNodeJni.getPhysicsBody().setUseGravity(map.getBoolean("useGravity"));
            }
        }

        if (map.hasKey("velocity")) {
            ReadableArray paramsArray = map.getArray("velocity");
            float velocityArray[] = new float[paramsArray.size()];
            for (int i = 0; i < paramsArray.size(); i ++){
                velocityArray[i] = (float) paramsArray.getDouble(i);
            }

            if (velocityArray.length != 3){
                throw new JSApplicationCausedNativeException("Incorrect parameters " +
                        "provided for velocity, expected: [x, y, z]!");
            }

            mNodeJni.getPhysicsBody().setVelocity(new Vector(velocityArray), true);
        } else {
            mNodeJni.getPhysicsBody().setVelocity(new Vector(0, 0, 0), true);
        }
    }

    private void applyForcesOnBody(ReadableMap map){
        // Determine if the applied torque has changed
        ReadableArray torqueProp = map.hasKey("torque") ? map.getArray("torque") : null;
        boolean currentMapHasTorque = mPhysicsMap != null && mPhysicsMap.hasKey("torque");
        ReadableArray currentTorque = currentMapHasTorque ? mPhysicsMap.getArray("torque") : null;
        boolean hasTorqueChanged = torqueProp != currentTorque;
        if (torqueProp != null){
            hasTorqueChanged = !torqueProp.equals(currentTorque);
        }

        // Determine if the applied force has changed
        ArrayList<ReadableMap> forcesListProp = getForcesFromReactMap(map);
        ArrayList<ReadableMap> forcesListCurrent = getForcesFromReactMap(mPhysicsMap);
        boolean hasForceChanged = !forcesListProp.equals(forcesListCurrent);

        // If nothing has changed, return
        if (!hasForceChanged && !hasTorqueChanged){
            return;
        }

        mNodeJni.getPhysicsBody().clearForce();

        // Apply Torque
        if (map.hasKey("torque")){
            ReadableArray paramsArray = map.getArray("torque");
            float torqueArray[] = new float[paramsArray.size()];
            for (int i = 0; i < paramsArray.size(); i ++){
                torqueArray[i] = (float) paramsArray.getDouble(i);
            }

            if (torqueArray.length != 3){
                throw new JSApplicationCausedNativeException("Incorrect parameters " +
                        "provided for torque, expected: [x, y, z]!");
            }

            mNodeJni.getPhysicsBody().applyTorque(new Vector(torqueArray));
        }

        // Apply force
        for (ReadableMap forceMap : forcesListProp){
            float forceArray[];
            if (forceMap.hasKey("value")){
                ReadableArray paramsArray = forceMap.getArray("value");
                forceArray = new float[paramsArray.size()];
                for (int i = 0; i < paramsArray.size(); i ++){
                    forceArray[i] = (float) paramsArray.getDouble(i);
                }

                if (forceArray.length != 3){
                    throw new JSApplicationCausedNativeException("Incorrect parameters " +
                            "provided for force's value, expected: [x, y, z]!");
                }
            } else {
                throw new JSApplicationCausedNativeException("Incorrect parameters: missing" +
                        " value of format [x, y, z] for force!");
            }

            float positionArray[];
            if (forceMap.hasKey("position")){
                ReadableArray paramsArray = forceMap.getArray("position");
                positionArray = new float[paramsArray.size()];
                for (int i = 0; i < paramsArray.size(); i ++){
                    positionArray[i] = (float) paramsArray.getDouble(i);
                }

                if (positionArray.length != 3){
                    throw new JSApplicationCausedNativeException("Incorrect parameters " +
                            "provided for force's position, expected: [x, y, z]!");
                }
            } else {
                // Fallback to a central force if no position is provided
                positionArray = new float[]{0,0,0};
            }

            mNodeJni.getPhysicsBody().applyForce(new Vector(forceArray), new Vector(positionArray));
        }
    }

    // Parse, check and return a list of valid force props from a given Readable map.
    private ArrayList<ReadableMap> getForcesFromReactMap(ReadableMap map){
        ArrayList<ReadableMap> maps = new ArrayList<ReadableMap>();
        if (map != null && map.hasKey("force")){
            ReadableType type = map.getType("force");
            if (type.equals(ReadableType.Array)){
                ReadableArray reactForceArray = map.getArray("force");
                for (int i =0; i < reactForceArray.size(); i ++){
                    maps.add(reactForceArray.getMap(i));
                }
            } else if (type.equals(ReadableType.Map)){
                maps.add(map.getMap("force"));
            } else if (!type.equals(ReadableType.Null)) {
                throw new IllegalViewOperationException("Invalid force format!");
            }
        }
        return maps;
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTScene.java

/*

    public void getCameraPositionAsync(CameraCallback callback) {
        if (mViroContext == null || isTornDown()) {
            callback.onGetCameraOrientation(0,0,0,0,0,0,0,0,0,0,0,0);
        }
        else {
            mViroContext.getCameraOrientation(callback);
        }
    }

    public void setPhysicsWorld(ReadableMap map){
        if (map == null){
            return;
        }

        if (map.hasKey("gravity")){
            ReadableArray readableParams = map.getArray("gravity");
            if (readableParams.size() != 3){
                throw new JSApplicationCausedNativeException("Incorrect parameters provided " +
                        "for gravity, expected: [x, y, z]!");
            } else {
                float params[] = new float[readableParams.size()];
                for (int i = 0; i < readableParams.size(); i ++){
                    params[i] = (float) readableParams.getDouble(i);
                }
                mNativeScene.getPhysicsWorld().setGravity(new Vector(params));
            }
        }

        if (map.hasKey("drawBounds")) {
            mNativeScene.getPhysicsWorld().setDebugDraw(map.getBoolean("drawBounds"));
        } else {
            mNativeScene.getPhysicsWorld().setDebugDraw(false);
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTSceneManager.java

/*

    @ReactProp(name = "soundRoom")
    public void setSoundRoom(VRTScene scene, ReadableMap soundRoom) {
        scene.setSoundRoom(soundRoom);
    }

    @ReactProp(name = "physicsWorld")
    public void setPhysicsWorld(VRTScene scene, ReadableMap map) {
        scene.setPhysicsWorld(map);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRT3DObject.java

/*

    public void setAnimation(ReadableMap animation) {
        super.setAnimation(animation);
        updateAnimation();
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRT3DObjectManager.java

/*

    @ReactProp(name = "source")
    public void setSource(VRT3DObject object3d, @Nullable ReadableMap map) {
        if (!map.hasKey(URI_KEY)) {
            throw new IllegalArgumentException("Unable to find \"uri\" key in given source map.");
        }

        object3d.setSource(map.getString(URI_KEY));
    }

    @ReactProp(name = "resources")
    public void setResources(VRT3DObject object3d, @Nullable ReadableArray resources) {
        List<String> resourceList = null;
        if (resources != null) {
            resourceList = new ArrayList<>();
            for (int i = 0; i < resources.size(); i++) {
                ReadableMap resourceMap = resources.getMap(i);
                if (!resourceMap.hasKey(URI_KEY)) {
                    throw new IllegalArgumentException("Received object resource map without URI key.");
                }
                resourceList.add(resourceMap.getString(URI_KEY));
            }
        }
        object3d.setResources(resourceList);
    }

    @ReactProp(name = "morphTargets")
    public void setMorphTargets(VRT3DObject object3d, @Nullable ReadableArray targets) {
        if (targets == null || targets.size() <=0) {
            return;
        }

        List<Pair<String, Float>> targetList = new ArrayList<>();
        for (int i = 0; i < targets.size(); i++) {
            ReadableMap resourceMap = targets.getMap(i);
            if (!resourceMap.hasKey("target") || !resourceMap.hasKey("weight")) {
                throw new IllegalArgumentException("Received invalid morph target map.");
            }

            String key = resourceMap.getString("target");
            Float weight = new Float(resourceMap.getDouble("weight"));
            targetList.add(new Pair<String, Float>(key, weight));
        }
        object3d.setMorphTargets(targetList);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTAnimatedImageManager.java

/*

    @ReactProp(name = "source")
    public void setSource(VRTAnimatedImage view, ReadableMap map) {
        view.setSource(map);
    }

    @ReactProp(name = "placeholderSource")
    public void setPlaceholderSource(VRTAnimatedImage view, ReadableMap map) {
        view.setPlaceholderSource(map);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTImage.java

/*

    public void setSource(ReadableMap source) {
        mSourceMap = source;
        mImageNeedsDownload = true;
    }

    public void setPlaceholderSource(ReadableMap placeholderSource) {
        if (placeholderSource == null) {
            ViroLog.warn(TAG, "PlaceholderSource shouldn't be null. We should've provided a default.");
        }
        mPlaceholderSourceMap = placeholderSource;
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTImageManager.java

/*

    @ReactProp(name = "source")
    public void setSource(VRTImage view, ReadableMap map) {
        view.setSource(map);
    }

    @ReactProp(name = "placeholderSource")
    public void setPlaceholderSource(VRTImage view, ReadableMap map) {
        view.setPlaceholderSource(map);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTParticleEmitter.java

/*

    public void setImage(ReadableMap image) {
        mImage = image;
        mImageNeedsUpdate = true;
    }
    
    // Emitter modifier properties affecting appearance, movement and spawning behavior.

    public void setSpawnBehavior(ReadableMap spawn) {
        mSpawnBehavior = spawn;
        mEmitterNeedsRestart = true;
    }

    public void setParticleAppearance(ReadableMap appearance) {
        mParticleAppearance = appearance;
        mEmitterNeedsRestart = true;
    }

    public void setParticlePhysics(ReadableMap physics) {
        mParticlePhysics = physics;
        mEmitterNeedsRestart = true;
    }

    @Override
    public void setViroContext(ViroContext context) {
        super.setViroContext(context);

        // Refresh the emitter when a new render context is set
        if (mNativeEmitter == null){
            onPropsSet();
        }
    }

    private void downloadImageIfNeeded(){
        ReadableMap imageMap = mImage.getMap("source");
        String imageUri = imageMap.getString("uri");

        // Return if nothing has changed.
        if ((mCurrentImageUri != null && imageUri != null && mCurrentImageUri.equals(imageUri))
                || (mCurrentImageUri == null && imageUri == null)){
            return;
        }

        mCurrentImageUri = imageUri;

        final ImageDownloader downloader = new ImageDownloader(getContext());
        if (mCurrentImageUri != null){
            mImageDownloadListener = new ImageParticleDownloadListener();
            downloader.getImageAsync(imageMap, mImageDownloadListener);
        } else {
            mImageDownloadListener.invalidate();
            mImageDownloadListener = null;
        }
    }

    private void updateSpawnModifier(){
        if (mSpawnBehavior == null){
            mNativeEmitter.setEmissionRatePerSecond(DEFAULT_SPAWN_RATE_SEC, DEFAULT_SPAWN_RATE_SEC);
            mNativeEmitter.setEmissionRatePerMeter(DEFAULT_SPAWN_RATE_METER, DEFAULT_SPAWN_RATE_METER);
            mNativeEmitter.setParticleLifetime(DEFAULT_PARTICLE_LIFETIME, DEFAULT_PARTICLE_LIFETIME);
            mNativeEmitter.setMaxParticles(DEFAULT_MAX_PARTICLE);
            mNativeEmitter.setEmissionBursts(new ArrayList<ParticleEmitter.EmissionBurst>());
            mNativeEmitter.setSpawnVolume(new ParticleEmitter.SpawnVolumePoint(new Vector(0, 0, 0)), false);
            return;
        }

        if (mSpawnBehavior.hasKey("emissionRatePerSecond")){
            ReadableArray readableParams = mSpawnBehavior.getArray("emissionRatePerSecond");
            int params[] = new int[readableParams.size()];
            for (int i = 0; i < readableParams.size(); i++) {
                params[i] = readableParams.getInt(i);
            }

            if (params.length != 2){
                onError("Invalid Emission Rate Per Second parameters, expected a [min, max]!");
                return;
            }

            mNativeEmitter.setEmissionRatePerSecond(params[0], params[1]);
        } else {
            mNativeEmitter.setEmissionRatePerSecond(DEFAULT_SPAWN_RATE_SEC, DEFAULT_SPAWN_RATE_SEC);
        }

        if (mSpawnBehavior.hasKey("emissionRatePerMeter")){
            ReadableArray readableParams = mSpawnBehavior.getArray("emissionRatePerMeter");
            int params[] = new int[readableParams.size()];
            for (int i = 0; i < readableParams.size(); i++) {
                params[i] = readableParams.getInt(i);
            }

            if (params.length != 2){
                onError("Invalid Emission Rate Per Metter parameters, expected a [min, max]!");
                return;
            }

            mNativeEmitter.setEmissionRatePerMeter(params[0], params[1]);
        } else {
            mNativeEmitter.setEmissionRatePerMeter(DEFAULT_SPAWN_RATE_METER, DEFAULT_SPAWN_RATE_METER);
        }

        if (mSpawnBehavior.hasKey("particleLifetime")){
            ReadableArray readableParams = mSpawnBehavior.getArray("particleLifetime");
            int params[] = new int[readableParams.size()];
            for (int i = 0; i < readableParams.size(); i++) {
                params[i] = readableParams.getInt(i);
            }

            if (params.length != 2){
                onError("Invalid particle lifetime parameters, expected a [min, max]!");
                return;
            }

            mNativeEmitter.setParticleLifetime(params[0], params[1]);
        } else {
            mNativeEmitter.setParticleLifetime(DEFAULT_PARTICLE_LIFETIME, DEFAULT_PARTICLE_LIFETIME);
        }

        if (mSpawnBehavior.hasKey("maxParticles")){
            int maxParticles = mSpawnBehavior.getInt("maxParticles");
            mNativeEmitter.setMaxParticles(maxParticles);
        } else {
            mNativeEmitter.setMaxParticles(DEFAULT_MAX_PARTICLE);
        }

        // Set emission bursts values.
        ArrayList<ParticleEmitter.EmissionBurst> bursts = new ArrayList<ParticleEmitter.EmissionBurst>();
        if (mSpawnBehavior.hasKey("emissionBurst")) {
            ReadableArray burstArray = mSpawnBehavior.getArray("emissionBurst");
            for (int i = 0; i < burstArray.size(); i++) {
                ReadableMap burstmap = burstArray.getMap(i);

                ParticleEmitter.Factor referenceFactor;
                float valueStart;
                float coolPeriod;
                int min, max;
                int cycles;
                if (burstmap.hasKey("time")) {
                    referenceFactor = ParticleEmitter.Factor.TIME;
                    valueStart = (float) burstmap.getDouble("time");
                    coolPeriod = (float) (burstmap.hasKey("cooldownPeriod") ? burstmap.getDouble("cooldownPeriod") : 0);
                } else if (burstmap.hasKey("distance")) {
                    referenceFactor = ParticleEmitter.Factor.DISTANCE;
                    valueStart = (float) burstmap.getDouble("distance");
                    coolPeriod = (float) (burstmap.hasKey("cooldownDistance") ? burstmap.getDouble("cooldownDistance") : 0);
                } else {
                    onError("Invalid Burst parameters provided!");
                    return;
                }

                min = burstmap.hasKey("min") ? burstmap.getInt("min") : 0;
                max = burstmap.hasKey("max") ? burstmap.getInt("max") : 0;
                cycles = burstmap.hasKey("cycles") ? burstmap.getInt("cycles") : 0;

                ParticleEmitter.EmissionBurst burst = new ParticleEmitter.EmissionBurst(referenceFactor,
                        valueStart, min, max, cycles, coolPeriod);
                bursts.add(burst);
            }
        }
        mNativeEmitter.setEmissionBursts(bursts);

        // Set Spawn Volume values.
        ParticleEmitter.SpawnVolume volume = new ParticleEmitter.SpawnVolumePoint(new Vector(0, 0, 0));
        if (mSpawnBehavior.hasKey("spawnVolume")) {
            ReadableMap spawnVolume = mSpawnBehavior.getMap("spawnVolume");

            if (!spawnVolume.hasKey("shape")){
                onError("Viro: Spawn Volume missing required shape parameter!");
                return;
            }

            String stringShapeName = spawnVolume.getString("shape").toLowerCase();
            boolean spawnOnSurface = spawnVolume.hasKey("spawnOnSurface") ?
                    spawnVolume.getBoolean("spawnOnSurface") : false;

            ReadableArray vecParamsReadableArray = spawnVolume.getArray("params");
            float shapeParams[] = null;
            if (vecParamsReadableArray != null){
                shapeParams = new float[vecParamsReadableArray.size()];
                for (int vecIndex = 0; vecIndex < vecParamsReadableArray.size(); vecIndex++) {
                    shapeParams[vecIndex] = (float) vecParamsReadableArray.getDouble(vecIndex);
                }
            }

            if (!stringShapeName.equals("box")
                    && !stringShapeName.equals("sphere") && !stringShapeName.equals("point")){
                onError("Viro: Invalid spawn shape provided for particle burst parameter!");
                return;
            }

            if (stringShapeName.equals("box")) {
                if (shapeParams != null && shapeParams.length == 3) {
                    volume = new ParticleEmitter.SpawnVolumeBox(shapeParams[0], shapeParams[1], shapeParams[2]);
                }
            }
            else if (stringShapeName.equals("sphere")) {
                if (shapeParams != null) {
                    if (shapeParams.length == 1) {
                        volume = new ParticleEmitter.SpawnVolumeSphere(shapeParams[0]);
                    }
                    else if (shapeParams.length == 3) {
                        volume = new ParticleEmitter.SpawnVolumeEllipsoid(shapeParams[0], shapeParams[1], shapeParams[2]);
                    }
                }
            }
            else if (stringShapeName.equals("point")) {
                if (shapeParams != null && shapeParams.length == 3) {
                    volume = new ParticleEmitter.SpawnVolumePoint(new Vector(shapeParams[0], shapeParams[1], shapeParams[2]));
                }
            }

            mNativeEmitter.setSpawnVolume(volume, spawnOnSurface);
        } else {
            // set point as default shape
            mNativeEmitter.setSpawnVolume(volume, false);
        }
    }

    private void updatePhysicsModifier(){
        ParticleEmitter.ParticleModifier velocityMod = null;
        ParticleEmitter.ParticleModifier accelerationMod = null;

        if (mParticlePhysics != null){
            velocityMod = getModifier(mParticlePhysics, "velocity", true, false, false);
            accelerationMod = getModifier(mParticlePhysics, "acceleration", true, false, false);
        }

        velocityMod = velocityMod == null ? mDefaultVelocity : velocityMod;
        accelerationMod = accelerationMod == null ? mDefaultAccelerationMod : accelerationMod;

        // Set modifiers
        mNativeEmitter.setVelocityModifierLegacy(velocityMod);
        mNativeEmitter.setAccelerationModifierLegacy(accelerationMod);

        // Update explosive impulses
        if (mParticlePhysics != null && mParticlePhysics.hasKey("explosiveImpulse")) {
            ReadableMap map = mParticlePhysics.getMap("explosiveImpulse");

            if (!map.hasKey("position") || !map.hasKey("impulse")){
                onError("Viro: Missing required explosion impulse force and location for emitter!");
                return;
            }

            // Grab the position from which to perform detonation calculations.
            ReadableArray readableParams = map.getArray("position");
            if (readableParams.size() != 3) {
                onError("Property position for explosiveImpulse requires an array of 3 values.");
                return;
            }
            float explodePosition[] = new float[readableParams.size()];
            for (int i = 0; i < readableParams.size(); i++) {
                explodePosition[i] = (float) readableParams.getDouble(i);
            }

            // Grab the explosive impulse force to apply
            float explodeImpulse = (float) map.getDouble("impulse");

            // Grab reverse accleration if provided.
            float reverseAccel;
            if (map.hasKey("decelerationPeriod")) {
                reverseAccel = (float) map.getDouble("decelerationPeriod");
            } else {
                reverseAccel = -1;
            }
            mNativeEmitter.setExplosiveImpulse(explodeImpulse, new Vector(explodePosition), reverseAccel);
        } else {
            mNativeEmitter.setExplosiveImpulse(-1, new Vector(0, 0 ,0), -1);
        }
    }

    private ParticleEmitter.ParticleModifier getModifier(ReadableMap appearanceMap,
                                                            String property, boolean isVec3,
                                                            boolean isColor, boolean isFloat){
        if (!appearanceMap.hasKey(property)){
            return null;
        }

        final ReadableMap map = appearanceMap.getMap(property);

        // Both [min, max] initial values are required for particle modifiers.
        if (!map.hasKey("initialRange") || map.getArray("initialRange").size() != 2){
            onError("Incorrect parameters provided for the intervalRange on "+ property+", expected: [min, max]!");
            return null;
        }

        float initialRange[][] = getValueArrayFromDict(map, "initialRange", isVec3, isColor, isFloat);
        float interpolatedIntervals[][] = null;
        float interpolatedPoints[][] = null;

        if (initialRange == null){
            onError("Incorrect parameters provided for InitialRange!");
            return null;
        }

        // Parse out the interpolation data
        if (map.hasKey("interpolation")){
            ReadableArray interpolatedArray = map.getArray("interpolation");
            interpolatedIntervals = new float[interpolatedArray.size()][2];
            interpolatedPoints = new float[interpolatedArray.size()][3];

            for (int i = 0; i < interpolatedArray.size(); i ++){
                ReadableMap interpolatePoint = interpolatedArray.getMap(i);

                // Grab the interval representing this interpolation frame
                ReadableArray intervalArrayReadable = interpolatePoint.getArray("interval");
                if (intervalArrayReadable.size() != 2){
                    onError("Invalid interval provided for " + property + "! Expected a [max, min].");
                    return null;
                }
                float interval[] = new float[2];
                interval[0] = (float) intervalArrayReadable.getDouble(0);
                interval[1] = (float) intervalArrayReadable.getDouble(1);

                // Grab the targeted value to interpolate towards
                float[] value = getVecValueFromDict(interpolatePoint, "endValue", isVec3, isColor, isFloat);

                interpolatedIntervals[i] = interval;
                interpolatedPoints[i] = value;
            }
        }

        // Set the modifier on this emitter through JNI
        ParticleEmitter.Factor factor = map.hasKey("factor") ?
                ParticleEmitter.Factor.valueFromString(map.getString("factor")) :
                ParticleEmitter.Factor.TIME;
        return new ParticleEmitter.ParticleModifierFloatArray(factor, initialRange, interpolatedIntervals, interpolatedPoints);
    }

    private float[][] getValueArrayFromDict(ReadableMap map, String key,
                                          boolean isVec3, boolean isColor, boolean isFloat){
        if (!map.hasKey(key)){
            onError("Attempted to read an invalid property: " + key);
            return null;
        }

        ReadableArray valuesReadableArray = map.getArray(key);
        float[][] returnList = new float [valuesReadableArray.size()][3];
        for (int i = 0; i < valuesReadableArray.size(); i ++){
            if (isVec3){
                ReadableArray vecParamsReadableArray = valuesReadableArray.getArray(i);
                float vecParams[] = new float[vecParamsReadableArray.size()];
                for (int vecIndex = 0; vecIndex < vecParamsReadableArray.size(); vecIndex++) {
                    vecParams[vecIndex] = (float) vecParamsReadableArray.getDouble(vecIndex);
                }

                if (vecParams.length != 3){
                    onError("Property: " + key + " requires an array of 3 values.");
                    return null;
                } else {
                    returnList[i] = vecParams;
                }
            }

            if (isColor){
                int colorInt = valuesReadableArray.getInt(i);
                returnList[i] = new float[]{Color.red(colorInt), Color.green(colorInt), Color.blue(colorInt)};
            }

            if (isFloat){
                float value = (float)valuesReadableArray.getDouble(i);
                returnList[i] = new float[]{value, 0, 0};
            }
        }

        return returnList;
    }

    private float[] getVecValueFromDict(ReadableMap map, String key,
                                        boolean isVec3, boolean isColor, boolean isFloat){
        if (!map.hasKey(key)){
            onError("Attempted to read an invalid property: " + key);
            return new float[]{0,0,0};
        }

        if (isVec3){
            ReadableArray readableParams = map.getArray(key);
            float params[] = new float[readableParams.size()];
            for (int i = 0; i < readableParams.size(); i++) {
                params[i] = (float) readableParams.getDouble(i);
            }

            if (params.length != 3){
                onError("Property: " + key + " requires an array of 3 values.");
                return new float[]{0,0,0};
            }

            return params;
        }

        if (isColor){
            int colorInt = map.getInt(key);
            return new float[]{Color.red(colorInt), Color.green(colorInt), Color.blue(colorInt)};
        }

        if (isFloat){
            float value = (float)map.getDouble(key);
            return new float[]{value, 0, 0};
        }

        onError("In correct data type provided for property: " + key);
        return new float[]{0,0,0};
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTParticleEmitterManager.java

/*

    @ReactProp(name = "image")
    public void setImage(VRTParticleEmitter emitter, ReadableMap map) {
        emitter.setImage(map);
    }

    @ReactProp(name = "spawnBehavior")
    public void setSpawnBehavior(VRTParticleEmitter emitter, ReadableMap map) {
        emitter.setSpawnBehavior(map);
    }

    @ReactProp(name = "particleAppearance")
    public void setParticleAppearance(VRTParticleEmitter emitter, ReadableMap map) {
        emitter.setParticleAppearance(map);
    }

    @ReactProp(name = "particlePhysics")
    public void setParticlePhysics(VRTParticleEmitter emitter, ReadableMap map) {
        emitter.setParticlePhysics(map);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTText.java

/*

    public void setOuterStroke(ReadableMap map) {
        if (map != null && map.hasKey("type")) {
            mOuterStroke = Text.OuterStroke.valueFromString(map.getString("type"));
        } else {
            mOuterStroke = DEFAULT_OUTER_STROKE;
        }
        if (map != null && map.hasKey("width")) {
            mOuterStrokeWidth = map.getInt("width");
        } else {
            mOuterStrokeWidth = DEFAULT_OUTER_STROKE_WIDTH;
        }
        if (map != null && map.hasKey("color")) {
            mOuterStrokeColor = (map.getInt("color"));
        } else {
            mOuterStrokeColor = DEFAULT_OUTER_STROKE_COLOR;
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTTextManager.java

/*

    @ReactProp(name = "outerStroke")
    public void setOuterStroke(VRTText text, @androidx.annotation.Nullable ReadableMap map) {
        text.setOuterStroke(map);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTVideoSurfaceManager.java

/*

    @ReactProp(name = "source")
    public void setSource(VRTVideoSurface view, @Nullable ReadableMap map) {
        // TODO: verify/make sure this work with local files (ie. release builds)
        view.setSource(map.getString("uri"));
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\AnimationManager.java
//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ARSceneNavigatorModule.java

/*

    @ReactMethod
    public void setWorldOrigin(final int sceneNavTag, final ReadableMap worldOrigin) {
        // no-op
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ARTrackingTargetsModule.java

/*

    @ReactMethod
    public void setJSAnimations(ReadableMap animationsMap) {
        mRawAnimations = animationsMap;
        parseAnimations();
    }

    private void parseAnimations() {
        ReadableMapKeySetIterator iter = mRawAnimations.keySetIterator();
        while(iter.hasNextKey()) {
            String animationName = iter.nextKey();
            ExecutableAnimation animation = parseAnimationObjectHelper(animationName, ExecutionType.PARALLEL);
            sParsedAnimations.put(animationName, animation);
            ViroLog.debug(TAG, "Parsed animation: [" + animationName + "]");
        }
    }

    private ExecutableAnimation parseAnimationObject(ReadableMap animationMap, ExecutionType executionType) {
        return parseAnimationMap(animationMap);
    }

    private ExecutableAnimation parseAnimationMap(ReadableMap animationMap) {
        ReadableMap propertyMap = animationMap.getMap("properties");
        String positionX = getFloatPropertyAsString(propertyMap, "positionX");
        String positionY = getFloatPropertyAsString(propertyMap, "positionY");
        String positionZ = getFloatPropertyAsString(propertyMap, "positionZ");
        String scaleX = getFloatPropertyAsString(propertyMap, "scaleX");
        String scaleY = getFloatPropertyAsString(propertyMap, "scaleY");
        String scaleZ = getFloatPropertyAsString(propertyMap, "scaleZ");
        String rotateX = getFloatPropertyAsString(propertyMap, "rotateX");
        String rotateY = getFloatPropertyAsString(propertyMap, "rotateY");
        String rotateZ = getFloatPropertyAsString(propertyMap, "rotateZ");
        String opacity = getFloatPropertyAsString(propertyMap, "opacity");
        String color = getIntPropertyAsString(propertyMap, "color");

        LazyMaterial lazyMaterial = null;

        // Currently we only support animating the index 0 material.
        if (propertyMap.hasKey("material")) {
            String material = propertyMap.getString("material");
            MaterialManager materialManager = getReactApplicationContext().getNativeModule(MaterialManager.class);
            lazyMaterial = new LazyMaterialReact(material, materialManager);
        }

        float durationMilliseconds = (float) getPropertyAsDouble(animationMap, "duration");
        float delayMilliseconds = (float) getPropertyAsDouble(animationMap, "delay");

        float durationSeconds = durationMilliseconds == Double.MIN_VALUE ? 0 : durationMilliseconds / 1000f;
        float delaySeconds = delayMilliseconds == Double.MIN_VALUE ? 0 : delayMilliseconds / 1000f;

        String functionType = getFloatPropertyAsString(animationMap, "easing");
        if (functionType == null) {
            functionType = "Linear";
        }
        return new AnimationGroup(positionX, positionY, positionZ,
                scaleX, scaleY, scaleZ, rotateX, rotateY, rotateZ,
                opacity, color, lazyMaterial, durationSeconds, delaySeconds, functionType);
    }

    
     * This method tries to return the floating-point property pointed to by the key as a String from the map.
     * @param map the property map
     * @param key the key of the property we want
     * @return a String or null
     
    private String getFloatPropertyAsString(ReadableMap map, String key) {
        if (map.hasKey(key)) {
            if (map.getType(key) == ReadableType.String) {
                return map.getString(key);
            } else if (map.getType(key) == ReadableType.Number) {
                return Double.toString(map.getDouble(key));
            }
        }
        return null;
    }

    
     * This method tries to return the int property pointed to by the key as a String from the map.
     * @param map the property map
     * @param key the key of the property we want
     * @return a String or null
     
    private String getIntPropertyAsString(ReadableMap map, String key) {
        if (map.hasKey(key)) {
            if (map.getType(key) == ReadableType.String) {
                return map.getString(key);
            } else if (map.getType(key) == ReadableType.Number) {
                return Integer.toString(map.getInt(key));
            }
        }
        return null;
    }

    
     * This method tries to return the property pointed to by the key as a double from the map.
     *
     * @param map the property map
     * @param key the key of the property we want
     * @return a double or MIN_VALUE denoting that we didn't find the key/value pair.
     
    private double getPropertyAsDouble(ReadableMap map, String key) {
        if (map.hasKey(key) && map.getType(key) == ReadableType.Number) {
            return map.getDouble(key);
        }
        return Double.MIN_VALUE;
    }


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\MaterialManager.java

/*

        public ARTargetPromise(String key, ReadableMap source,
                               ARImageTarget.Orientation orientation, float physicalWidth) {
            mKey = key;
            mSource = source;
            mOrientation = orientation;
            mPhysicalWidth = physicalWidth;
            mReady = false;
            mPromiseListeners = new ArrayList<>();
        }

    @ReactMethod
    public void createTargets(final ReadableMap targetsMap) {
        ReadableMapKeySetIterator iter = targetsMap.keySetIterator();
        while (iter.hasNextKey()) {
            String key = iter.nextKey();
            ReadableMap targetMap = targetsMap.getMap(key);

            if (targetMap.hasKey("type") && targetMap.getString("type").equalsIgnoreCase("Object")) {
                // don't do anything for "Object" targets now
                continue;
            }

            if (!targetMap.hasKey("physicalWidth")) {
                throw new IllegalArgumentException("ARTrackingTargets - image target [" + key
                        + "] is missing `physicalWidth` prop.");
            }
            float physicalWidth = (float) targetMap.getDouble("physicalWidth");

            if (!targetMap.hasKey("orientation")) {
                throw new IllegalArgumentException("ARTrackingTargets - image target [" + key
                        + "] is missing `orientation` prop.");
            }
            String orientationValue = targetMap.getString("orientation");
            ARImageTarget.Orientation orientation =
                    ARImageTarget.Orientation.valueFromString(orientationValue);

            if (orientation == null) {
                throw new IllegalArgumentException("ARTrackingTargets - target [" + key
                        + "] has invalid orientation value [" + orientationValue + "]");
            }

            if (!targetMap.hasKey("source")) {
                throw new IllegalArgumentException("ARTrackingTargets - target [" + key
                        + "] is missing `source` prop.");
            }

            ReadableMap source = targetMap.getMap("source");

            ARTargetPromise promise = new ARTargetPromise(key, source, orientation, physicalWidth);
            promise.fetch(getReactApplicationContext());

            sPromiseMap.put(key, promise);
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\NodeModule.java

// import com.facebook.react.bridge.ReadableMap;


/*

    @ReactMethod
    public void setJSMaterials(ReadableMap newMaterials) {
        loadMaterials(newMaterials);
    }

    private void loadMaterials(ReadableMap newMaterials) {
        ReadableMapKeySetIterator iter = newMaterials.keySetIterator();
        while (iter.hasNextKey()) {
            String key = iter.nextKey();
            ReadableMap material = newMaterials.getMap(key);
            MaterialWrapper materialWrapper = createMaterial(key, material);
            sMaterialsMap.put(key, materialWrapper);
        }
    }

    private MaterialWrapper createMaterial(String materialName, ReadableMap materialMap) {
        return createMaterial(materialName, materialMap, null);
    }

    private MaterialWrapper createMaterial(String materialName, ReadableMap materialMap, VideoTexture videoTexture) {
        MaterialWrapper materialWrapper = new MaterialWrapper(materialName, materialMap);

        // These defaults match those in the JNI's Material.java
        Material.LightingModel lightingModel = Material.LightingModel.CONSTANT;
        int diffuseColor = Color.WHITE;
        int chromaKeyFilteringColor = Color.GREEN;
        boolean chromaFilteringEnabled = false;
        Texture diffuseTexture = null;
        float diffuseIntensity = 1.0f;
        Texture specularTexture = null;
        float shininess = 2.0f;
        float fresnelExponent = 1.0f;
        Texture normalMap = null;
        Material.CullMode cullMode = Material.CullMode.BACK;
        Material.TransparencyMode transparencyMode= Material.TransparencyMode.A_ONE;
        Material.BlendMode blendMode = Material.BlendMode.ALPHA;
        EnumSet<Material.ColorWriteMask> colorWriteMask = EnumSet.of(Material.ColorWriteMask.ALL);
        float bloomThreshold = -1.0f;
        boolean writesToDepthBuffer = true;
        boolean readsFromDepthBuffer = true;

        ReadableMapKeySetIterator iter = materialMap.keySetIterator();
        while(iter.hasNextKey()) {
            final String materialPropertyName = iter.nextKey();

            boolean isPbrProperty = false;
            for (PBRProperties property : PBRProperties.values()){
                if (property.key.equalsIgnoreCase(materialPropertyName)){
                    isPbrProperty = true;
                    break;
                }
            }
            if (isPbrProperty) {
                continue;
            }

            if (materialPropertyName.endsWith("texture") || materialPropertyName.endsWith("Texture")) {
                if (materialPropertyName.equalsIgnoreCase("reflectiveTexture")) {
                    Texture nativeTexture = createTextureCubeMap(materialMap.getMap(materialPropertyName), Texture.Format.RGBA8);
                    // TODO Reflective texture are unsupported currently
                    continue;
                }

                String path = parseImagePath(materialMap, materialPropertyName);
                String type = parseAssetType(materialMap, materialPropertyName);
                Texture.Format format = parseImageFormat(materialMap, materialPropertyName);
                boolean mipmap = parseImageMipmap(materialMap, materialPropertyName);
                boolean sRGB = !materialPropertyName.startsWith("normal");

                Uri uri = Helper.parseUri(path, mContext);
                if (path != null) {
                    if (isVideoTexture(path, type)) {
                        materialWrapper.addVideoTexturePath(materialPropertyName, uri);
                        diffuseTexture = videoTexture;
                    } else {
                        if (sImageMap.get(materialPropertyName) != null) {
                            Texture texture = parseTexture(sImageMap.get(materialPropertyName), sRGB, mipmap,
                                    materialPropertyName, materialMap);
                            if (materialPropertyName.equalsIgnoreCase("diffuseTexture")) {
                                diffuseTexture = texture;
                            }
                            else if (materialPropertyName.equalsIgnoreCase("specularTexture")) {
                                specularTexture = texture;
                            }
                            else if (materialPropertyName.equalsIgnoreCase("normalTexture")) {
                                normalMap = texture;
                            }
                            else {
                                throw new IllegalArgumentException("Invalid texture property received: " + materialPropertyName);
                            }
                        } else {
                            ImageDownloader downloader = new ImageDownloader(mContext);
                            downloader.setTextureFormat(format);

                            Bitmap imageBitmap = downloader.getImageSync(uri);
                            if (imageBitmap != null) {
                                Image nativeImage = new Image(imageBitmap, format);
                                Texture texture = parseTexture(nativeImage, sRGB, mipmap,
                                        materialPropertyName, materialMap);
                                if (materialPropertyName.equalsIgnoreCase("diffuseTexture")) {
                                    diffuseTexture = texture;
                                }
                                else if (materialPropertyName.equalsIgnoreCase("specularTexture")) {
                                    specularTexture = texture;
                                }
                                else if (materialPropertyName.equalsIgnoreCase("normalTexture")) {
                                    normalMap = texture;
                                }
                                else {
                                    throw new IllegalArgumentException("Invalid texture property received: " + materialPropertyName);
                                }
                            }
                        }
                    }
                }
            } else if (materialPropertyName.endsWith("color") || materialPropertyName.endsWith("Color")) {
                int color = materialMap.getInt(materialPropertyName);
                if (materialPropertyName.equalsIgnoreCase("diffuseColor")) {
                    diffuseColor = color;
                }
                else if(materialPropertyName.equalsIgnoreCase("chromaKeyFilteringColor")) {
                    chromaKeyFilteringColor = color;
                    chromaFilteringEnabled = true;
                }
                else {
                    throw new IllegalArgumentException("Invalid color property for material: " + materialPropertyName);
                }
            } else {
                if ("shininess".equalsIgnoreCase(materialPropertyName)) {
                    shininess = (float)materialMap.getDouble(materialPropertyName);
                } else if ("fresnelExponent".equalsIgnoreCase(materialPropertyName)) {
                    fresnelExponent = (float)materialMap.getDouble(materialPropertyName);
                } else if ("lightingModel".equalsIgnoreCase(materialPropertyName)) {
                    lightingModel = Material.LightingModel.valueFromString(materialMap.getString(materialPropertyName));
                } else if ("blendMode".equalsIgnoreCase(materialPropertyName)) {
                    blendMode = Material.BlendMode.valueFromString(materialMap.getString(materialPropertyName));
                } else if ("transparencyMode".equalsIgnoreCase(materialPropertyName)) {
                    transparencyMode = Material.TransparencyMode.valueFromString(materialMap.getString(materialPropertyName));
                } else if ("writesToDepthBuffer".equalsIgnoreCase(materialPropertyName)) {
                    writesToDepthBuffer = materialMap.getBoolean(materialPropertyName);
                } else if ("readsFromDepthBuffer".equalsIgnoreCase(materialPropertyName)) {
                    readsFromDepthBuffer = materialMap.getBoolean(materialPropertyName);
                } else if ("colorWriteMask".equalsIgnoreCase(materialPropertyName)) {
                    ReadableArray colorWriteArray = materialMap.getArray(materialPropertyName);
                    List<Material.ColorWriteMask> colorWriteList = new ArrayList<Material.ColorWriteMask>();
                    for (int c = 0; c < colorWriteArray.size(); c++) {
                        colorWriteList.add(Material.ColorWriteMask.valueFromString(colorWriteArray.getString(c)));
                    }

                    colorWriteMask = EnumSet.noneOf(Material.ColorWriteMask.class);
                    colorWriteMask.addAll(colorWriteList);
                } else if ("cullMode".equalsIgnoreCase(materialPropertyName)) {
                    cullMode = Material.CullMode.valueFromString(materialMap.getString(materialPropertyName));
                } else if ("diffuseIntensity".equalsIgnoreCase(materialPropertyName)) {
                    diffuseIntensity = (float)materialMap.getDouble(materialPropertyName);
                } else if ("bloomThreshold".equalsIgnoreCase(materialPropertyName)) {
                    bloomThreshold = (float)materialMap.getDouble(materialPropertyName);
                }
            }
        }

        Material nativeMaterial = new Material(lightingModel, diffuseColor, diffuseTexture,
                diffuseIntensity, specularTexture, shininess, fresnelExponent, normalMap,
                cullMode, transparencyMode, blendMode, bloomThreshold, writesToDepthBuffer,
                readsFromDepthBuffer, colorWriteMask);

                nativeMaterial.setName(materialName);
        if (chromaFilteringEnabled) {
            nativeMaterial.setChromaKeyFilteringEnabled(chromaFilteringEnabled);
            nativeMaterial.setChromaKeyFilteringColor(chromaKeyFilteringColor);
        }

        materialWrapper.setNativeMaterial(nativeMaterial);

        // Parse stuff
        parsePBRProperties(PBRProperties.METALNESS, nativeMaterial, materialMap);
        parsePBRProperties(PBRProperties.ROUGHNESS, nativeMaterial, materialMap);
        parsePBRProperties(PBRProperties.AMBIENT_OCCLUSION_TEXTURE, nativeMaterial, materialMap);

        // We don't need to hold a Java texture reference after assigning the texture to the material.
        // Make an exception for the videoTexture as we use the nativeref to play,pause, loop the video.
        if (diffuseTexture != null && videoTexture == null) {
            diffuseTexture.dispose();
        }
        if (specularTexture != null) {
            specularTexture.dispose();
        }
        if (normalMap != null) {
            normalMap.dispose();
        }
        return materialWrapper;
    }

    private void parsePBRProperties(PBRProperties property, Material material, ReadableMap materialMap) {
        String key = property.key;
        if (!materialMap.hasKey(key)) {
            return;
        }

        if (key.endsWith("Texture") || key.endsWith("texture")){
            String path = parseImagePath(materialMap, key);
            if (path == null) {
                throw new IllegalArgumentException("Error: Unable to parse environment light map resource uri!");
            }

            Uri uri = Helper.parseUri(path, mContext);
            ImageDownloader downloader = new ImageDownloader(mContext);
            downloader.setTextureFormat(Texture.Format.RGB9_E5);

            Bitmap imageBitmap = downloader.getImageSync(uri);
            if (imageBitmap != null) {
                Image nativeImage = new Image(imageBitmap, Texture.Format.RGBA8);
                boolean sRGB = property == PBRProperties.AMBIENT_OCCLUSION_TEXTURE;
                Texture texture = parseTexture(nativeImage, sRGB, false,
                        key, materialMap);

                property.setMapForMaterial(material, texture);
            } else {
                throw new IllegalArgumentException("Error: Unable to get environment light map resource!");
            }
        } else {
            float value = (float)materialMap.getDouble(key);
            property.setPropertyForMaterial(material, value);
        }
    }

    private Texture parseTexture(Image image, boolean sRGB, boolean mipmap,
                                 String name, ReadableMap materialMap) {
        Texture nativeTexture = new Texture(image, sRGB, mipmap);
        parseTexture(nativeTexture, name, materialMap);
        return nativeTexture;
    }

    private void parseTexture(Texture nativeTexture, String materialPropertyName, ReadableMap materialMap) {
        if (materialMap.hasKey("wrapS")) {
            nativeTexture.setWrapS(Texture.WrapMode.valueFromString(materialMap.getString("wrapS")));
        }
        if (materialMap.hasKey("wrapT")) {
            nativeTexture.setWrapT(Texture.WrapMode.valueFromString(materialMap.getString("wrapT")));
        }
        if (materialMap.hasKey("minificationFilter")) {
            nativeTexture.setMinificationFilter(Texture.FilterMode.valueFromString(materialMap.getString("minificationFilter")));
        }
        if (materialMap.hasKey("magnificationFilter")) {
            nativeTexture.setMagnificationFilter(Texture.FilterMode.valueFromString(materialMap.getString("magnificationFilter")));
        }
        if (materialMap.hasKey("mipFilter")) {
            nativeTexture.setMipFilter(Texture.FilterMode.valueFromString(materialMap.getString("mipFilter")));
        }
    }

    private Texture createTextureCubeMap(ReadableMap textureMap, Texture.Format format) {
        ReadableMapKeySetIterator iter = textureMap.keySetIterator();

        if (!iter.hasNextKey()) {
            throw new IllegalArgumentException("Error creating cube map: ensure the nx, px, ny, py, nz, and pz params are passed in the body of the cube map texture");
        }

        final Map<String, Image> cubeMapImages = new HashMap<String, Image>();
        long cubeSize = -1;

        // create an image for each texture
        while (iter.hasNextKey()) {
            final String key = iter.nextKey();
            if (sImageMap.get(key) != null) {
                cubeMapImages.put(key, sImageMap.get(key));
            } else {
                ImageDownloader downloader = new ImageDownloader(mContext);
                downloader.setTextureFormat(format);
                Image nativeImage = new Image(downloader.getImageSync(textureMap), format);
                cubeMapImages.put(key, nativeImage);
            }

            Image nativeImageToValidate = cubeMapImages.get(key);
            // check that the width == height and all sides are the same size
            if (cubeSize < 0) {
                cubeSize = nativeImageToValidate.getWidth();
            }

            if (nativeImageToValidate.getWidth() != cubeSize
                    || nativeImageToValidate.getHeight() != cubeSize) {
                throw new IllegalArgumentException("Error loading cube map. Cube map must be square and uniformly sized");
            }
        }

        // check that we have all 6 sides
        if (cubeMapImages.get("px") == null ||
                cubeMapImages.get("nx") == null ||
                cubeMapImages.get("py") == null ||
                cubeMapImages.get("ny") == null ||
                cubeMapImages.get("pz") == null ||
                cubeMapImages.get("nz") == null ) {
            throw new IllegalArgumentException("Some cube map images are null. Please check and fix");
        }
        // create and return a Texture w/ all 6 sides.
        return new Texture(cubeMapImages.get("px"), cubeMapImages.get("nx"),
                              cubeMapImages.get("py"), cubeMapImages.get("ny"),
                              cubeMapImages.get("pz"), cubeMapImages.get("nz"));
    }

    private String parseAssetType(ReadableMap map, String key) {
        if ((map.getType(key) == ReadableType.Map) && map.getMap(key).hasKey("type")) {
            String type = map.getMap(key).getString("type");
            if (type != null && !type.equalsIgnoreCase("unknown")) {
                return type;
            }
        }
        return null;
    }

    private String parseImagePath(ReadableMap map, String key) {
        if (map.getType(key) == ReadableType.String) {
            return map.getString(key);
        } else if (map.getType(key) == ReadableType.Map) {
            if (map.getMap(key).hasKey("source") && map.getMap(key).getType("source") == ReadableType.Map) {
                return map.getMap(key).getMap("source").getString("uri");
            }
            else {
                return map.getMap(key).getString("uri");
            }
        }
        // We don't know how to parse anything else... so just return.
        return null;
    }

    private Texture.Format parseImageFormat(ReadableMap map, String key) {
        Texture.Format format = Texture.Format.RGBA8;
        if (map.getType(key) == ReadableType.Map) {
            if (map.getMap(key).hasKey("format")) {
                format = Texture.Format.forString(map.getMap(key).getString("format"));
            }
        }
        return format;
    }

    private boolean parseImageMipmap(ReadableMap map, String key) {
        boolean mipmap = true;
        if (map.getType(key) == ReadableType.Map) {
            if (map.getMap(key).hasKey("mipmap")) {
                mipmap = map.getMap(key).getBoolean("mipmap");
            }
        }
        return mipmap;
    }

        public MaterialWrapper(String materialName, ReadableMap source) {
            mVideoTextures = new HashMap<String, Uri>();
            mMaterialSource = source;
            mMaterialName = materialName;
        }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\SoundModule.java

/*


     * This function takes a map of keys to sounds and creates SoundData objects
     * to prefetch the data before storing them in a local map. We currently only
     * support external urls (web-based).
     *
     * @param soundMap a map of String keys to String url's.
    
    @ReactMethod
    public void preloadSounds(final ReadableMap soundMap, final Promise onSoundPreloadedCallback) {
        ReadableMapKeySetIterator iter = soundMap.keySetIterator();
        while(iter.hasNextKey()) {
            final String key = iter.nextKey();
            ReadableType keyType = soundMap.getType(key);
            String path;
            if (keyType == ReadableType.String){
                path = soundMap.getString(key);
            } else if (keyType == ReadableType.Map && soundMap.getMap(key).hasKey("uri")){
                path = soundMap.getMap(key).getString("uri");
            } else {
                throw new IllegalArgumentException("Invalid preloaded sound path received.");
            }

            // If a promise is provided, create SoundDataInitCallback to notify
            // the javascript layer of when the data has completed preloading.
            SoundData.SoundDataInitializeCallback callback = null;
            if (onSoundPreloadedCallback != null) {
                callback = new SoundData.SoundDataInitializeCallback() {
                    @Override
                    public void onDataIsReady() {
                        WritableMap returnMap = Arguments.createMap();
                        returnMap.putString("key", key);
                        returnMap.putBoolean("result",true);
                        returnMap.putString("msg","");
                        onSoundPreloadedCallback.resolve(returnMap);
                    }

                    @Override
                    public void onDataError(String errorMsg) {
                        WritableMap returnMap = Arguments.createMap();
                        returnMap.putString("key", key);
                        returnMap.putBoolean("result",false);
                        returnMap.putString("msg", errorMsg);
                        onSoundPreloadedCallback.resolve(returnMap);
                    }
                };
            }
            mSoundDataMap.put(key, new SoundData(path, callback));
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\VRTImageModule.java

/*

    @ReactMethod
    public void evictFromCache(ReadableMap map) {
        ImageDownloader.evictFromCache(map, mContext);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\utility\HdrImageDownloader.java

/*

    public static void getHdrTextureAsync(ReadableMap map, DownloadListener listener, Context context) {
        if (!map.hasKey(URI_KEY)) {
            throw new IllegalArgumentException("Missing HDR uri file path.");
        }

        Uri hdrUri = Helper.parseUri(map.getString(URI_KEY), context);
        if (hdrUri == null || hdrUri.getPath() == null ) {
            throw new IllegalArgumentException("Invalid HDR uri file path provided.");
        }

        Uri uri = Helper.parseUri(map.getString(URI_KEY), context);
        DownloadHDRAsyncTask task = new DownloadHDRAsyncTask(listener);
        task.execute(uri);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\utility\ImageDownloader.java

/*

    public static void evictFromCache(ReadableMap map, Context context) {
        if (!map.hasKey(URI_KEY)) {
            throw new IllegalArgumentException("Unable to find \"uri\" key in evictFromCache(map)");
        }
        evictFromCache(Helper.parseUri(map.getString(URI_KEY), context));
    }


     * This method fetches an image synchronously.
     *
     * @param map a ReadableMap with a "uri" key, ideally the same one we get from the JS layer
     * @return the bitmap containing the image data
     
    public Bitmap getImageSync(ReadableMap map) {
        if (!map.hasKey(URI_KEY)) {
            throw new IllegalArgumentException("Unable to find \"uri\" key in given source map.");
        }
        return getImageSync(Helper.parseUri(map.getString(URI_KEY), mContext));
    }
    
     * This method fetches an image asynchrously
     *
     * @param map a ReadableMap with a "uri" key, ideally the same one we get from the JS layer
     * @param listener object that will be called once the image is fetched.
     
    public void getImageAsync(ReadableMap map, ImageDownloadListener listener) {
        if (listener == null) {
            ViroLog.warn(TAG, "The given ImageDownloadListener is null. Doing nothing.");
            return;
        }

        if (!map.hasKey(URI_KEY)) {
            throw new IllegalArgumentException("Unable to find \"uri\" key in given source map.");
        }

        getImage(Helper.parseUri(map.getString(URI_KEY), mContext), null, listener);
    }

*/