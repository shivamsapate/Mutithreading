package com.shivam.mutithreading.producerConsumer;

public class Consumer implements Runnable{

    SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 6; i++) {
            try {
                resource.consumeData();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
