package com.sikku.thread.sync;

public class WaitNotify {

    public static void main(String[] args) throws InterruptedException {
        Test mt = new Test();

        Thread t = new Thread(mt::sum);
        t.start();
        Thread.sleep(1000);

        synchronized (mt) {
            System.out.println("Main thread is in waiting state: ");
            mt.wait(1000);
            System.out.println("Main found notification:");
            System.out.println(mt.total);
        }

    }
}

class Test {
    int total = 0;

    public void sum() {
        synchronized (this) {
            System.out.println("Child start calculation:");
            for (int i = 1; i <= 100; i++) {
                total += i;
            }
            this.notify();
            System.out.println("Child giving notification:");
        }
    }
}
