package Multithreading.ThreadPool.Demo2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tasks implements Runnable{
    String taskName;
    Tasks(String taskName){
        this.taskName=taskName;
    }
    public void run(){
        try {
            for(int i=0;i<=5;i++){
                Date dt=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
                if(i==0){
                    System.out.println("Initialization time for the task name: "+taskName+"="+sdf.format(dt));
                }
                else{
                    System.out.println("Time of execution for the task name: "+taskName+"="+sdf.format(dt));
                }
                Thread.sleep(1000);
                System.out.println();
            }
            System.out.println(taskName+" is complete");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
