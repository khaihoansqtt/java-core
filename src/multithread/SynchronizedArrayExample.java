package multithread;

public class SynchronizedArrayExample {
    private static int[] array = new int[10];

    public static void main(String[] args) {
        Thread writerThread = new Thread(() -> {
            synchronized (array) { // Đồng bộ khối ghi
                for (int i = 0; i < array.length; i++) {
                    array[i] = i;
                    System.out.println("Writer: array[" + i + "] = " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread readerThread = new Thread(() -> {
            synchronized (array) { // Đồng bộ khối đọc
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Reader: array[" + i + "] = " + array[i]);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        writerThread.start();
        readerThread.start();
    }
}

class ArrayExample {
    private static int[] array = new int[10];

    public static void main(String[] args) {
        Thread writerThread = new Thread(() -> {
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
                System.out.println("Writer: array[" + i + "] = " + i);
                try {
                    Thread.sleep(100); // Giả sử mất 100ms để ghi dữ liệu
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread readerThread = new Thread(() -> {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Reader: array[" + i + "] = " + array[i]);
                try {
                    Thread.sleep(50); // Giả sử mất 50ms để đọc dữ liệu
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        writerThread.start();
        readerThread.start();
    }
}