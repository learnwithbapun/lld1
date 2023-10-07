package com.amex.introtothread;

public class Client {
    public static void main(String[] args) {

        PrintHelloWorld helloWorld = new PrintHelloWorld();
        Thread thread = new Thread(helloWorld);
        thread.start();

        Thread thread1=new Thread(new PrintHelloWorld());
        thread1.start();
        System.out.println("Hello  from "+ Thread.currentThread().getName());
    }
}
