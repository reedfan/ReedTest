package reed.thread;

import java.util.Random;
import java.util.concurrent.*;
public class CallableAndFuture {
    public static void main(String[] args) throws Exception{
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        Future<Integer> future = threadPool.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return new Random().nextInt(100);
            }
        });
        Thread.sleep(5000);
        System.out.println(future.get());
    }
}
