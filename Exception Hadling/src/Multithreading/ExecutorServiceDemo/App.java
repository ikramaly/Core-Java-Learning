package Multithreading.ExecutorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        String []studentsList = {
                "Riya","Ikram","Manju","Manish","Ali","Khanu","Pankaj","Sjaake",
                "Haya","Layba","Neha"
        };
        for (String student:studentsList){
            CertificateSenderDemo task = new CertificateSenderDemo(student);
            service.submit(task);
        }
        service.shutdown();
    }


}
