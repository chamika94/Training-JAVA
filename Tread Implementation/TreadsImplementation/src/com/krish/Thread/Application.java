package com.krish.Thread;

import static java.lang.Thread.currentThread;

public class Application {
    public static void main(String[] args){

        Printer printer = new Printer();
        printer.start();
        for (int i=0; i<10;i++){
            System.out.println("This is from main thread"+currentThread().getName()+" "+i);
        }
    }
}
