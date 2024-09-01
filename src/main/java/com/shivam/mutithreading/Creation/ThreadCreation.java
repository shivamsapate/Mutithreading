package com.shivam.mutithreading.Creation;

public class ThreadCreation {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("we are in thread " + Thread.currentThread().getName());
            System.out.println("Current thread priority " + Thread.currentThread().getPriority());
        });

        thread.setName("worker thread");
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Before calling thread start method " + Thread.currentThread().getName());
        thread.start();
        System.out.println("After calling thread start method " + Thread.currentThread().getName());
    }
}
