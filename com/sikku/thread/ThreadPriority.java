package com.sikku.thread;

public class ThreadPriority {

    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("child thread");
            }
        };


        Thread t = new Thread(r);
        System.out.println(t.getPriority());
        t.setPriority(10);
        System.out.println(t.getPriority());
        t.start();

//         Thread.currentThread().setPriority(10);
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}
