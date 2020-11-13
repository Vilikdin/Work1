package ru.vilikdin.java;

//Создал класс "Сотрудник"

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;
    private boolean married;


    //Создал конструктор
    public Employee(String fullName, String position, String email, String  number, int salary, int age, boolean married) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
        this.married = married;
    }

    public int getAge() {
        return age;
    }

    //Создал метод, которые выводит инфу об объекте  в консоль
    public void printInformation(){

        System.out.println("Employee name: " + this.fullName + ", position: " + this.position + ", email:" + this.email +
                ", number:" + this.number + ", salary:" + this.salary+  ", age:" + this.age + ", married:" + this.married);
    }



}
