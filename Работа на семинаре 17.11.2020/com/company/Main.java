package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread started...");
        CommonResurce commonResurce = new CommonResurce();
        for(int i=1; i<5; i++){
            Thread t = new Thread(new CountThread(commonResurce), "Thread"+1);
            t.start();
        }
        System.out.printf("Thread %s is finished\n", Thread.currentThread().getName());
    }
}
