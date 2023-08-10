package com.sikku.thread;

public class Second {
    public static void main(String[] args) {
        Thread t1 = new Thread("my thread") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
            }
        };

        t1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main thread");
        }
    }
}
