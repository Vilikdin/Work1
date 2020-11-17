package ru.vilikdin.java;

public class Animal {

    protected String name;
    protected String color;
    protected int age;
    protected int maxRun;
    protected double maxJump;
    protected int maxSwim;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    public void run(double length){

        if (maxRun >= length){
            System.out.println(this.name + " Пробежал(а): " + length + "м.");
        }else{
            System.out.println("Для " + this.name + " слишком большая или слишком маленькая дистанция");
        }


    }


    public void swim(double length){

        if (maxSwim>= length){
            System.out.println(this.name + " Проплыл(а): " +length + "м.");
        }else {
            System.out.println("Для " + this.name + " слишком большая или слишком маленькая высота");
        }


    }


    public void jump(double height){
        if (maxJump >= height) {
            System.out.println(this.name + " Прыгнул(а): " + height + "м.");
        }else{

            System.out.println("Для " + this.name + " слишком большая или слишком маленькая высота");
        }

    }


}
