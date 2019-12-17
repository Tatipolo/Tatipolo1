package com.company;

public class User {
    private String name;
    private int age;


    @Override
    public boolean equals(Object obj){
        User user = (User)obj; // Явное преобразование obj к типу User если явное преобразование не
        // возможно то в результате запишится null
        // Поскольку свойство name является объектом типа String то его сравнение должно
        // проводится через метот equals
        return this.age == user.age && this.name.equals(user.name);

    }

    @Override
    public int hashCode(){
        if (this.age > 18){
            return 1;
        }
        return 2;
    }

    @Override
    public String toString(){
        return this.name;
    }

    // Геттер свойства name
    public String getName(){
        return this.name;
    }
    // сеттер свойство name
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120){
            System.out.println("Недопустимые значения");

        }else {
            this.age = age;
        }
    }
}
