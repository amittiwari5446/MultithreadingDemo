package Multithreading.ThreadPool.Demo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    static final int MAX_TH=3;
    public static void main(String []args){
        //creating 5 new tasks
        Runnable rb1=new Tasks("task1");
        Runnable rb2=new Tasks("task2");
        Runnable rb3=new Tasks("task3");
        Runnable rb4=new Tasks("task4");
        Runnable rb5=new Tasks("task5");

        //creating a thread pool with MAX_TH number of threads size the pool size is fixed
        ExecutorService pl=Executors.newFixedThreadPool(MAX_TH);
        //passes the task objects to the pool to execute(step3)
        pl.execute(rb1);
        pl.execute(rb2);
        pl.execute(rb3);
        pl.execute(rb4);
        pl.execute(rb5);

        //shutting down the pool
        pl.shutdown();
    }
}
