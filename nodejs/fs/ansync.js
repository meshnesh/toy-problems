// READING TEXT FILE ASYNCHRONOUSLY USING FILE SYSTEMS IN NODEJS


var fs = require('fs');
fs.readFile("./sample.txt", function (err, data) {
    console.log("contents: " + data);
});