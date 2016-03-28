package DZ_24;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueConsumerProduserTest {
    public static void main(String[] args) {
        BlockingQueue box = new ArrayBlockingQueue(1);
        BQProducer bqProducer = new BQProducer(box); //передали в объект коробку
        BQConsumer bqConsumer = new BQConsumer(box);
        bqProducer.start();
        bqConsumer.start();

    }
}

class BQProducer extends Thread {
    private BlockingQueue box;// они разные ссылка2 на объект

    public BQProducer(BlockingQueue box) {
        this.box = box;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("p->" + i);
                box.put(i);
                Thread.sleep(100);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BQConsumer extends Thread {
    private BlockingQueue box; // они разные ссылка1 на объект

    public BQConsumer(BlockingQueue box) {
        this.box = box;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("c->" + box.take());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}