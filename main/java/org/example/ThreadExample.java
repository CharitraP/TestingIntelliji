package org.example;

class ThreadExample extends Thread {
    public void run() {
        System.out.println("Entering thread " + this.getName());
    }
}
