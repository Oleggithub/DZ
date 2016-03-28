package DZ_24.callable_test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableTest  {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        FutureUserTask futureUserTask1 = new FutureUserTask(100);
        FutureUserTask futureUserTask2 = new FutureUserTask(200);
        ExecutorService service = Executors.newFixedThreadPool(2);// сервис услуги для обращения
        FutureTask futureTask1 = new FutureTask(futureUserTask1);
        FutureTask futureTask2 = new FutureTask(futureUserTask2);
        service.execute(futureTask1);
        //futureTask1.cancel(true);//можем закончить поток по флагу;
        service.execute(futureTask2);
        while(true){
            if (futureTask1.isDone() && futureTask2.isDone()){
                System.out.println("good job; thread finished his work");
                service.shutdown();
                return;
            }
            if (futureTask2.isDone()){
                System.out.println("I still wait for second thread with message: " + futureTask1.get(10, TimeUnit.MILLISECONDS));
            }

        }
    }

}

class FutureUserTask implements Callable<String>{
    private long timeForWait;
    public FutureUserTask(long timeForWait){
        this.timeForWait = timeForWait;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(timeForWait);
        return "Hello from " + Thread.currentThread().getName();
    }
}
