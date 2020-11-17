package ru.vilikdin.java;


public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);

        maxRun = 200;
        maxJump = 2;
        maxSwim = -1;
    }


    @Override
    public void swim(double length) {
        System.out.println("Это коты, они не плавают!");
    }
}
