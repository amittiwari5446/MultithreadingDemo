package Multithreading.ThreadGroup.ThreadGroupDemo5;

//Thread Pool Methods Example: int enumerate()
class ThreadNew extends Thread {
    // constructor of the class
    ThreadNew(String tName, ThreadGroup tgrp) {
        super(tgrp, tName);
        start();
    }
    // overriding the run() method
    public void run() {
        for (int j = 0; j < 5; j++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The exception has been encountered " + e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " thread has finished executing");
    }
}

public class EnumerateDemo {
    public static void main(String argvs[]) throws SecurityException, InterruptedException {
        // creating the thread group
        ThreadGroup tg = new ThreadGroup("the parent group");

        ThreadGroup tg1 = new ThreadGroup(tg, "the child group");

        ThreadNew th1 = new ThreadNew("the first", tg);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("the second", tg);
        System.out.println("Starting the second");

        //return ning number  of threads kept in this array
        Thread[] grp=new Thread[tg.activeCount()];
        int cnt=tg.enumerate(grp);
        for(int j=0;j<cnt;j++){
            System.out.println("Thread "+grp[j].getName()+" is found");
        }
    }
}