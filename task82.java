public class task82 {

    // Create a class that implements Runnable interface
    static class MyRunnable implements Runnable {

        @Override
        public void run() {
System.out.println("Runnable thread is running"); // Message printed by thread when run method executes

/*
Explanation:
- Runnable interface provides run() method
- Thread object is created by passing Runnable object
- start() begins thread execution
- This approach allows flexibility, as class is not restricted to only extending Thread
*/
}
    }

    public static void main(String[] args) {

        // Create object of MyRunnable
        MyRunnable r = new MyRunnable();

        // Create Thread using Runnable object
        Thread t = new Thread(r);

        // Start the thread
        t.start();
    }
}