package com.krish.Thread;

public class Application {
    public static void main(String[] args){

        Printer printer = new Printer();
        printer.start();

        System.out.println("This from main thread");
    }
}
