package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    User u = new User();
	    u.language = Language.EN;
	    switch (u.language) {
            case EN:
                System.out.println("Иностранный язык");
                break;
            case BY:
            case RU:
            case UA:
                System.out.println("наш язык");
        }
        System.out.println(u.language);
	    u.color = Color.GREEN;
	    System.out.println(u.color.getValue());
        Math m = Math.SUM;
        System.out.println(m.action(23,12));
        m = Math.MULTIPLY;
        System.out.println(m.action(5,4));

        //String

        String s = "hello";// так правильно
        String s2 = new String("fkvhnd");// так не рекомендуется

        // StringBuilder
        StringBuilder sb = new StringBuilder("dfjhgoegh");
        // append добавляет значение в конец исходной строки
        sb.append("ghgjf");

        // StringBuffer = StringBuilder, но потокобезопасный

        // String
        String str = "    hello world   ";
        System.out.println(str.charAt(7)); // возвращает символ строки по указанному индексу
        System.out.println(str.codePointAt(7));
        byte[] b =  str.getBytes(); //возвращает массив байт
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        // преобразовывает обратно массив байт в строку
        String strFromBytes = new String(b);
        // Сравнивает две строки между собой без учета регистра
        System.out.println("abcdef".equalsIgnoreCase("AbCdEf"));
        // возвращает индекс символа или строки в исходной строке если совпадений не найдено возвращает -1
        System.out.println(str.indexOf("wor"));
        System.out.println(str.indexOf("$"));
        // lastindexOf = indexOf но поиск начинается с конца исходной строки
        System.out.println("hello".indexOf('l'));
        System.out.println("hello".lastIndexOf('l'));
        // replase заменяет подстроку в исходной строке
        String str2 = str.replace("hello", "hi");
        System.out.println(str2);

        // split разделяет строку по символу либо строке
        str.split("");
        "hello all hi".split(" "); //[ "hello", ...., ....]
        String[] chunks = str.split(" ");
        for ( int i = 0; i < chunks.length; i++) {
            System.out.println(chunks[i]);
        }
        // выделяет подстроку в строке
        // 8 начальный индекс подстроки
        // 12 конечный индекс
        System.out.println(str.substring(8, 12));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        // 10.01.2020 Форматирование строк
        /*
        флаги форматирования
        %S - строка
        %d - целое число
        %f - вещественное число
        %b - boolean
        %с - символ
        %t - вывод даты
        %% - вывод символа процента
        \n - переход на новую строку
        \t - символ табуляции
        \b - удаляет предыдущий символ
        \\ - просто выведет \
         */
        int age = 36;
        Date d = new Date();
        String sFormat =  String.format("Меня зовут %10s. \n Мне %d лет. Мой рост %.2f см. Я хочу знать Java на 100 %% %tc",
        "Денис", age , 175.3, d );
        System.out.println(sFormat);
        String sFormat2 = String.format("Мое счастливое число - %2$d. Мой любимый цвет - %1$s", "red", 40 );
        System.out.println(sFormat2);
        // преобразование нестроковых объектов в строки
        int a = 150;
        String sa = String.valueOf(a);
        System.out.println(sa);
    }
}
