package com.company;

public class Second {
    public static void main(String[] args) {
        Object lock = new Object();
        new SyncThread(lock).start();
        new SyncThread(lock).start();
        lock.notify();
    }
}
