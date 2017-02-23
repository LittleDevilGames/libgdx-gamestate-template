package com.ldg.template.gamestates;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by User for Template.
 * Copyright 2/23/2017
 */
public abstract class GameState {

    protected GameStateManager gameStateManager;

    protected SpriteBatch sb;
    protected ShapeRenderer sr;

    public GameState(GameStateManager gameStateManager) {
        this.gameStateManager = gameStateManager;

        sb = new SpriteBatch();
        sr = new ShapeRenderer();

        Gdx.app.log(this.getClass().getSimpleName(), "Initializing");

        init();
    }

    public abstract void init();
    public abstract void update(float dt);
    public abstract void draw();
    public abstract void dispose();

}
