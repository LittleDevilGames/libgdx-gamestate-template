package com.ldg.template.gamestates;

/**
 * Created by User for Template.
 * Copyright 2/23/2017
 */
public class GameStateManager {

    //public enum used for setting the state
    public enum State {
        SPLASH, MENU, PLAY
    }

    GameState gameState;

    //Set the state as soon as the gamestatemanager initializes
    public GameStateManager() {
        setState(State.SPLASH);
    }

    //can be called from the gamestates to change the state
    public void setState(State state) {
        //if the gamestate is already assigned, dispose it
        if(gameState != null) gameState.dispose();

        //once the gamestate has been disposed set it to a new one
        switch (state) {
            case SPLASH:
                gameState = new SplashState(this);
            case MENU:
            case PLAY:
        }
    }

    //update the state
    public void update(float dt) {
        gameState.update(dt);
    }

    //draw the state
    public void draw() {
        gameState.draw();
    }

    //dispose the state
    public void dispose() {
        gameState.dispose();
    }

}
