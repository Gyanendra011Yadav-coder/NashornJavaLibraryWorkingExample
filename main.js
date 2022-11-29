var sfs=null;
//load('C:/Adda52/BotCode/VirtualBotPoker/lib/sfs2x-api-1.7.11.js');
//------------------------------------
// USER INTERFACE HANDLERS
//------------------------------------

var functionOfConnection = function onConnectBtClick() {
	alert("Connecting...");
	var config = {};
	config.host = "sfsshowdown.adda52.com";
	config.port = 8893;
	config.zone = "PokerKing";
	config.debug = true;
	config.useSSL = false;
    print("SFS Config:", config);

	sfs = new SFS2X.SmartFox(config);
	return sfs.addEventListener(SFS2X.SFSEvent.CONNECTION, onConnection, this);
}

functionOfConnection();
//Function to Trigger OnConnectionButton
function onConnection(event) {
print("Entering Connection Function");
	if (event.success) {
		var ret = "Connected to SmartFoxServer 2X!<br>SFS2X API version: " + sfs.version;
	} else {
		var ret = "Connection failed: ";
	}

	return ret;
}













//load('main2.js');
//
//var function1 = function(name){
//    function2();
//    var myName="Gyanendra_Yadav";
//    print("Hello "+name);
//    return myName;
//}
