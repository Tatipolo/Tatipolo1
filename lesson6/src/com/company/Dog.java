package com.company;

public class Dog extends Animal {
    public String name;
    // статические свойства распологаются в памяти в единственном экзенпляре
    public static int footCount;



    public Dog(){
        super("green", 5);//вызывает конструктор родителя
        this.name = "sad";
        Cat cat = new Cat();

    }

    public Dog(String color, int age, String name){
        super(color, age);
        this.name = name;
    }
    // определение родительского абстрактного метода
    public void say(String sound){
        System.out.println("hav-hav"+ sound);
    }
    // внутренний класс (inner - класс)
    public static class Cat {
        public String name;
        Cat() {
            this.name = "I am a Cat";
            name = "I am a Dog";
        }
    }

    private class Mouse {
        Mouse(){
            name = "I am mouse";

        }
    }

    public static void bark (){
        System.out.println("bark");
        // для статических методов нельзя использовать ссылку на энкземпляр объекта
        // this.name ошибка
        sleep();
    }

    public static void sleep(){
        System.out.println("z-z-z-z-z");
    }

}
