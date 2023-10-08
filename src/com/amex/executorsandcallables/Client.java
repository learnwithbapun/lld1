package com.amex.executorsandcallables;

class Client {
    public static void main(String[] args) {

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        helloWorldPrinter.run();

        Thread thread = new Thread(helloWorldPrinter);
        thread.start();

        System.out.println("Main Thread -  " + Thread.currentThread().getName());

//        Invoce the Number Print run method

        for(int i =0 ; i < 10000000; i ++){
            NumberPrint numberPrint = new NumberPrint(i);
            Thread thread1 = new Thread(numberPrint);
            thread1.start();
        }
    }

}