<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
    <script type="text/javascript" src="/js/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="/js/swfobject.js"></script>


</head>
<body>

<script type="text/javascript">
    $(document).ready(function () {
        showGame();
    });
</script>

<script type="text/javascript">
    function showGame() {

        var flashvars = {
        };

        var params = {
            swLiveConnect: "true",
            allowFullScreen: "true",
            allowScriptAccess: "always",
            wmode: "direct"
        };

        var attributes = {};
        swfobject.switchOffAutoHideShow();
        swfobject.embedSWF("/WorkClient.swf?x=" + (new Date()).getMilliseconds(), "game", "755", "600", "10.1.0", "loader.swf", flashvars, params, attributes, function (callbackObj) {
        });
    }
</script>

<div id="gameContainer">
    <div><img id="pause" style="display:none"></img></div>
    <div id="game"></div>
</div>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>


</body>
</html>

