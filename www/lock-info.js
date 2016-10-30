window.getLockInfo = function (success, error) {
    cordova.exec(
        success,
        error,
        'LockInfoPlugin',
        'isLocked'
    );
}
