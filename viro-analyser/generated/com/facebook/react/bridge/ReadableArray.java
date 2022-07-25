// https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/com/facebook/react/bridge/ReadableArray.java
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT360Image.java

/*

    public void setRotation(ReadableArray rotation) {
        if (rotation == null) {
            mRotation = sDefaultRotation;
        } else {
            float[] rotationArr = {(float) rotation.getDouble(0),
                    (float) rotation.getDouble(1), (float) rotation.getDouble(2)};
            mRotation = rotationArr;
        }
        if (getNodeJni() != null) {
            PortalScene portal = getNodeJni().getParentPortalScene();
            if (portal != null) {
                portal.setBackgroundRotation(Helper.toRadiansVector(mRotation));
            }
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT360ImageManager.java

/*

    @ReactProp(name = "rotation")
    public void setRotation(VRT360Image view, ReadableArray rotation) {
        view.setRotation(rotation);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT360Video.java

/*

    public void setRotation(ReadableArray rotation) {
        if (rotation == null) {
            mRotation = sDefaultRotation;
        } else {
            float[] rotationArr = {(float) rotation.getDouble(0),
                    (float) rotation.getDouble(1), (float) rotation.getDouble(2)};
            mRotation = rotationArr;
        }

        if (getNodeJni() != null) {
            PortalScene portal = getNodeJni().getParentPortalScene();
            if (portal != null) {
                portal.setBackgroundRotation(Helper.toRadiansVector(mRotation));
            }
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRT360VideoManager.java

/*

    @ReactProp(name = "rotation")
    public void setRotation(VRT360Video view, ReadableArray rotation) {
        view.setRotation(rotation);
    }

    @Override
    public void receiveCommand(VRT360Video video, int commandType, @Nullable ReadableArray args) {
        switch (commandType) {
            case ViroCommands.SEEK_TO_TIME_INDEX:
                video.seekToTime((float) args.getDouble(0));
                break;
            default:
                throw new IllegalArgumentException("Unsupported command " + commandType
                        + " received by" + getClass().getSimpleName());
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTDirectionalLightManager.java

/*

    public void setDirection(VRTDirectionalLight directionalLight, ReadableArray direction) {
        directionalLight.setDirection(Helper.toFloatArray(direction));
    }

    @ReactProp(name = "shadowOrthographicPosition")
    public void setShadowOrthographicPosition(VRTDirectionalLight directionalLight, ReadableArray position) {
        directionalLight.setShadowOrthographicPosition(Helper.toFloatArray(position));
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTMaterialVideoManager.java

/*

    @Override
    public void receiveCommand(VRTMaterialVideo video, int commandType, @Nullable ReadableArray args) {
        switch (commandType) {
            case ViroCommands.SEEK_TO_TIME_INDEX:
                video.seekToTime((float) args.getDouble(0));
                break;
            case ViroCommands.PAUSE_INDEX:
                video.setPaused(true);
                break;
            default:
                throw new IllegalArgumentException("Unsupported command " + commandType
                        + " received by" + getClass().getSimpleName());
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTOmniLightManager.java

/*

    @ReactProp(name = "position")
    public void setPosition(VRTOmniLight omniLight, ReadableArray position) {
        omniLight.setPosition(Helper.toFloatArray(position));
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSoundFieldManager.java

/*

    @ReactProp(name = "rotation")
    public void setRotation(VRTSoundField sound, ReadableArray rotation) {
        sound.setRotation(Helper.toFloatArray(rotation));
    }

    @Override
    public void receiveCommand(VRTSoundField sound, int commandType, @Nullable ReadableArray args) {
        switch (commandType) {
            case ViroCommands.SEEK_TO_TIME_INDEX:
                sound.seekToTime((int) args.getDouble(0));
                break;
            default:
                throw new IllegalArgumentException("Unsupported command " + commandType
                        + " received by" + getClass().getSimpleName());
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSoundManager.java

/*

    @Override
    public void receiveCommand(VRTSound sound, int commandType, @Nullable ReadableArray args) {
        switch (commandType) {
            case ViroCommands.SEEK_TO_TIME_INDEX:
                sound.seekToTime((int) args.getDouble(0));
                break;
            default:
                throw new IllegalArgumentException("Unsupported command " + commandType
                        + " received by" + getClass().getSimpleName());
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSpatialSoundManager.java

/*

    @ReactProp(name = "position")
    public void setPosition(VRTSpatialSoundWrapper sound, ReadableArray position) {
        sound.setPosition(Helper.toFloatArray(position));
    }

    @Override
    public void receiveCommand(VRTSpatialSoundWrapper sound, int commandType, @Nullable ReadableArray args) {
        switch (commandType) {
            case ViroCommands.SEEK_TO_TIME_INDEX:
                sound.seekToTime((int) args.getDouble(0));
                break;
            default:
                throw new IllegalArgumentException("Unsupported command " + commandType
                        + " received by" + getClass().getSimpleName());
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTSpotLightManager.java

/*

    @ReactProp(name = "direction")
    public void setDirection(VRTSpotLight spotLight, ReadableArray direction) {
        spotLight.setDirection(Helper.toFloatArray(direction));
    }

    @ReactProp(name = "position")
    public void setPosition(VRTSpotLight spotLight, ReadableArray position) {
        spotLight.setPosition(Helper.toFloatArray(position));
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\VRTViroViewGroupManager.java

/*

    // Override React Properties

    @ReactProp(name = "position")
    public void setPosition(T view, ReadableArray position) {
        // no-op
    }

    protected class ViroLayoutShadowNode extends LayoutShadowNode {

        @ReactProp(name = "position")
        public void setPosition(@Nullable ReadableArray position) {
            // no-op
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARScene.java

/*

    public void setAnchorDetectionTypes(ReadableArray types) {
        EnumSet<ViroViewARCore.AnchorDetectionType> typesList = EnumSet.noneOf(ViroViewARCore.AnchorDetectionType.class);
        if (types != null) {
            for (int i = 0; i < types.size(); i++) {
                ViroViewARCore.AnchorDetectionType type = ViroViewARCore.AnchorDetectionType.valueFromString(types.getString(i));
                if (type != null) {
                    typesList.add(type);
                }
            }
        }
        ((ARScene) mNativeScene).setAnchorDetectionTypes(typesList);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTARSceneManager.java

/*

    @ReactProp(name="pointCloudScale")
    public void setPointCloudScale(VRTARScene scene, ReadableArray pointCloudScale) {
        try {
            if (pointCloudScale == null) {
                scene.setPointCloudScale(new Vector(.01f, .01f, .01f));

            } else {
                scene.setPointCloudScale(Helper.toVector(pointCloudScale));
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("imageScale requires 3 scale values for [x, y, z].");
        }
    }

    @ReactProp(name="anchorDetectionTypes")
    public void setAnchorDetectionTypes(VRTARScene scene, @Nullable ReadableArray array) {
        scene.setAnchorDetectionTypes(array);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTCameraManager.java

/*

    @ReactProp(name = "position")
    public void setPosition(VRTCamera camera, ReadableArray position) {
        float[] posArray = {(float) position.getDouble(0), (float) position.getDouble(1),
                (float) position.getDouble(2)};
        camera.setPosition(posArray);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTNode.java

/*
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

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTNodeManager.java

/*

    @ReactProp(name = "position")
    public void setPosition(T view, ReadableArray position) {
        view.setPosition(Helper.toFloatArray(position, DEFAULT_ZERO_VEC));
    }

    @ReactProp(name = "rotation")
    public void setRotation(VRTNode view, ReadableArray rotation) {
        view.setRotation(Helper.toFloatArray(rotation, DEFAULT_ZERO_VEC));
    }

    @ReactProp(name = "scale")
    public void setScale(VRTNode view, ReadableArray scale) {
        view.setScale(Helper.toFloatArray(scale, new float[]{1,1,1}));
    }

    @ReactProp(name = "rotationPivot")
    public void setRotationPivot(VRTNode view, ReadableArray scale) {
        view.setRotationPivot(Helper.toFloatArray(scale, DEFAULT_ZERO_VEC));
    }

    @ReactProp(name = "scalePivot")
    public void setScalePivot(VRTNode view, ReadableArray scale) {
        view.setScalePivot(Helper.toFloatArray(scale, DEFAULT_ZERO_VEC));
    }

    @ReactProp(name = "materials")
    public void setMaterials(VRTNode view, @Nullable ReadableArray materials) {
        // get material manager
        MaterialManager materialManager = getContext().getNativeModule(MaterialManager.class);

        ArrayList<Material> nativeMaterials = new ArrayList<>();
        if (materials != null) {
            for (int i = 0; i < materials.size(); i++) {
                Material nativeMaterial = materialManager.getMaterial(materials.getString(i));
                if (materialManager.isVideoMaterial(materials.getString(i))) {
                    if (!(nativeMaterial.getDiffuseTexture() instanceof VideoTexture)) {
                        // Recreate the material with the proper context.
                        if (view.getViroContext() != null) {
                            MaterialWrapper materialWrapper = materialManager.getMaterialWrapper(materials.getString(i));
                            VideoTexture videoTexture = new VideoTexture(view.getViroContext(), materialWrapper.getVideoTextureURI());
                            materialWrapper.recreate(videoTexture);
                            nativeMaterial = materialWrapper.getNativeMaterial();
                        }
                    }
                }

                if (nativeMaterial == null) {
                    throw new IllegalArgumentException("Material [" + materials.getString(i) + "] not found. Did you create it?");
                }

                nativeMaterials.add(nativeMaterial);
            }
        }
        view.setMaterials(nativeMaterials);
    }

    @ReactProp(name = "transformBehaviors")
    public void setTransformBehaviors(VRTNode view, @Nullable ReadableArray transformBehaviors) {

        String[] behaviors = new String[0];
        if (transformBehaviors != null) {
            behaviors = new String[transformBehaviors.size()];
            for (int i = 0; i < transformBehaviors.size(); i++) {
                behaviors[i] = transformBehaviors.getString(i);
            }
        }
        view.setTransformBehaviors(behaviors);
    }


*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTOrbitCameraManager.java

/*

    @ReactProp(name = "position")
    public void setPosition(VRTCamera camera, ReadableArray position) {
        float[] posArray = {(float) position.getDouble(0), (float) position.getDouble(1),
                (float) position.getDouble(2)};
        camera.setPosition(posArray);
    }

    @ReactProp(name = "focalPoint")
    public void setFocalPoint(VRTOrbitCamera camera, ReadableArray focalPoint) {
        float[] focalPointArray = {(float) focalPoint.getDouble(0), (float) focalPoint.getDouble(1),
                (float) focalPoint.getDouble(2)};
        camera.setFocalPoint(focalPointArray);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTScene.java

/*

    public void setPostProcessEffects(ReadableArray effects){
        if (effects == null || effects.size() == 0){
            mNativeScene.setEffects(null);
            return;
        }

        String nativeEffects[] = new String[effects.size()];
        for (int i = 0; i < effects.size(); i ++){
            String effect = effects.getString(i);
            nativeEffects[i] = effect;
        }
        if (!mNativeScene.setEffects(nativeEffects)){
            onError("Viro: Attempted to set an invalid effect!");
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

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\VRTSceneManager.java

/*

    @ReactProp(name = "postProcessEffects")
    public void setPostProcessEffects(VRTScene scene, @Nullable ReadableArray effects) {
        scene.setPostProcessEffects(effects);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRT3DObjectManager.java

/*

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

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTGeometryManager.java

/*

    private List<Vector> convertVectorArray(ReadableArray array, int componentsPerVertex, String type) {
        List<Vector> result = new ArrayList<Vector>();
        for (int i = 0; i < array.size(); i ++) {
            ReadableArray vecArray = array.getArray(i);
            if (vecArray == null) {
                throw new IllegalArgumentException("[ViroGeometry] geometry requires " + componentsPerVertex + " coordinates per vertex for type " + type + " but null vertex was provided!");
            }
            if (vecArray.size() < componentsPerVertex) {
                throw new IllegalArgumentException("[ViroGeometry] geometry requires " + componentsPerVertex + " coordinates per vertex for type " + type + " but " +
                        " vertex with " + vecArray.size() + " points was provided!");
            }
            if (vecArray.size() > componentsPerVertex) {
                Log.w("Viro","[ViroGeometry] geometry only supports " + componentsPerVertex + " coordinates per vertex for type " + type + " but " +
                        " vertex with " + vecArray.size() + " points was provided!");

            }

            Vector v = new Vector();
            if (componentsPerVertex > 0) {
                v.x = (float) vecArray.getDouble(0);
            }
            if (componentsPerVertex > 1) {
                v.y = (float) vecArray.getDouble(1);
            }
            if (componentsPerVertex > 2) {
                v.z = (float) vecArray.getDouble(2);
            }
            result.add(v);
        }
        return result;
    }

    @ReactProp(name = "vertices")
    public void setVertices(VRTGeometry view, ReadableArray vertices) {
        if (vertices == null || vertices.size() == 0) {
            throw new IllegalArgumentException("[ViroGeometry] Invalid Geometry vertex boundary list provided!");
        }
        view.setVertices(convertVectorArray(vertices, 3, "vertices"));
    }

    @ReactProp(name = "texcoords")
    public void setTexcoords(VRTGeometry view, ReadableArray texcoords) {
        view.setTexcoords(convertVectorArray(texcoords, 2, "texcoords"));
    }

    @ReactProp(name = "normals")
    public void setNormals(VRTGeometry view, ReadableArray normals) {
        view.setNormals(convertVectorArray(normals, 3, "normals"));
    }

    @ReactProp(name = "triangleIndices")
    public void setTriangleIndices(VRTGeometry view, ReadableArray triangleIndicesArray) {
        List<List<Integer>> triangleIndices = new ArrayList<>();

        for (int i = 0; i < triangleIndicesArray.size(); i++) {
            ReadableArray submeshArray = triangleIndicesArray.getArray(i);
            if (submeshArray == null) {
                continue;
            }

            List<Integer> submesh = new ArrayList<>();
            for (int j = 0; j < submeshArray.size(); j++) {
                submesh.add(submeshArray.getInt(j));
            }
            triangleIndices.add(submesh);
        }
        view.setTriangleIndices(triangleIndices);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTParticleEmitter.java


/*

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

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTPolygonManager.java

/*

    @ReactProp(name = "vertices")
    public void setVertices(VRTPolygon view, ReadableArray vertices) {
        if (vertices == null || vertices.size() == 0) {
            throw new IllegalArgumentException("[ViroPolygon] Invalid Polygon vertex boundary list provided!");
        }

        List<Vector> vecVertices = new ArrayList<Vector>();
        for (int i = 0; i < vertices.size(); i ++) {
            ReadableArray vecArray = vertices.getArray(i);
            if (vecArray == null || vecArray.size() < 2) {
                throw new IllegalArgumentException("[ViroPolygon] Invalid Polygon vertex boundary list provided!");
            }

            if (vecArray.size() > 2){
                Log.w("Viro","[ViroPolygon] Polygon only supports xy coordinates! " +
                        "But a set of 3 points had been provided!");

            }

            vecVertices.add(new Vector(vecArray.getDouble(0), vecArray.getDouble(1),0));
        }


        view.setVertices(vecVertices);
    }

    @ReactProp(name = "holes")
    public void setHoles(VRTPolygon view, ReadableArray holesArray) {
        List<List<Vector>> holes = new ArrayList<>();
        for (int h = 0; h < holesArray.size(); h++) {
            ReadableArray holeArray = holesArray.getArray(h);
            if (holeArray == null || holeArray.size() == 0) {
                continue;
            }

            List<Vector> hole = new ArrayList<>();
            for (int i = 0; i < holeArray.size(); i++) {
                ReadableArray vecArray = holeArray.getArray(i);
                if (vecArray == null || vecArray.size() < 2) {
                    throw new IllegalArgumentException("[ViroPolygon] Invalid hole vertex boundary list provided!");
                }
                if (vecArray.size() > 2) {
                    Log.w("Viro","[ViroPolygon] Polygon only supports xy coordinates! " +
                            "But a set of 3 points had been provided for hole " + h + "!");

                }
                hole.add(new Vector(vecArray.getDouble(0), vecArray.getDouble(1),0));
            }
            holes.add(hole);
        }
        view.setHoles(holes);
    }

    @ReactProp(name = "uvCoordinates")
    public void setUVCoordinates(VRTPolygon view, ReadableArray coordinates) {
        float u0 = 0; float v0 = 0; float u1 = 1; float v1 = 1;

        if (coordinates == null) {
            // do-nothing
        } else if (coordinates.size() != 4) {
            throw new IllegalArgumentException("[ViroPolygon] Expected 4 uv coordinates, got " + coordinates.size());
        } else { // not null && has 4 elements
            u0 = (float) coordinates.getDouble(0);
            v0 = (float) coordinates.getDouble(1);
            u1 = (float) coordinates.getDouble(2);
            v1 = (float) coordinates.getDouble(3);
        }

        view.setUVCoordinates(u0, v0, u1, v1);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTPolyline.java

/*

    public void setPoints(ReadableArray points) {
        mRawPoints = points;
        mDidSetGeometry = false;
    }

    private float[][] processPoints() {
        if (mRawPoints.size() == 0) {
            throw new IllegalArgumentException("Polyline should consist of at least 1 point");
        }

        int pointSize = mRawPoints.size();
        if (mClosed) {
            pointSize+=1;
        }

        float[][] pointsArray = new float[pointSize][3];
        for (int i = 0; i < mRawPoints.size(); i++) {
            ReadableArray point = mRawPoints.getArray(i);
            if (point.size() < 3) {
                throw new IllegalArgumentException("Polyline points should have at least 3 coordinates");
            }
            for (int j = 0; j < 3; j++) {
                pointsArray[i][j] = (float) point.getDouble(j);
            }
        }

        // Add a closing point to the end if closed prop set.
        if (mClosed) {
            ReadableArray point = mRawPoints.getArray(0);
            pointsArray[mRawPoints.size()][0] = (float)point.getDouble(0);
            pointsArray[mRawPoints.size()][1] = (float)point.getDouble(1);
            pointsArray[mRawPoints.size()][2] = (float)point.getDouble(2);
        }

        return pointsArray;
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTPolylineManager.java

/*

    @ReactProp(name = "points")
    public void setPoints(VRTPolyline polyline, ReadableArray points) {
        polyline.setPoints(points);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTQuadManager.java

/*

    @ReactProp(name = "uvCoordinates")
    public void setUVCoordinates(VRTQuad view, ReadableArray coordinates) {
        float u0 = 0; float v0 = 0; float u1 = 1; float v1 = 1;

        if (coordinates == null) {
            // do-nothing
        } else if (coordinates.size() != 4) {
            throw new IllegalArgumentException("[ViroSurface] Expected 4 uv coordinates, got " + coordinates.size());
        } else { // not null && has 4 elements
            u0 = (float) coordinates.getDouble(0);
            v0 = (float) coordinates.getDouble(1);
            u1 = (float) coordinates.getDouble(2);
            v1 = (float) coordinates.getDouble(3);
        }

        view.setUVCoordinates(u0, v0, u1, v1);
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\component\node\control\VRTVideoSurfaceManager.java

/*

    @Override
    public void receiveCommand(VRTVideoSurface video, int commandType, @Nullable ReadableArray args) {
        switch (commandType) {
            case ViroCommands.SEEK_TO_TIME_INDEX:
                video.seekToTime((float) args.getDouble(0));
                break;
            default:
                throw new IllegalArgumentException("Unsupported command " + commandType
                        + " received by" + getClass().getSimpleName());
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\AnimationManager.java

/*

    
     * This function helps us branch between the 3 different animation object types
     *
     * @param array - the array of animation objects
     * @param index - the index of the animation object to parse
     * @param executionType - the execution type
     * @return the parsed animation
     
    private ExecutableAnimation parseAnimationObjectHelper(ReadableArray array, int index,
                                                     ExecutionType executionType) {
        switch(array.getType(index)) {
            case Array:
                return parseAnimationObject(array.getArray(index), executionType);
            case Map:
                return parseAnimationObject(array.getMap(index), executionType);
            case String:
                return parseAnimationObject(array.getString(index), executionType);
            default:
                ViroLog.error(TAG, "Invalid animation object received of type: ["
                        + array.getType(index) + "]");
                return null;
        }
    }

    private ExecutableAnimation parseAnimationObject(String animationName, ExecutionType executionType) {
        return parseAnimationObjectHelper(animationName, ExecutionType.SERIAL);
    }

    private ExecutableAnimation parseAnimationObject(ReadableMap animationMap, ExecutionType executionType) {
        return parseAnimationMap(animationMap);
    }

    private ExecutableAnimation parseAnimationObject(ReadableArray animationArray, ExecutionType executionType) {
        AnimationChain animationChain = new AnimationChain(executionType);
        for (int i = 0; i < animationArray.size(); i++) {
            ExecutableAnimation childAnimation = parseAnimationObjectHelper(animationArray, i, ExecutionType.SERIAL);

            if (childAnimation instanceof AnimationGroup) {
                animationChain.addAnimation((AnimationGroup) childAnimation);
            } else if (childAnimation instanceof AnimationChain) {
                animationChain.addAnimation((AnimationChain) childAnimation);
            } else {
                ViroLog.warn(TAG, "Unknown ExecutableAnimation type [" + childAnimation.getClass().getSimpleName() + "]!");
            }
        }
        return animationChain;
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ARSceneModule.java

/*

    @ReactMethod
    public void performARHitTestWithRay(final int viewTag, final ReadableArray ray,
                                        final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(viewTag);
                if (sceneView.getParent() == null || !(sceneView.getParent() instanceof VRTARSceneNavigator)) {
                    throw new IllegalViewOperationException("Invalid view returned when " +
                            "calling performARHitTestWithRay: expected ViroARSceneNavigator as parent");
                }

                VRTARSceneNavigator arSceneNavigator = (VRTARSceneNavigator) sceneView.getParent();
                ViroViewARCore arView = arSceneNavigator.getARView();

                if (ray.size() != 3) {
                    promise.resolve(Arguments.createArray());
                    return;
                }

                float[] rayArray = new float[ray.size()];
                rayArray[0] = (float) ray.getDouble(0);
                rayArray[1] = (float) ray.getDouble(1);
                rayArray[2] = (float) ray.getDouble(2);

                arView.performARHitTestWithRay(new Vector(rayArray), new ARHitTestListener() {
                    @Override
                    public void onHitTestFinished(ARHitTestResult[] arHitTestResults) {
                        WritableArray returnArray = Arguments.createArray();
                        for (ARHitTestResult result : arHitTestResults) {
                            returnArray.pushMap(ARUtils.mapFromARHitTestResult(result));
                        }
                        promise.resolve(returnArray);
                    }
                });
            }
        });
    }

    @ReactMethod
    public void performARHitTestWithWorldPoints(final int viewTag, final ReadableArray origin, final ReadableArray destination,
                                        final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(viewTag);
                if (sceneView.getParent() == null || !(sceneView.getParent() instanceof VRTARSceneNavigator)) {
                    throw new IllegalViewOperationException("Invalid view returned when " +
                            "calling performARHitTestWithRay: expected ViroARSceneNavigator as parent");
                }

                VRTARSceneNavigator arSceneNavigator = (VRTARSceneNavigator) sceneView.getParent();
                ViroViewARCore arView = arSceneNavigator.getARView();

                if ((origin.size() != 3) || (destination.size() != 3)) {
                    promise.resolve(Arguments.createArray());
                    return;
                }

                float[] originArray = new float[origin.size()];
                originArray[0] = (float) origin.getDouble(0);
                originArray[1] = (float) origin.getDouble(1);
                originArray[2] = (float) origin.getDouble(2);

                float[] destArray = new float[destination.size()];
                destArray[0] = (float) destination.getDouble(0);
                destArray[1] = (float) destination.getDouble(1);
                destArray[2] = (float) destination.getDouble(2);

                arView.performARHitTestWithRay(new Vector(originArray), new Vector(destArray), new ARHitTestListener() {
                    @Override
                    public void onHitTestFinished(ARHitTestResult[] arHitTestResults) {
                        WritableArray returnArray = Arguments.createArray();
                        for (ARHitTestResult result : arHitTestResults) {
                            returnArray.pushMap(ARUtils.mapFromARHitTestResult(result));
                        }
                        promise.resolve(returnArray);
                    }
                });
            }
        });
    }

    @ReactMethod
    public void performARHitTestWithPosition(final int viewTag, final ReadableArray position,
                                        final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(viewTag);
                if (sceneView.getParent() == null || !(sceneView.getParent() instanceof VRTARSceneNavigator)) {
                    throw new IllegalViewOperationException("Invalid view returned when " +
                            "calling performARHitTestWithPosition: expected ViroARSceneNavigator as parent");
                }

                VRTARSceneNavigator arSceneNavigator = (VRTARSceneNavigator) sceneView.getParent();
                ViroViewARCore arView = arSceneNavigator.getARView();

                if (position.size() != 3) {
                    promise.resolve(Arguments.createArray());
                    return;
                }

                float[] positionArray = new float[position.size()];
                positionArray[0] = (float) position.getDouble(0);
                positionArray[1] = (float) position.getDouble(1);
                positionArray[2] = (float) position.getDouble(2);

                arView.performARHitTestWithPosition(new Vector(positionArray), new ARHitTestListener() {
                    @Override
                    public void onHitTestFinished(ARHitTestResult[] arHitTestResults) {
                        WritableArray returnArray = Arguments.createArray();
                        for (ARHitTestResult result : arHitTestResults) {
                            returnArray.pushMap(ARUtils.mapFromARHitTestResult(result));
                        }
                        promise.resolve(returnArray);
                    }
                });
            }
        });
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\ARSceneNavigatorModule.java

/*

    @ReactMethod
    public void project(final int sceneNavTag, final ReadableArray point, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View view = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (view instanceof VRTARSceneNavigator) {
                    VRTARSceneNavigator sceneNavigator = (VRTARSceneNavigator) view;
                    float[] projectPoint = {0,0,0};
                    projectPoint[0] = (float)point.getDouble(0);
                    projectPoint[1] = (float)point.getDouble(1);
                    projectPoint[2] = (float)point.getDouble(2);
                    Vector projectedPoint = sceneNavigator.projectPoint(new Vector(projectPoint[0], projectPoint[1], projectPoint[2]));

                    WritableMap returnMap = Arguments.createMap();
                    WritableArray writablePosArray = Arguments.createArray();
                    writablePosArray.pushDouble(projectedPoint.x);
                    writablePosArray.pushDouble(projectedPoint.y);
                    returnMap.putArray("screenPosition", writablePosArray);
                    promise.resolve(returnMap);
                }
            }
        });
    }

    @ReactMethod
    public void unproject(final int sceneNavTag, final ReadableArray point, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View view = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (view instanceof VRTARSceneNavigator) {
                    VRTARSceneNavigator sceneNavigator = (VRTARSceneNavigator) view;
                    float[] unprojectPoint = {0,0,0};
                    unprojectPoint[0] = (float)point.getDouble(0);
                    unprojectPoint[1] = (float)point.getDouble(1);
                    unprojectPoint[2] = (float)point.getDouble(2);
                    Vector unProjectedPoint = sceneNavigator.unprojectPoint(new Vector(unprojectPoint[0], unprojectPoint[1], unprojectPoint[2]));

                    WritableMap returnMap = Arguments.createMap();
                    WritableArray writablePosArray = Arguments.createArray();
                    writablePosArray.pushDouble(unProjectedPoint.x);
                    writablePosArray.pushDouble(unProjectedPoint.y);
                    writablePosArray.pushDouble(unProjectedPoint.z);
                    returnMap.putArray("position", writablePosArray);
                    promise.resolve(returnMap);
                }
            }
        });
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\MaterialManager.java

/*

    @ReactMethod
    public void deleteMaterials(ReadableArray materials) {
        for (int i = 0; i < materials.size(); i++) {
            String materialName = materials.getString(i);
            if (sMaterialsMap.containsKey(materialName)) {
                // we need to delete the native ref before we remove the material
                sMaterialsMap.get(materialName).getNativeMaterial().dispose();
                sMaterialsMap.remove(materialName);
            }
        }
    }

                    ReadableArray colorWriteArray = materialMap.getArray(materialPropertyName);
                    List<Material.ColorWriteMask> colorWriteList = new ArrayList<Material.ColorWriteMask>();
                    for (int c = 0; c < colorWriteArray.size(); c++) {
                        colorWriteList.add(Material.ColorWriteMask.valueFromString(colorWriteArray.getString(c)));
                    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\NodeModule.java

/*

    @ReactMethod
    public void applyImpulse(final int viewTag, final ReadableArray force, final ReadableArray position) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View viroView = nativeViewHierarchyManager.resolveView(viewTag);
                if (!(viroView instanceof VRTNode)){
                    throw new IllegalViewOperationException("Invalid view returned when applying force: expected a node-type control!");
                }

                if (force == null || force.size() != 3){
                    throw new IllegalViewOperationException("Invalid impulse force parameters provided!");
                }

                if (position != null && position.size() != 3){
                    throw new IllegalViewOperationException("Invalid impulse force position parameters provided!");
                }

                // If no offset is given, default to a central impulse.
                float[] forcePosition = {0,0,0};
                if (position != null){
                    forcePosition[0] = (float)position.getDouble(0);
                    forcePosition[1] = (float)position.getDouble(1);
                    forcePosition[2] = (float)position.getDouble(2);
                }
                float[] forceArray = { (float)force.getDouble(0), (float)force.getDouble(1), (float)force.getDouble(2)};

                VRTNode nodeControl = (VRTNode) viroView;
                nodeControl.applyImpulse(forceArray, forcePosition);
            }
        });
    }

    @ReactMethod
    public void applyTorqueImpulse(final int viewTag, final ReadableArray torque) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View viroView = nativeViewHierarchyManager.resolveView(viewTag);
                if (!(viroView instanceof VRTNode)){
                    throw new IllegalViewOperationException("Invalid view returned when applying force: expected a node-type control!");
                }

                if (torque == null || torque.size() != 3){
                    throw new IllegalViewOperationException("Invalid impulse torque params provided!");
                }

                float[] torqueArray = { (float)torque.getDouble(0), (float)torque.getDouble(1), (float)torque.getDouble(2)};
                VRTNode nodeControl = (VRTNode) viroView;
                nodeControl.applyTorqueImpulse(torqueArray);
            }
        });
    }

    @ReactMethod
    public void setVelocity(final int viewTag, final ReadableArray velocity) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View viroView = nativeViewHierarchyManager.resolveView(viewTag);
                if (!(viroView instanceof VRTNode)){
                    throw new IllegalViewOperationException("Invalid view returned when applying velocity: expected a node-type control!");
                }

                if (velocity == null || velocity.size() != 3){
                    throw new IllegalViewOperationException("Invalid velocity params provided!");
                }

                float[] velocityArray = { (float)velocity.getDouble(0), (float)velocity.getDouble(1), (float)velocity.getDouble(2)};
                VRTNode nodeControl = (VRTNode) viroView;
                nodeControl.setVelocity(velocityArray, false);
            }
        });
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\SceneModule.java

/*


    @ReactMethod
    public void findCollisionsWithRayAsync(final int viewTag, final ReadableArray fromPos, final ReadableArray toPos,
                               final boolean closest, final String tag, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(viewTag);
                if (!(sceneView instanceof VRTScene)) {
                    throw new IllegalViewOperationException("Invalid view returned when " +
                            "calling findCollisionsWithRayAsync: expected a ViroScene!");
                }

                float[] fromPosArray = Helper.toFloatArray(fromPos);
                float[] toPosArray = Helper.toFloatArray(toPos);
                if (fromPosArray.length != 3 || toPosArray.length !=3){
                    throw new IllegalViewOperationException("Invalid From / To positions or tag " +
                            "provided for findCollisionsWithRayAsync!");
                }

                String rayCastTag = tag != null ? tag : "";
                VRTScene scene = (VRTScene) sceneView;
                scene.findCollisionsWithRayAsync(fromPosArray, toPosArray, closest, rayCastTag,
                        new PhysicsWorld.HitTestListener() {
                            @Override
                            public void onComplete(boolean hasHit) {
                                promise.resolve(hasHit);
                            }
                        });

            }
        });
    }

    @ReactMethod
    public void findCollisionsWithShapeAsync(final int viewTag, final ReadableArray fromPos, final ReadableArray toPos,
                               final String shapeTypeString, final ReadableArray paramsArray,
                               final String tag, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View sceneView = nativeViewHierarchyManager.resolveView(viewTag);
                if (!(sceneView instanceof VRTScene)) {
                    throw new IllegalViewOperationException("Invalid view returned when " +
                            "calling findCollisionsWithShapeAsync: expected a ViroScene!");
                }

                float[] fromPosArray = Helper.toFloatArray(fromPos);
                float[] toPosArray = Helper.toFloatArray(toPos);
                if (fromPosArray.length != 3 || toPosArray.length !=3){
                    throw new IllegalViewOperationException("Invalid From / To positions or tag " +
                            "provided for findCollisionsWithShapeAsync!");
                }

                float[] params = Helper.toFloatArray(paramsArray);
                String error = PhysicsBody.checkIsValidShapeType(shapeTypeString, params);
                if (error != null){
                    throw new IllegalViewOperationException(error);
                }

                PhysicsShape shape = null;
                if (shapeTypeString.equalsIgnoreCase("sphere")) {
                    shape = new PhysicsShapeSphere(params[0]);
                }
                else if (shapeTypeString.equalsIgnoreCase("box")) {
                    shape = new PhysicsShapeBox(params[0], params[1], params[2]);
                }
                else if (shapeTypeString.equalsIgnoreCase("compound")) {
                    shape = new PhysicsShapeAutoCompound();
                }
                else {
                    throw new JSApplicationCausedNativeException("Invalid shape type [" + shapeTypeString + "]");
                }

                String rayCastTag = tag != null ? tag : "";
                VRTScene scene = (VRTScene) sceneView;
                scene.findCollisionsWithShapeAsync(fromPosArray, toPosArray, shape, rayCastTag,
                        new PhysicsWorld.HitTestListener() {
                            @Override
                            public void onComplete(boolean hasHit) {
                                promise.resolve(hasHit);
                            }
                        });
            }
        });
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\SceneNavigatorModule.java

/*

    used in :

    @ReactMethod
    public void project(final int sceneNavTag, final ReadableArray point, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View view = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (view instanceof VRTVRSceneNavigator) {
                    VRTVRSceneNavigator sceneNavigator = (VRTVRSceneNavigator) view;
                    float[] projectPoint = {0,0,0};
                    projectPoint[0] = (float)point.getDouble(0);
                    projectPoint[1] = (float)point.getDouble(1);
                    projectPoint[2] = (float)point.getDouble(2);
                    Vector projectedPoint = sceneNavigator.projectPoint(new Vector(projectPoint[0], projectPoint[1], projectPoint[2]));

                    WritableMap returnMap = Arguments.createMap();
                    WritableArray writablePosArray = Arguments.createArray();
                    writablePosArray.pushDouble(projectedPoint.x);
                    writablePosArray.pushDouble(projectedPoint.y);
                    returnMap.putArray("screenPosition", writablePosArray);
                    promise.resolve(returnMap);
                }
            }
        });
    }

    @ReactMethod
    public void unproject(final int sceneNavTag, final ReadableArray point, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View view = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (view instanceof VRTVRSceneNavigator) {
                    VRTVRSceneNavigator sceneNavigator = (VRTVRSceneNavigator) view;
                    float[] unprojectPoint = {0,0,0};
                    unprojectPoint[0] = (float)point.getDouble(0);
                    unprojectPoint[1] = (float)point.getDouble(1);
                    unprojectPoint[2] = (float)point.getDouble(2);
                    Vector unProjectedPoint = sceneNavigator.unprojectPoint(new Vector(unprojectPoint[0], unprojectPoint[1], unprojectPoint[2]));

                    WritableMap returnMap = Arguments.createMap();
                    WritableArray writablePosArray = Arguments.createArray();
                    writablePosArray.pushDouble(unProjectedPoint.x);
                    writablePosArray.pushDouble(unProjectedPoint.y);
                    writablePosArray.pushDouble(unProjectedPoint.z);
                    returnMap.putArray("position", writablePosArray);
                    promise.resolve(returnMap);
                }
            }
        });
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\SoundModule.java

/*

    used in :

    @ReactMethod
    public void unloadSounds(ReadableArray soundArray) {
        for (int i = 0; i < soundArray.size(); i++) {
            String keyToRemove = soundArray.getString(i);
            SoundData dataToRemove = mSoundDataMap.get(keyToRemove);
            if (dataToRemove != null) {
                dataToRemove.destroy();
                mSoundDataMap.remove(keyToRemove);
            }
        }
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\module\VRT3DSceneNavigatorModule.java

/*

    used in :

    @ReactMethod
    public void project(final int sceneNavTag, final ReadableArray point, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View view = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (view instanceof VRT3DSceneNavigator) {
                    VRT3DSceneNavigator sceneNavigator = (VRT3DSceneNavigator)view;
                    float[] projectPoint = {0,0,0};
                    projectPoint[0] = (float)point.getDouble(0);
                    projectPoint[1] = (float)point.getDouble(1);
                    projectPoint[2] = (float)point.getDouble(2);
                    Vector projectedPoint = sceneNavigator.projectPoint(new Vector(projectPoint[0], projectPoint[1], projectPoint[2]));

                    WritableMap returnMap = Arguments.createMap();
                    WritableArray writablePosArray = Arguments.createArray();
                    writablePosArray.pushDouble(projectedPoint.x);
                    writablePosArray.pushDouble(projectedPoint.y);
                    returnMap.putArray("screenPosition", writablePosArray);
                    promise.resolve(returnMap);
                }
            }
        });
    }

    @ReactMethod
    public void unproject(final int sceneNavTag, final ReadableArray point, final Promise promise) {
        UIManagerModule uiManager = getReactApplicationContext().getNativeModule(UIManagerModule.class);
        uiManager.addUIBlock(new UIBlock() {
            @Override
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                View view = nativeViewHierarchyManager.resolveView(sceneNavTag);
                if (view instanceof VRT3DSceneNavigator) {
                    VRT3DSceneNavigator sceneNavigator = (VRT3DSceneNavigator) view;
                    float[] unprojectPoint = {0,0,0};
                    unprojectPoint[0] = (float)point.getDouble(0);
                    unprojectPoint[1] = (float)point.getDouble(1);
                    unprojectPoint[2] = (float)point.getDouble(2);
                    Vector unProjectedPoint = sceneNavigator.unprojectPoint(new Vector(unprojectPoint[0], unprojectPoint[1], unprojectPoint[2]));

                    WritableMap returnMap = Arguments.createMap();
                    WritableArray writablePosArray = Arguments.createArray();
                    writablePosArray.pushDouble(unProjectedPoint.x);
                    writablePosArray.pushDouble(unProjectedPoint.y);
                    writablePosArray.pushDouble(unProjectedPoint.z);
                    returnMap.putArray("position", writablePosArray);
                    promise.resolve(returnMap);
                }
            }
        });
    }

*/

//   - viro_bridge\src\main\java\com\viromedia\bridge\utility\Helper.java

/*

    used in :

    public static float[] toFloatArray(@Nullable ReadableArray value, float[] defaultValue) {
        float[] parsedValue = toFloatArray(value);
        if (parsedValue == null){
            return defaultValue;
        }

        return parsedValue;
    }

    public static @Nullable float[] toFloatArray(@Nullable ReadableArray value) {
        if (value == null){
            return null;
        }

        float[] result = new float[value.size()];
        for (int i = 0; i < value.size(); i++) {
            result[i] = (float) value.getDouble(i);
        }
        return result;
    }

    public static Vector toVector(ReadableArray value) {
        if (value == null) {
            return null;
        }

        if (value.size() != 3) {
            throw new IllegalArgumentException("Vectors require 3 values.");
        }

        return new Vector((float) value.getDouble(0), (float) value.getDouble(1), (float) value.getDouble(2));
    }

*/ 