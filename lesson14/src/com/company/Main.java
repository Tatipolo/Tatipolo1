package com.company;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	    // FILO - первый вошел последний вышел
        Stack<String> stack = new Stack<>();
        // add добавляет элементы в стек
        stack.add("element 1");
        stack.add("element 2");
        stack.add("element 3");
        stack.add("element 4");
        System.out.println(stack);
        //pop - достает верхний элемент стэка
        System.out.println(stack.pop());
        System.out.println("Стэк после вызова команды pop");
        System.out.println(stack);
        stack.push("element 5");
        System.out.println("Стэк после добавления нового элемента(push)");
        System.out.println(stack);

        // peek - возвращает "верхний " элемент стэка без его удаления
        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.print("Элемент \" element 2\" находится по номеру:");
        System.out.println(stack.search("element 2"));
        // очищаем коллекцию
        stack.clear();


       // System.out.println(stack.pop());

        // FIFO - первый пришел первый вышел
        Queue<String> queue = new PriorityQueue<>(3);
        queue.add("q1");
        queue.add("q2");
        queue.add("q3");
        System.out.println(queue);
        // poll, remove - достает первый эллемент в очереди
        System.out.println(queue.poll());
        System.out.println(queue);
        // peek. element - возвращают первый элемент без удаления
        System.out.println(queue.peek());
        if (queue.offer("q4")) {
            System.out.println("Элемент добавлен");
        } else {
            System.out.println("Неудалось добавить элемент");
        }
        UserComparator comparator = new UserComparator();
        Queue<User> users = new PriorityQueue<>(comparator);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            User u = new User();
            u.setMoney(rand.nextInt(1000));
            users.add(u);
        }
        while (true){
            User u = users.poll();
            if (u == null){
                break;
            }
            System.out.println(u);
        }

        System.out.println(fact1(5));
        System.out.println(fact2(5));
    }
    // нахождение факториала
    public static int fact1(int n) {
        int f = 1;
        for (;n != 1;n--){
            f *=n;
        }
        return f;
    }
    public static int fact2 (int n) {
        if (n == 0){
            return  1;
        }
        return n * fact2(n-1);
    }

}
