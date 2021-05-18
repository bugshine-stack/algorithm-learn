package org.example.consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProConsumer {
    BlockingQueue<String> queue = new LinkedBlockingQueue<>(10);

    class Producer implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                try {
                    queue.put("hello: " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class Consumer implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        ProConsumer proConsumer = new ProConsumer();
        new Thread(proConsumer.new Consumer()).start();
        new Thread(proConsumer.new Producer()).start();
    }
}
