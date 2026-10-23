package Multithreading.LockDemo;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int bal = 1000;
    private final ReentrantLock rl = new ReentrantLock();

    public void withdrow(String ThreadName, int Amount){
        System.out.println(ThreadName + " is trying to withdrow "+Amount);
        if (rl.tryLock()){// this will return the boolean value. it
            // will check the lock avaliable or not.
            rl.lock();// from this line code will not be executed bcz of the lock mehtod.
            try {
                System.out.println(ThreadName+ " acquired lock");
                if(bal>=Amount){
                    Thread.sleep(2000);
                    bal = bal-Amount;
                    System.out.println("Withdrow : "+Amount+", Balance : "+bal);
                }else {
                    System.out.println("Insufficient Balance.");
                }
            }catch (Exception e){
                System.out.println("Error in the code ");
            }
            finally {
                rl.unlock();
            }

        }else {
            System.out.println("do someting until unless the lock unavaliable." +
                    "+");
        }


    }

}
