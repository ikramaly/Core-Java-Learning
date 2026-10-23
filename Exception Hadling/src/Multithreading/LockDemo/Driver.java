package Multithreading.LockDemo;

public class Driver {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
//        bank.withdrow("Papa G ",100);
//        bank.withdrow("Child",200);
//        bank.withdrow("Wife",200);
//        bank.withdrow("mother",50);
//        bank.withdrow("Brother",10);
//
//        System.out.println("bal : "+bank);

        Runnable t1 = () -> bankAccount.withdrow("wife", 3030);
        Runnable t2 = () -> bankAccount.withdrow("papa", 300);
        Runnable t3 = ()->bankAccount.withdrow("mother",100);

        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
    }
}