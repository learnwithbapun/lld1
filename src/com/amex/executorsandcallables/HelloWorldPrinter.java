package com.amex.executorsandcallables;

public class HelloWorldPrinter implements Runnable {


    @Override
    public void run() {
        System.out.println("Hello Thread " + Thread.currentThread().getName());
        doSomething();

    }

    public void doSomething() {
        System.out.println("Do Something " + Thread.currentThread().getName());

    }
}