package com.sikku.thread;

public class Join {
    static Thread mt;

    public static void main(String[] args) throws InterruptedException {
        Join.mt = Thread.currentThread();

        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
                try {
                    mt.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
            Thread.sleep(2000);
        }

    }
}
