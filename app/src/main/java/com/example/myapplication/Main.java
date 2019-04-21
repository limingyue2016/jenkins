package com.example.myapplication;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog();
        Anim anim = new Anim();
        move(anim);
    }

    public static void move(Anim anim) {
        anim.move();
    }
}
