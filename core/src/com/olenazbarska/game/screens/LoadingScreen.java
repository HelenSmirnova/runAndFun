package com.olenazbarska.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.olenazbarska.game.MyInputProcessor;
import com.olenazbarska.game.RunAndFun;

/**
 * Created by helln on 13.01.2015.
 */
public class LoadingScreen implements Screen {
    private RunAndFun game;

    public LoadingScreen(RunAndFun game) {
        this.game = game;
        Gdx.input.setInputProcessor(new MyInputProcessor());
    }

    @Override
    public void render(float delta) {
        System.out.println("LoadingScreen");
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {
    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
