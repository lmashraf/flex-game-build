package com.king.worktest.client {
import flash.display.DisplayObject;
import flash.display.Sprite;

[SWF(backgroundColor="#ffffff", frameRate="60", width="755", height="600")]
public class Client extends Sprite {

    [Embed(source="../../../../../assets/king.png")] const KingImage:Class;

    public function Client() {
        var imageDecider:KingImageDecider = new KingImageDeciderImpl();


        if (imageDecider.showImage()) {
            var kingImage:DisplayObject = new KingImage();
            kingImage.x = 10;
            kingImage.y = 10;
            addChild(kingImage);
        }
        var levels:Levels = new Levels();
        levels.y = 150;
        addChild(levels);
    }
}
}
