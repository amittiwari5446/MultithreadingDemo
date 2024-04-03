package Multithreading;

public class ThreadCreationByRunnableInterface implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        ThreadCreationByRunnableInterface t1 = new ThreadCreationByRunnableInterface();
        Thread td1 = new Thread(t1);
        td1.start();
    }
}
