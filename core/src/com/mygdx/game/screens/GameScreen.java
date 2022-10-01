package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.mygdx.game.core.screens.BaseScreen;
import com.mygdx.game.gameobjects.Player;

public class GameScreen extends BaseScreen {
    private Player player;
    @Override
    protected void init() {
        Gdx.app.log("SCREEN","GAME PHYSICS");
    }

    @Override
    protected void draw(float delta) {

    }
}
