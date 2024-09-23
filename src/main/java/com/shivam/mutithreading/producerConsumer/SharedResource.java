package com.shivam.mutithreading.producerConsumer;

import java.util.ArrayDeque;
import java.util.Queue;

public class SharedResource {
    Queue<Integer> queue = new ArrayDeque<>();
    int MAX_SIZE;

    public SharedResource(int maxSize) {
        this.MAX_SIZE = maxSize;
    }

    public synchronized void produceData(int data) throws InterruptedException {
        if(queue.size()==MAX_SIZE){
            System.out.println("queue is full waiting for consumer "+ Thread.currentThread().getName());
            wait();
        }
        System.out.println("Data added to queue "+data+" "+ Thread.currentThread().getName());
        queue.add(data);
        notifyAll();
    }

    public synchronized void consumeData() throws InterruptedException {
        if (queue.isEmpty()) {
            System.out.println("queue is empty waiting for producer "+ Thread.currentThread().getName());
            wait();
        }
        Integer val = queue.poll();
        System.out.println("Removed value from queue val "+val+" "+Thread.currentThread().getName());
        notifyAll();
    }
}
