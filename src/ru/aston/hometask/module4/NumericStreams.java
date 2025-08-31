package ru.aston.hometask.module4;

import java.util.concurrent.Semaphore;

public class NumericStreams {
    private static final Semaphore semaphore1 = new Semaphore(1);
    private static final Semaphore semaphore2 = new Semaphore(0);

    public static void NumericStreamsExample() {
        Thread thread1 = new Thread(() -> {
            while (true) {
                try {
                    semaphore1.acquire();
                    System.out.println("1");
                    Thread.sleep(1000);
                    semaphore2.release();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                try {
                    semaphore2.acquire();
                    System.out.println("2");
                    Thread.sleep(1000);
                    semaphore1.release();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
