package com.company;

public class Main {

    public static void main(String[] args) {

        //System.out.println("Hello world");
        /*
        int, uint - 4 байта (только целые числа)
        short - 2 байта(только целые числа)
        byte - 1 байт (только целые числа)
        float - 4 байта(вещественные числа)
        double - 8 байт(вещественные значения)
        boolean  - 1 байт(true или false)
        */
        int x;
        //присваивание(установка значения)
        x = 12;
        int y = 20;
        float z = 1.234235f;
        double d = 1.3234;
        boolean b = true;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        //Явное преобразование типов
        System.out.println((float) x/y);
        System.out.println(x*(y+1));

            }
}
