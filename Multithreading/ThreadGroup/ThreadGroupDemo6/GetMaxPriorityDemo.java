package Multithreading.ThreadGroup.ThreadGroupDemo6;

class ThreadNew extends Thread {
    // constructor of the class
    ThreadNew(String tName, ThreadGroup tgrp) {
        super(tgrp, tName);
        start();
    }
    // overriding the run() method
    public void run() {
        for (int j = 0; j < 100; j++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("The exception has been encountered " + e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " thread has finished executing");
    }
}

public class GetMaxPriorityDemo {
    public static void main(String argvs[]) throws SecurityException, InterruptedException {
        // creating the thread group
        ThreadGroup tg = new ThreadGroup("the parent group");
        ThreadGroup tg1 = new ThreadGroup(tg, "the child group");

        ThreadNew th1 = new ThreadNew("the first", tg);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("the second", tg);
        System.out.println("Starting the second");

        int priority = tg.getMaxPriority();

        System.out.println("The maximum priority of the parent ThreadGroup: " + priority);
    }
}