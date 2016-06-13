var fs = require('fs');
console.log('Started!');
 var config = JSON.parse(fs.readFileSync('./config.json'));
console.log('Initial config: ', config);