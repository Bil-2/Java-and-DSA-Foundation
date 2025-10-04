public class task81 {

    // Create a class that extends Thread
    static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("Thread is running"); // Message printed by thread when run method executes

            /*
            Explanation:
            - We extend Thread class to create MyThread
            - run() method contains the code that the thread executes
            - start() method begins execution in a new thread
            - This demonstrates the simplest form of multithreading
            */
        }
    }

    public static void main(String[] args) {

        // Create object of MyThread
        MyThread t = new MyThread();

        // Start the thread
        t.start();
    }
}
