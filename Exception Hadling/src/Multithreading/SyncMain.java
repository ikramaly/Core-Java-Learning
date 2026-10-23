package Multithreading;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.geom.CubicCurve2D;

public class SyncMain {
    public static void main(String[] args) {
        System.out.println("wait(), notify(), notifyAll() working..");
        Restaurant r = new Restaurant();
        Customer c1 = new Customer(r);
        Customer c2 = new Customer(r);
        Chef chef1 = new Chef(r);
        Chef chef2 = new Chef(r);

        c1.start();
//        c2.start();
        chef1.start();
//        chef2.start();
    }
}
class Restaurant{
    boolean foodReady = false;
}
class Customer extends Thread{
    Restaurant r;
    Customer(Restaurant obj){
        this.r = obj;
    }
    @Override
    public void run(){
        synchronized (this){
            if(!r.foodReady){
                try {
                    System.out.println("Customer : Waiting for food.");
//                    r.sleep(2000);
                    r.wait();
                }catch (Exception e){
                    System.out.println("Error : ");
                }
            }
            System.out.println("Customer : Start Eating...");
        }
    }
}
class Chef extends Thread{
    Restaurant r;
    Chef(Restaurant obj){
        this.r = obj;
    }
    @Override
    public void run(){
        synchronized (this){
            System.out.println("Chef : Cooking Food");
        }
    }
};