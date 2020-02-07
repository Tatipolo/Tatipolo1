package com.company;

public class Main {

    public static void main(String[] args) {
        long t = System.currentTimeMillis();
	    for (int i=0; i <10000000 ; i++){
	        double d = Math.atan(12) * Math.sin(i * 9) * Math.exp(23 - i);
        }
	    System.out.println(System.currentTimeMillis() - t);


	    Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i=0; i <5000000 ; i++){
                    double d = Math.atan(12) * Math.sin(i * 9) * Math.exp(23 - i);
                }
            }
        };
	    Thread t1 = new Thread(r);
	    MyThread t2 =new MyThread();
        t = System.currentTimeMillis();
	    t1.start();
	    t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(System.currentTimeMillis() - t);

        MyClass m = new MyClass();
        Thread tt1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++){
                    m.calc(1);
                    m.calc2(1, "A");
                }
            }
        });
        Thread tt2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++){
                    m.calc(-1);
                    m.calc2(-1,"B");
                }
            }
        });
        tt1.start();
        tt2.start();

        try {
            tt1.join();
            tt2.join();
        }
        catch (Exception e) { }

        System.out.println(m.value);
        System.out.println(m.value2);
    }
}
