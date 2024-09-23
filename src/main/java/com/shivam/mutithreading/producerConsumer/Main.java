package com.shivam.mutithreading.producerConsumer;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource(3);

        Thread t1 = new Thread(new Producer(resource));
        Thread t2 = new Thread(new Consumer(resource));

        t1.start();
        t2.start();

    }
}
