package multithreading;

public class SyncExample {
    public void printMessage(String message) {
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(message + " - " + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SyncExample example = new SyncExample();

        Thread t1 = new Thread(() -> example.printMessage("Thread 1"));
        Thread t2 = new Thread(() -> example.printMessage("Thread 2"));

        t1.start();
        t2.start();
    }
}
