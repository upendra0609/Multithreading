package com.sikku.thread.sync;

public class DeadLock {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Thread t1 = new Thread(() -> {
            a.d1(b);

        });
        t1.start();

        //by main thread
        b.d1(a);

    }
}

class A {
    public synchronized void d1(B b) {
        System.out.println("d1 method of A");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        b.last();
    }

    public synchronized void last() {
        System.out.println("last method of A");
    }
}

class B {
    public synchronized void d1(A a) {
        System.out.println("d1 method of B");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        a.last();
    }

    public synchronized void last() {
        System.out.println("last method of B");
    }
}