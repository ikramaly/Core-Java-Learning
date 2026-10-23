package Multithreading.ExecutorServiceDemo;

import java.util.concurrent.*;

public class CallableAndFuture {
    public static void main(String[] args) throws Exception{
        ExecutorService service = Executors.newSingleThreadExecutor();

        Future<Integer> result = service.submit(new SumTask());

        System.out.println(result.get());
        service.shutdown();
        System.out.println("Result : "+result);

    }
}

class SumTask implements Callable<Integer> {
    @Override
    public Integer call(){
        return 1000;
    }
}
