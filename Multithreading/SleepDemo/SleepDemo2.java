package Multithreading.SleepDemo;

public class SleepDemo2 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                //if time is negative, it will throw illegalArgumentException
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
