package Multithreading.ExecutorServiceDemo;

public class CertificateSenderDemo implements Runnable{
    private final String stuName;
    public CertificateSenderDemo(String name){
        this.stuName = name;
    }


    @Override
    public void run(){
        System.out.println("Certificate sent to "+stuName+" successfully"+
                "by thread "+Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Certication sent to "+stuName);
    }

}
