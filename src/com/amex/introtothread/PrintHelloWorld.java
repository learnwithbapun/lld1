package com.amex.introtothread;

public class PrintHelloWorld implements  Runnable{
    @Override
    public void run() {
        System.out.println("Hello World "+ Thread.currentThread().getName());
    }
}
