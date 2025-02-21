package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        ThreadExample t1 = new ThreadExample();
        ThreadExample t2 = new ThreadExample();
        t1.run();
        t2.run();
        System.out.println("Printing inside main");

    }
}