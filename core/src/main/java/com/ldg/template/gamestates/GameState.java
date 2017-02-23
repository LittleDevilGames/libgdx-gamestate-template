package com.ldg.template.gamestates;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by User for Template.
 * Copyright 2/23/2017
 */
public abstract class GameState {

    //Gamestatemanager for all states so the setState method can be called
    protected GameStateManager gameStateManager;

    //Spritebatch and shaperenderer for use by all states
    protected SpriteBatch sb;
    protected ShapeRenderer sr;

    public GameState(GameStateManager gameStateManager) {
        this.gameStateManager = gameStateManager;

        sb = new SpriteBatch();
        sr = new ShapeRenderer();

        Gdx.app.log(this.getClass().getSimpleName(), "Initializing");

        init();
    }

    //Initialize any variables
    public abstract void init();
    //update the state every frame
    public abstract void update(float dt);
    //draw the graphics to the screen
    public abstract void draw();
    //dispose any variables so the GC can work
    public abstract void dispose();

}
