package ru.aston.hometask.module4;

public class DeadlockClass {
    public static void DeadlockedSituation() {
        final String string1 = "This is string 1";
        final String string2 = "This is string 2";

        Thread thread1 = new Thread(() -> {
            String threadName = Thread.currentThread().getName();
            synchronized (string1) {
                System.out.println("Поток " + threadName + " читает строку: " + string1);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (string2) {
                    System.out.println("Поток " + threadName + " читает строку: " + string2);
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            String threadName = Thread.currentThread().getName();
            synchronized (string2) {
                System.out.println("Поток " + threadName + " читает строку: " + string2);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (string1) {
                    System.out.println("Поток " + threadName + " читает строку: " + string1);
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
