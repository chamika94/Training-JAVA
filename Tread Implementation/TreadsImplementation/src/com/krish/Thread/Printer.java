package com.krish.Thread;

public class Printer extends Thread{

    @Override
    public void run() {
        System.out.println("this is from child thread");
    }

}
