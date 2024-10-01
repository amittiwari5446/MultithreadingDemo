import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        for(int i=0;i<1001;i++) numbers.add(i);

        ExecutorService executorService= Executors.newFixedThreadPool(5);
        for(Integer number:numbers){
            executorService.submit(()->{
                System.out.println(Thread.currentThread().getName()+"-"+number);
            });
        }
        executorService.shutdown();

        //wait for all task to complete before proceeding

        while (!executorService.isTerminated()) {
            try {
                // Sleep for a short duration before checking again
                Thread.sleep(1000); // Sleep for 1 second before checking termination
            } catch (InterruptedException e) {
                executorService.shutdownNow(); // Force shutdown if interrupted
                Thread.currentThread().interrupt(); // Preserve interrupt status
            }
        }


        System.out.println("All Task Completed !");
    }
}