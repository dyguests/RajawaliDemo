package com.fanhl.rajawalidemo;

import android.content.Context;
import android.view.MotionEvent;

import org.rajawali3d.lights.DirectionalLight;
import org.rajawali3d.primitives.Sphere;

public class Renderer extends org.rajawali3d.renderer.Renderer {
    public Context context;

    private DirectionalLight directionalLight;
    private Sphere earthSphere;

    public Renderer(Context context) {
        super(context);
        this.context = context;
        setFrameRate(60);
    }

    @Override
    protected void initScene() {

    }

    @Override
    public void onOffsetsChanged(float xOffset, float yOffset, float xOffsetStep, float yOffsetStep, int xPixelOffset, int yPixelOffset) {

    }

    @Override
    public void onTouchEvent(MotionEvent event) {

    }
}
