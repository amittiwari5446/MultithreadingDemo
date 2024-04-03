package Multithreading.ThreadPool.Demo1;

public class WorkerThread implements Runnable{
    String message="";

    public WorkerThread(String message) {
        this.message = message;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"(Start)Message= "+message);
        processMessage();
        System.out.println(Thread.currentThread().getName()+"(End) ");
    }
    public void processMessage(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
