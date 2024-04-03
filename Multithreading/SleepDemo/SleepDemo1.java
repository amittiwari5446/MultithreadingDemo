package Multithreading.SleepDemo;

public class SleepDemo1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SleepDemo1 sd1 = new SleepDemo1();
        SleepDemo1 sd2 = new SleepDemo1();

        sd1.start();
        sd2.start();
    }
}


