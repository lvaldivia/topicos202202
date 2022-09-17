package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.mygdx.game.MyGdxGame;

public abstract class BaseScreen  implements Screen {
    protected FitViewport fitViewport;
    protected Stage stage;

    public BaseScreen(){
        fitViewport = new FitViewport(640,360);
        stage = new Stage(fitViewport);
    }

    protected void addActor(Actor actor){
        stage.addActor(actor);
    }

    public FitViewport getFitViewport() {
        return fitViewport;
    }

    public void setFitViewport(FitViewport fitViewport) {
        this.fitViewport = fitViewport;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.4f,0.5f,0.8f,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        draw();
        stage.draw();
    }

    protected abstract void draw();

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        stage.dispose();
    }
}
