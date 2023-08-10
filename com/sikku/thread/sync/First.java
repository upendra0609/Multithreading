package com.sikku.thread.sync;

import java.security.PublicKey;

public class First {
    public synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning: ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println(name);
        }

    }
}

class Main {
    public static void main(String[] args) {
        First f = new First();
        Thread t1 = new Thread(() -> {
            f.wish("Dhoni");
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            f.wish("Kohli");
        });
        t2.start();

        Thread t3 = new Thread(() -> {
            f.wish("Sachin");
        });
        t3.start();
    }
}
