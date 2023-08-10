package com.sikku.thread.sync;

public class JoinJoin {
    static Thread t1;
    static Thread t2;

    public static void main(String[] args) throws InterruptedException {
        t1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 1");
                try {
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Thread 1");

        t1.start();

        t2 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 2");
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Thread 2");



        t2.start();
    }
}