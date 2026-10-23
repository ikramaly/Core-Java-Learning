package Multithreading;

import javax.sound.midi.Soundbank;

public class SynchronizationThreadDemo {
    public static void main(String[] args) throws Exception{
        Counter c = new Counter();

        AddThread t1 = new AddThread(c);
        PrintThread t2 = new PrintThread(c);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count : "+c.count);
    }
}
class Counter {

    int count = 0;

    public void increment() {
        count++;
    }
}

class PrintThread extends Thread {
    Counter c;
    PrintThread(Counter c) {
        this.c = c;
    }
    public void run() {
        for(int i=1; i<=5; i++) {
            c.increment();
            System.out.println("Hello");
        }
    }
}
class AddThread extends Thread {

    Counter c;

    AddThread(Counter c) {
        this.c = c;
    }

    public void run() {
        for(int i=0; i<10; i++) {
            c.increment();
            System.out.println("Add thread");
        }
    }
}