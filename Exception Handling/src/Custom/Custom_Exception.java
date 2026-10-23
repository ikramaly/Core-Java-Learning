package Custom;

import java.util.SplittableRandom;

public class Custom_Exception {

    public static void main(String[] args) throws Insufficient_Bal_Exception {

            Banking(3000,1000);


    }
    public static void Banking(double amount, double balance) throws Insufficient_Bal_Exception{
        if (amount>balance){
            throw new Insufficient_Bal_Exception("Insufficient Bal : " + balance + " Requested " + amount);
        }
        System.out.println("Avaliable Balance : "+balance);
        System.out.println("Thanks for using our services..");
    }
    static class  Insufficient_Bal_Exception extends Exception{
        public Insufficient_Bal_Exception(String msg){
            super(msg);
        }
    }
}
