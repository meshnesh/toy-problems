var fs = require('fs');
var content = fs.readFileSync('./config.json');
console.log("content: " + content);

var config = JSON.parse(content);
console.log('config: ', config);
console.log('Username: ', config.username);