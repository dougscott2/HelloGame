package com.theironyard.hellogame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HelloGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;


    float x = 0;
    float y = 0;
    float xv = 0; //velocity variables
    float yv = 0;

    final float MAX_VELOCITY = 100;




	
	@Override
	public void create () { //only runs once right when the game loads up
		batch = new SpriteBatch();
		img = new Texture("dickbutt.jpg");
	}

	@Override
	public void render () {//called about 60 times per second. super important.
		if (Gdx.input.isKeyPressed(Input.Keys.UP) || Gdx.input.isKeyPressed(Input.Keys.W)){ //WASD controls
            yv = MAX_VELOCITY;

        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN) || Gdx.input.isKeyPressed(Input.Keys.S)){
            yv = MAX_VELOCITY * -1;

        }
        if (Gdx.input.isKeyPressed((Input.Keys.RIGHT)) || Gdx.input.isKeyPressed(Input.Keys.D)){
            xv = MAX_VELOCITY;

        }
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A)){
           xv = MAX_VELOCITY * -1;

        }

        x += xv * Gdx.graphics.getDeltaTime();  //getting delta time (time since last frame)
        y += yv * Gdx.graphics.getDeltaTime();

        xv *= 0.9;
        yv *= 0.9;


        Gdx.gl.glClearColor(1, 0, 0, 1);    //r, g, b, alpha(transparency)
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);//basically clears image so you can draw a new one on top of it
		batch.begin();
		batch.draw(img, x, y);
		batch.end();
	}
    void move() {
        if (Gdx.input.isKeyPressed(Input.Keys.UP) || Gdx.input.isKeyPressed(Input.Keys.W)){ //WASD controls
            yv = MAX_VELOCITY;

        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN) || Gdx.input.isKeyPressed(Input.Keys.S)){
            yv = MAX_VELOCITY * -1;

        }
        if (Gdx.input.isKeyPressed((Input.Keys.RIGHT)) || Gdx.input.isKeyPressed(Input.Keys.D)){
            xv = MAX_VELOCITY;

        }
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A)){
            xv = MAX_VELOCITY * -1;

        }

        x += xv * Gdx.graphics.getDeltaTime();  //getting delta time (time since last frame)
        y += yv * Gdx.graphics.getDeltaTime();

        xv *= 0.9;
        yv *= 0.9;

    }
}

