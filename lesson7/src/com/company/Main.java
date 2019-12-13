package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Bankomat bankomat = new Bankomat();
        Scanner sc = new Scanner(System.in);
        System.out.println("Вставьте карту");
        String cardID = sc.nextLine();
        boolean success = false;
        for (int i = 0; i < 3; i++){
            System.out.println("Введите пинкод");
            String pin = sc.nextLine();
            if (bankomat.checkPing(cardID, pin)){
                success = true;
                break;
            }
            System.out.println("Неверный пин");
        }
        if (!success){
            System.out.println("Ваша карта заблокирована");
            return;
        }
        while (true){
            System.out.println("Главное меню");
            System.out.println("1 Показать баланс");
            System.out.println("2 Снять наличные");
            System.out.println("3 Пополнить счет");
            System.out.println("4 Завершить работу");
            int menu = sc.nextInt();
            switch (menu){
                case 4:
                    bankomat.reject();
                    return;
                case 1:
                    float balance = bankomat.getBalance();
                    System.out.println(balance);
                    break;
                case 2:
                    System.out.println("ВВедите сумму");
                    float cash =sc.nextFloat();
                    bankomat.getCash(cash);
                    break;
                case 3:
                    System.out.println("ВВедите сумму");
                    cash =sc.nextFloat();
                    bankomat.addCash(cash);
                    break;
            }
        }
    }
}
