package com.company;

public class MyThread extends Thread {
    @Override
    public void run(){
        for (int i=5000000; i <10000000 ; i++){
            double d = Math.atan(12) * Math.sin(i * 9) * Math.exp(23 - i);
        }
    }
}
