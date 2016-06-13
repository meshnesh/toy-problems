// READING TEXT FILE ANSYNCHRONOUSLY USING FILE SYSTEMS IN NODEJS


var fs = require('fs');
console.log('Starting');
fs.writeFile("./write_ansync.txt", "This is my first Ansynchronous written text file!",function (err) {
    console.log("written file");
});
console.log('Finished');