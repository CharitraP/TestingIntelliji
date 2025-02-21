package org.example;

public class ThreadExample extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread("1");
        Thread t2 = new Thread("2");
        t1.start();
        t2.start();
        System.out.println(currentThread().getName());
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
