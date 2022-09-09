package com.krish.Thread;

public class Printer extends Thread{

    public void start(){
        super.start();
        System.out.println("This is start");
    }
    @Override
    public void run() {
        for (int i=0; i<10;i++){
            System.out.println("This is from child thread"+currentThread().getName()+" "+i);
        }

    }

}
