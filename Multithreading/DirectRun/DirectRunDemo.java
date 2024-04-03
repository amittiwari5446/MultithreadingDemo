package Multithreading.DirectRun;

public class DirectRunDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        DirectRunDemo drd1 = new DirectRunDemo();
        DirectRunDemo drd2 = new DirectRunDemo();
        drd1.run();
        drd2.run();
        //Invoking run() method from the main thread, run() method goes onto current
        //callstack rather than the beginning of the new callstack. It means that
        // the next thread will be processed after the current thread, which is not multithreading
    }
}
