var exec = require('cordova/exec');

module.exports.add = function (arg0, success, error) {
  exec(success, error, 'GPSBackground', 'add', [arg0]);
};
