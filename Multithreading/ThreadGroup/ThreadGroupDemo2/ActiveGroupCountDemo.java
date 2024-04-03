package Multithreading.ThreadGroup.ThreadGroupDemo2;

//Thread Pool Methods Example: int activeCount()

class ThreadNew extends Thread{
    ThreadNew(String tName, ThreadGroup tGroup){
        super(tGroup,tName);
        start();
    }
    public void run(){
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("The Exception has been occurred"+e);
            }
        }
    }
}
public class ActiveGroupCountDemo{
    public static void main(String []args){
        ThreadGroup tg=new ThreadGroup("Parent Group of Threads:");
        ThreadNew t1=new ThreadNew("one",tg);
        System.out.println("Starting the first thread...");
        ThreadNew t2=new ThreadNew("two",tg);
        System.out.println("Starting the second thread...");

        System.out.println("total number of active threads - "+tg.activeCount());
    }
}
