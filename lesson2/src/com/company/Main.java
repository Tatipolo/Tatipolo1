package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	логические операторы:
	>, <, >=, <=
	== - знак равенства
	!= - не равно
	&& - Логическое И
	|| - Логическое или
	*/
        int age =21;
        if (age >= 18) {
            System.out.println("доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }
        int a = 10, b = 20, c = 15;
        if (a >b && a >c) {
            System.out.println(a);
        } else if (b >a && b > c){
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        int month = 16;
        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                 System.out.println("такого месяца нет");
        }
        // оператор %
        System.out.println(5 % 3);
        // строка
        String name = "Vasya";
        switch (name){
            case "Vasya":
                System.out.println("оараоп");
            break;
        }
    }
}
