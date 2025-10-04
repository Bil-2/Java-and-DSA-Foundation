public class task83 {

    // Create a class that extends Thread
    static class MyThread extends Thread {

        @Override
        public void run() {
System.out.println("Thread is running"); // Message printed when thread starts work

/*
Explanation:
- When thread object is created, it is in New state
- When start() is called, thread runs in parallel
- join() waits for thread to finish work
- Final print confirms thread has finished
- This gives beginners a simple understanding of thread states
*/
}
    }

    public static void main(String[] args) {

        // Create thread object
        MyThread t = new MyThread();

        // Thread is created but not started yet
        System.out.println("Thread state before start");

        // Start thread
        t.start();

        // Thread has started running
        System.out.println("Thread state after start");

        try {
            // Wait for thread to finish
            t.join();
        } catch (InterruptedException e) {
            // Not needed for beginners, but required to handle possible interruptions
        }

        // Thread has finished
        System.out.println("Thread state after completion");
    }
}
