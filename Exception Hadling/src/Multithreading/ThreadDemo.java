package Multithreading;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("We want to print the sum: ");
        Addition add = new Addition();
        MyThread3 t3 = new MyThread3(add);
        MyThread4 t4 = new MyThread4(add);

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println("final sum = "+add.sum);

    }
}
class MyThread3 extends Thread{
    Addition add;
    MyThread3(Addition add){
        this.add = add;
    }

    @Override
    public void run() {
        for(int i=1; i<=3;i++){
            add.add();
//            System.out.println(Thread.currentThread().getName()+" : "+add.sum);
//            System.out.println("Thread 3 sum : "+add.sum);
        }
    }
}


class MyThread4 extends Thread{
    Addition add;
    MyThread4(Addition addkaObj){
        this.add = addkaObj;
    }

    @Override
    public void run() {
        for(int i=1; i<=2;i++){
            add.add();
//            System.out.println(Thread.currentThread().getName()+" : "+add.sum);
        }
    }
}
class  Addition{
    int sum = 0;
    public void add(){
            sum = sum+1;
    }
}
