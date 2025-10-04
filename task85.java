public class task85 {

    // Shared class with a number
    static class Counter {
        int count = 0;

        // Synchronized method to safely increase number
        public synchronized void increment() {
            count++;
        }
    }

    // Thread class to run increment
    static class MyThread extends Thread {
        Counter c;

        MyThread(Counter c) {
            this.c = c;
        }

        @Override
        public void run() {
for (int i = 0; i < 1000; i++) {
    c.increment(); // Safely increase the count inside synchronized method
}

/*
Explanation:
- Threads run at the same time, so synchronization protects shared number
- Without synchronization, result may be less than 2000 due to interference
- synchronized keyword ensures only one thread updates the number at a time
*/
}
    }

    public static void main(String[] args) {

        Counter c = new Counter();

        // Create two threads
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);

        // Start both threads
        t1.start();
        t2.start();

        try {
            // Wait for both threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
        }

        // Print final count
        System.out.println("Final count is: " + c.count);
    }
}
