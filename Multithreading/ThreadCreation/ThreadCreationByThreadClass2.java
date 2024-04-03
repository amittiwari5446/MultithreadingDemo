package Multithreading;

public class ThreadCreationByThreadClass2 {
    public static void main(String[] args) {
        Thread td1 = new Thread("MyThread");
        td1.start();

        String str = td1.getName();
        System.out.println(str);
    }
}
