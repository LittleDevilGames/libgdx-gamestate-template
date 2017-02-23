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
        gameStateManager = new GameStateManager();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        gameStateManager.update(Gdx.graphics.getDeltaTime());
        gameStateManager.draw();
    }

    @Override
    public void dispose() {
        gameStateManager.dispose();
    }
}