package Multithreading.ThreadTwice;

public class ThreadTwiceDemo extends Thread {
    public void run() {
        System.out.println("Thread is Running...");
    }

    public static void main(String[] args) {
        ThreadTwiceDemo ttd = new ThreadTwiceDemo();
        ttd.start();
        ttd.start(); //starting thread again will generate illegalThreadStateException
    }
}
