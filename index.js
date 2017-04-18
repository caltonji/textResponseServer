var twilio = require('twilio');
var express = require('express');
var bodyParser = require('body-parser');

// Find your account sid and auth token in your Twilio account Console.
var client = twilio('PRIVATE', 'PRIVATE');
 
// // Send the text message.
// client.sendMessage({
//   to: '+12245672736',
//   from: '+17082942538',
//   body: 'Keep coding Tyler!'
// });

var app = express();
app.use(bodyParser.urlencoded({extended: false}));
 
app.post("/message", function (request, response) {
  console.log(request.body); 
  response.send("<Response><Message>Hello</Message></Response>")
});
 
app.get("/", function (request, response) {
  response.sendFile(__dirname + '/views/index.html');
});
 
var listener = app.listen(2456, function () {
  console.log('Your app is listening on port ' + listener.address().port);
});