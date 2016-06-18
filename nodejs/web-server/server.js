var fs = require('fs');
var config = JSON.parse(fs.readFileSync('config.json'));
var host = config.host;
var port = config.port;
var express = require("express");

var app = express();


app.use(app.route);
app.use(express.static(__dirname + "/public"));


app.get("/", function (request, response) {
    response.send("Am doing it!");
});

// TO RUN THE SERVER

var server = app.listen(port, host);

// IF YOU WANT TO GET NOTIFIED THE SERVER IS RUNNING


// var server = app.listen(port, function() {
//     console.log('Listening on port %d', server.address().port);
// });