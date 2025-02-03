public class VolatileDemo extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Thread is running...");
        }
    }

    public void stopThread() {
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileDemo thread = new VolatileDemo();
        thread.start();
        Thread.sleep(1000);
        thread.stopThread();
        System.out.println("Thread stopped.");
    }
}
