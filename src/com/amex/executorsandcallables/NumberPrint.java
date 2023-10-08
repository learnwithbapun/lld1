package com.amex.executorsandcallables;

public class NumberPrint implements Runnable {

    private int noToPrint;

    @Override
    public void run() {
        System.out.println("Number  : " + noToPrint + Thread.currentThread().getName());
    }

    NumberPrint(int x) {
        this.noToPrint = x;

    }
}
