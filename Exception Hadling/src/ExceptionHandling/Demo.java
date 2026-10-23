package ExceptionHandling;

public class Demo {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();// here object will be create but not executed
        t1.start();
        t1.run();
        for (int i=1; i<=5; i++){
            System.out.println("Main Thread");
        }
    }
}

class Mythread extends Thread {
    @Override
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println("Child Thread.....");
        }
    }
}