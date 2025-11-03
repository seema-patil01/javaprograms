
    class SharedResource {
    void displayMessage() {
        synchronized (this) {
            System.out.println("Thread 1 is running...");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Thread 1 resumed after notification!");
        }
    }

    void sendNotification() {
        synchronized (this) {
            System.out.println("Thread 2 is running...");
            notify();
            System.out.println("Notification sent by Thread 2.");
        }
    }
}

public class Main24 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> {
            resource.displayMessage();
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.sendNotification();
        });

        t1.start();
        t2.start();
    }
}


