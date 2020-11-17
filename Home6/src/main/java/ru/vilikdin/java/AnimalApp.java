package ru.vilikdin.java;

public class AnimalApp {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Бобик", "Черный", 3);
        Dog dog2 = new Dog("Шарик", "Белый", 4);
        Cat cat1 = new Cat("Барсик", "Рыжий", 2);
        Cat cat2 = new Cat("Бася", "Серый", 3);


        System.out.println("КОТЫ:");
        cat1.run(125);
        cat2.run(5);
        cat1.jump(1);
        cat2.jump(15);
        cat1.swim(20);
        cat2.swim(0);

        System.out.println("--------------------");

        System.out.println("СОБАКИ:");
        dog1.run(250);
        dog2.run(700);
        dog1.jump(4);
        dog2.jump(1);
        dog1.swim(50);
        dog1.swim(3);


    }
}
