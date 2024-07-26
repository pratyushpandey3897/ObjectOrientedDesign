package multithreading;

public class ThreadTester {
    public static void main(String[] args) {
        Thread thread = new Thread1 ();
        thread.start();
        System.out.println ("Main thread is exiting...");
    }
}
