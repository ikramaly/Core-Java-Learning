class Counter {
    int count = 0;

    public void increment() {
        // sirf critical section synchronize kiya
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                count++;
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> c.increment());
        Thread t2 = new Thread(() -> c.increment());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count (with sync): " + c.count);
    }
}
