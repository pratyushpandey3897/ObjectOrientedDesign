package multithreading;

public class MyThreadRunnable implements Runnable{
    public void run() {
        System.out.println ("MyThreadRunnable is running...");
    }

    public static void main (String[] args) {
        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
        Thread thread = new Thread(myThreadRunnable);
        thread.start();

        Thread t1 = new Thread( ()-> {
            System.out.println("Thread t1 is running...");
        });

        t1.start();
    }
}
