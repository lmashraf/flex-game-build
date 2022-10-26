package com.king.worktest.client {
import flash.display.Sprite;
import flash.text.TextField;

public class LevelView extends Sprite {

    public function LevelView(name:String, score:int) {

        var nameTextField:TextField = new TextField();
        nameTextField.text = "Name:  " + name;

        var currentScoreTextField:TextField = new TextField();
        currentScoreTextField.text = "Score:  " + score;

        currentScoreTextField.x = 100;

        addChild(nameTextField);
        addChild(currentScoreTextField);
    }


}
}
