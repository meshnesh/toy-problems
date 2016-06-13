// USING FILE SYSTEMS TO WRITE TXT DOCUMENTS SYNCHRONUSLY IN NODEJS

var fs = require('fs');
console.log('Starting');
fs.writeFileSync("./write_sync.text", "This is my first write file synchronous");
console.log('Finished');