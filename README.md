# NSAR

*Simple AR for NativeScript*

This is based on [Viro](https://github.com/ViroCommunity/viro).  
[Forked to be used with NativeScript](https://github.com/c4ffeinated/ns-viro).

## TODO
This project is still WiP.
- See https://blog.nativescript.org/create-a-custom-view-plugin-marquee-label/
### Check java imports reflection
React Native allows the java codebase to directly import some React Native funtionalities. Should we try to reimplement them so that Viro can be used as-is by our NS plugin?
### Other option - Android Fragment
- https://reactnative.dev/docs/0.66/integration-with-android-fragment : `Ensure your main Application Java class implements ReactApplication`
- https://github.com/facebook/react-native/blob/main/ReactAndroid/src/main/java/com/facebook/react/ReactApplication.java
- https://github.com/facebook/react-native/blob/main/ReactAndroid/src/main/java/com/facebook/react/ReactNativeHost.java
- https://stackoverflow.com/questions/35861380/equivalent-of-android-fragments-in-nativescript
- https://docs.nativescript.org/advanced-concepts.html#extending-android-activity in nsar/apps/demo/src/app.ts
### Publish
- https://docs.nativescript.org/development-workflow.html#plugins : Publish in the official marketplace

## Submodules
- [ns-viro](https://github.com/c4ffeinated/ns-viro) : fork of Viro, make it compatible with NS, we could try to keep it as-is first.

## Build
Follow local Viro setup in the links, then the rest of the NS plugins documentation

## Viro links
- [local Viro setup](https://viro-community.readme.io/docs/developing-viro)
- [awesome-viro](https://github.com/ViroCommunity/awesome-viro)
- [virocommunity.github.io README](https://github.com/ViroCommunity/virocommunity.github.io/blob/main/README.md)
- [ViroFBX](https://github.com/ViroCommunity/ViroFBX) : `The FBX -> VRX converter`
- Viro suggestions
  - ViroCommunity/ideas_and_sugestions#3 is a suggestion about WebAR and PWA

### Unused Viro example apps (for now?)
- [ViroCommunity/samples](https://github.com/ViroCommunity/samples)
- [ViroCommunity/geoar](https://github.com/ViroCommunity/geoar) : `GeoAR Demo - Uses Google Maps Places API to fetch markers and places them around the user in a 3D space`
- [AR demos](https://github.com/ViroCommunity/ar-demos)


## NSAR plugin

- [nsar](packages/nsar/README.md)

### How to use?

This workspace manages the suite of plugins listed above. 

In general, when in doubt with what to do, just `npm start`.

## How to add a new package to workspace?

```
npm run add
```

At the prompt, enter the name of the new package.

- This adds a plugin harness in `packages` with the necessary boilerplate to just start developing
- Updates all demo app flavors to support demoing the new package
- Adds shared code in `tools/demo` where you can write demo code **once** and share across all demo flavors
- Updates build tooling to support the new package
- Updates the `npm start` interactive display
- Updates the README here to list the new package

## How to add Angular compatibility to a package

```
npm run add-angular
```

At the prompt, enter the name of the package to add an `angular` folder to it with the necessary boilerplate to provide Angular support to the package.

## How to focus on just 1 package to develop in isolation

```
npm start
```

- Choose the focus commands for the package you wish to focus on and hit enter.
- All the demo app's will be updated to isolate that 1 package and for supported IDE's (currently VS Code), the source code will also become isolated in the workspace.

Note: *good to always clean the demo you plan to run after focusing. (You can clean any demo from `npm start` as well)*

## How to publish packages?

```
npm run publish-packages
```

- You will be prompted for the package names to publish. Leaving blank and hitting enter will publish them all.
- You will then be prompted for the version to use. Leaving blank will auto bump the patch version (it also handles prerelease types like alpha, beta, rc, etc. - It even auto tags the corresponding prelease type on npm).
- You will then be given a brief sanity check 🧠😊

<h3 align="center">Made with ❤️</h3>
