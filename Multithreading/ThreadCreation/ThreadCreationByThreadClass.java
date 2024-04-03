package Multithreading;

public class ThreadCreationByThreadClass extends Thread {
    public void run() {
        System.out.println("Thread is Running...");
    }

    public static void main(String[] args) {
        ThreadCreationByThreadClass tc1 = new ThreadCreationByThreadClass();
        tc1.start();
    }
}
