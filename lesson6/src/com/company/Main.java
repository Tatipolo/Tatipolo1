package com.company;

public class Main {

    public static void main(String[] args) {
       /*
        Animal animal = new Animal("white", 10);
        System.out.println(animal.color);
        System.out.println(animal.age);
        Animal animal2 = new Animal("red", 15);
        System.out.println(animal2.color);
        System.out.println(animal2.age);
        */

        Dog dog = new Dog();
        // обращение к статическим полям класса осуществляется через название класса
        dog.footCount = 4;
        System.out.println(dog.footCount);
        System.out.println(dog.color);
        Dog dog2 = new Dog ("blue", 6, "rex" );
        System.out.println(dog2.footCount);
        System.out.println(dog2.age);
        System.out.println(dog2.name);
        dog2.say("aw - aw");
        Dog.Cat cat = new Dog.Cat();
        cat.name = "Rainbow";
        dog.bark();
        Dog.bark();


    }
}
