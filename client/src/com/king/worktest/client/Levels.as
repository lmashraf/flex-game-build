package com.king.worktest.client {
import flash.display.Sprite;
import flash.utils.ByteArray;

public class Levels extends Sprite {
    [Embed(source="../../../../../generated/requiredScores.json", mimeType="application/octet-stream")] const RequiredScores:Class;

    public function Levels() {

        var data : ByteArray = new RequiredScores() as ByteArray;
        var jsonString : String = data.readUTFBytes(data.length);

        var levels:Array = JSON.parse(jsonString) as Array;


        for (var i:int = 0; i < levels.length; i++) {
            var name:String = levels[i].name;
            var score:int = levels[i].score;
            var levelView:LevelView = new LevelView(name, score);
            levelView.y = i*50;
            addChild(levelView);
        }
    }
}
}
