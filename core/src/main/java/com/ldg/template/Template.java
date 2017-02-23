package com.ldg.template;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.ldg.template.gamestates.GameStateManager;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Template extends ApplicationAdapter {

    GameStateManager gameStateManager;

    @Override
    public void create() {
        //Initialize the gamestatemanager
        gameStateManager = new GameStateManager();
    }

    @Override
    public void render() {
        //clear the screen every frame
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //update and draw the gamestatemanager each frame
        gameStateManager.update(Gdx.graphics.getDeltaTime());
        gameStateManager.draw();
    }

    @Override
    public void dispose() {
        //dispose the gamestatemanager along with any states before the game has been closed
        gameStateManager.dispose();
    }
}