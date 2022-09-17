package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.helpers.AssetsManager;

public class MenuScreen extends BaseScreen{

    private TextButton btnPlay;
    private TextButton btnCredits;
    private Image imgLogo;

    @Override
    protected void init() {
        requiredProcessor = true;
        TextButton.TextButtonStyle style = new TextButton.TextButtonStyle();
        style.font = new BitmapFont();
        style.fontColor = Color.GOLD;
        style.overFontColor = Color.GREEN;
        style.downFontColor = Color.RED;
        btnPlay = new TextButton("Play",style);
        btnCredits = new TextButton("Credits",style);
        imgLogo = new Image(AssetsManager.getAssetManager().get("logo.png", Texture.class));
        imgLogo.setPosition(Gdx.graphics.getWidth()/2-imgLogo.getWidth()/2, Gdx.graphics.getHeight()/2-imgLogo.getHeight()/2);
        btnPlay.setPosition(40,140);
        btnPlay.setSize(200,80);
        btnCredits.setPosition(40,40);
        btnCredits.setSize(200,80);
        addActor(imgLogo);
        addActor(btnCredits);
        addActor(btnPlay);
        btnPlay.addCaptureListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                Gdx.app.log("MENU","PLAY");
            }
        });

        btnCredits.addCaptureListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                //Gdx.app.log("MENU","CREDITS");
                MyGdxGame.instance.setScreen(new CreditsScreen());
            }
        });
    }

    @Override
    protected void draw() {

    }
}
