var fs = require('fs');
var path = process.argv[2];

fs.readdir(path, 'utf8', function(err,list) {
  var lines = list.split('\n');
  console.log(lines.length-1);
});