package com.company;

// в джава невозможно создать экземпляр объекта абстрактного класса!!!
public abstract class Animal {
    public String color;
    public int age;
    /*
    public Animal() {
        color = "black";
        age = 1;
        System.out.println("animal was created");
    }

     */

    public Animal(String color, int age){
        // this это ссылка на текущий экземпляр объекта
        this.color= color;
        this.age = age;

    }

    public abstract void say(String word);
}
