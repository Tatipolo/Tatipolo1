package com.company;

import java.io.*;

public class Main {


    public static void main(String[] args) {
        // Файл и папка с точки зрения джавы это одно и тоже
        // абсолютный путь к файлу
        File f = new File("C:\\Programs\\1.txt");
        if (f.exists()) {
            System.out.println("Файл существует");
        } else {
            System.out.println("Файл не существует");
        }
        // относительный путь к файлу
        File ff = new File("1.txt");
        if (!ff.exists()) {
            try {
                ff.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        // проверяем файл на доступность записи, выставлен ли атрибут "только для чтения"
        System.out.println(ff.canWrite());
        // удаляет файл сразу после вызова
        // ff.delete();
        // удаляет файл после завершения программы
        //ff.deleteOnExit();
        // работа с папкой
        File dir = new File("C:\\Python27");
        String[] files = dir.list();
        for (int i = 0; i < files.length; i++){
        System.out.println(files[i]);
    }
        File dir2 = new File("D:\\Test\\Hello");
        if (!dir2.exists()){
            // мкдир создает только последнюю папку в иерархии
            //dir2.mkdir();
            // мк дирс создает все папки по указанному пути
            dir2.mkdirs();
        }
        // Чтение текстового файла
        try {
            FileReader fr = new FileReader(ff);
            int c = fr.read();
            while (c != -1){
                System.out.print((char)c);
                c = fr.read();
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Запись в файл
        try {
            FileWriter fw = new FileWriter("2.txt");
            fw.write("Hello\nworld");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // преобразование строки в число
        try {
            FileReader fr2 = new FileReader("input.txt");
            int c = fr2.read();
            String number ="";
            while (c != -1) {
                if ((char)c == ' '){
                   int v = Integer.parseInt(number);
                   System.out.println(" ");
                   System.out.println(v * v);
                   number = "";
                }else {

                number += (char)c;
                }
                c = fr2.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
