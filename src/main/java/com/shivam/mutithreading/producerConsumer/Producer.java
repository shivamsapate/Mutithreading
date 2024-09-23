package com.shivam.mutithreading.producerConsumer;

public class Producer implements Runnable{

    SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 6; i++) {
            try {
                resource.produceData(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
