package Multithreading.JoiningThread;

public class JoiningThreadDemo extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Current Thread: " + Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        JoiningThreadDemo jtd1 = new JoiningThreadDemo();
        JoiningThreadDemo jtd2 = new JoiningThreadDemo();
        JoiningThreadDemo jtd3 = new JoiningThreadDemo();

        jtd1.start();
        try {
            System.out.println("The Current thread is: " + Thread.currentThread().getName());
            jtd1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        jtd2.start();
        try {
            System.out.println("The Current thread is: " + Thread.currentThread().getName());
            jtd2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        jtd3.start();
        try {
            System.out.println("The Current thread is: " + Thread.currentThread().getName());
            jtd3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
