package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but = findViewById(R.id.btn);
        TextView tv = findViewById(R.id.tv);
        tv.setText(" hello world2 ");
        but.setVisibility(View.GONE);
        Dog dog=new Dog();
        move(dog);
    }

    public void move(Anim anim) {
        anim.move();
    }
}
