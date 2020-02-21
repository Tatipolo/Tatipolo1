package com.company;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    //Аргументы
        int sum = 0;
        for (String arg: args){
            int d = Integer.parseInt(arg);
            sum += d;
        }
        System.out.print("Сумма чисел = ");
        System.out.println(sum);

        // системные переменные
        //geteven - возвращает список системных переменных (переменных среды)
        Map<String, String> envs = System.getenv();
        System.out.println(envs.get("Path"));
        System.out.println(System.getenv("TEMP"));

    }
}
