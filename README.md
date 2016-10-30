# cordova-plugin-lock-info

Cordova plugin to check if an Android phone is locked or not.

## Usage

This plugin is available as `cordova.plugins.lockInfo`. It has just one method: `isLocked`. Example:

```js
function successCallback(isLocked) {
    if (isLocked) {
        console.log('Phone is locked.');
    } else {
        console.log('Phone is unlocked.');
    }
}

cordova.plugins.lockInfo.isLocked(
    successCallback,
    errorCallback
);
```

## License

Apache-2.0
