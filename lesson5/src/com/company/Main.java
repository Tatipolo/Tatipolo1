package com.company;

public class Main {

    /*
    Принципы ООП
    1. Инкапсуляция
    2. Полиморфизм
    3. Наследование
    4. Абстракция
    */
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.color = "black";
        animal.weight = 12.4f;
        animal.eat();
        animal.sleep();
        animal.sleep(12);
        animal.sleep(10,45);
        System.out.println(animal.color);
        System.out.println(animal.weight);
        // ссылочность
        Animal animal2 = animal;
        animal2.color = "blue";
        System.out.println(animal.color);
        System.out.println(animal2.color);
        test(animal);
        System.out.println(animal.color);
        //
        Dog dog = new Dog();
        dog.color = "write";
        dog.weight = 10;
        dog.sleep(3);
        dog.breed = "Овчарка";
        dog.bark();
        dog.eat();
        // полиморфизм
        Animal animal3 = new Dog();
        animal3.eat();
        sleep(animal);
        sleep(dog);
        sleep(animal3);

    }
    public static void test(Animal a) {
        a.color = "red";
    }
    // sleep обобщенный метод
    public static void sleep(Animal a){
        a.sleep(10);
    }
}
