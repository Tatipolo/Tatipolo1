package com.company;

public class Animal {
    //Свойство объекта
    public float weight;
    public String color;
    private float height;
    protected int age;



    //Методы объекта
    public void eat(){
        System.out.println("animal eat");
    }

    // перегрузка метода
    void sleep(){
        System.out.println("animal sleep");
    }

    public void sleep(int h){
        System.out.print("animal sleep ");
        System.out.print(h);
        System.out.println(" hours");
    }

    public void sleep(int h, int m){
        System.out.print("animal sleep ");
        System.out.print(h);
        System.out.print(" hours ");
        System.out.print(m);
        System.out.println(" min");

    }

}
