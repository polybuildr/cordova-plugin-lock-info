var exec = require("cordova/exec");

function getLockInfo (success, error) {
    exec(
        success,
        error,
        'LockInfoPlugin',
        'isLocked',
        []
    );
}

module.exports.getLockInfo = getLockInfo;
