package com.ldg.template.gamestates;

/**
 * Created by User for Template.
 * Copyright 2/23/2017
 */
public class GameStateManager {

    public enum State {
        SPLASH, MENU, PLAY
    }

    GameState gameState;

    public GameStateManager() {
        setState(State.SPLASH);
    }

    public void setState(State state) {
        if(gameState != null) gameState.dispose();

        switch (state) {
            case SPLASH:
                gameState = new SplashState(this);
            case MENU:
            case PLAY:
        }
    }

    public void update(float dt) {
        gameState.update(dt);
    }

    public void draw() {
        gameState.draw();
    }

    public void dispose() {
        gameState.dispose();
    }

}
