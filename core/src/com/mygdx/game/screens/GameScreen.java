package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.mygdx.game.gameobjects.Player;

public class GameScreen extends PhysicsScreen{
    private Player player;
    @Override
    protected void init() {
        super.init();
        Gdx.app.log("SCREEN","GAME PHYSICS");
    }

    @Override
    protected void draw() {

    }
}
