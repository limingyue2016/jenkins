package com.example.myapplication;

import android.util.Log;

public class Dog extends Anim {
    @Override
    public void move() {
        super.move();
        Log.i(TAG, "Dog move");
    }
}
