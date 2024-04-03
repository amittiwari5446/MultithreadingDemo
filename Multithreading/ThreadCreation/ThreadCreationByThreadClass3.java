package Multithreading;

public class ThreadCreationByThreadClass3 implements Runnable {
    public void run() {
        System.out.println("Thread is Running...");
    }

    public static void main(String[] args) {
        ThreadCreationByThreadClass3 t1 = new ThreadCreationByThreadClass3();
        Thread td1 = new Thread(t1, "MyThread");
        td1.start();

        String str = td1.getName();
        System.out.println(str);
    }
}
