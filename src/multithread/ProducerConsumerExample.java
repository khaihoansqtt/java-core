package multithread;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample {

    private static final int CAPACITY = 1000000;
    private static final Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer(), "Producer");
        Thread consumerThread = new Thread(new Consumer(1), "Consumer");
//        Thread consumerThread2 = new Thread(new Consumer(200), "Consumer2");
//        Thread consumerThread3 = new Thread(new Consumer(300), "Consumer3");
        Thread consumerThread4 = new Thread(new Consumer(1), "Consumer4");

        producerThread.start();
        consumerThread.start();
//        consumerThread2.start();
//        consumerThread3.start();
        consumerThread4.start();
    }

    static class Producer implements Runnable {
        @Override
        public void run() {
            int value = 0;
            while (value < 10) {
//                synchronized (queue) {
//                    while (queue.size() == CAPACITY) {
//                        try {
                            System.out.println("Queue is full, producer is waiting...");
//                            queue.wait();  // Chờ cho đến khi có chỗ trống trong hàng đợi
//                        } catch (InterruptedException e) {
//                            Thread.currentThread().interrupt();
//                        }
//                    }

                    System.out.println("Produced: " + value);
                queue.add(value++);
//                    queue.notify(); // Thông báo cho consumer rằng có dữ liệu mới
//                }
            }
        }
    }

    static class Consumer implements Runnable {
        int sleep;

        public Consumer(int sleep) {
            this.sleep = sleep;
        }

        @Override
        public void run() {
            while (true) {
//                synchronized (queue) {
                    if (queue.isEmpty()) {
//                        try {
                            System.out.println(Thread.currentThread().getName() + "  Queue is empty, consumer is waiting...");
//                            queue.wait();  // Chờ cho đến khi có dữ liệu trong hàng đợi
//                        } catch (InterruptedException e) {
//                            Thread.currentThread().interrupt();
//                        }
                        continue;
                    }

                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int value = queue.poll();
                    System.out.println("Consumed: " + value);
//                    queue.notify(); // Thông báo cho producer rằng có chỗ trống trong hàng đợi
//                }
            }
        }
    }
}
