package DZ_24;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueuePollTakeTest {
    public static void main(String[] args) {
        BlockingQueue box = new ArrayBlockingQueue(1);
        BQPut bqPut = new BQPut(box); //передали в объект коробку
        BQTake bqTake = new BQTake(box);
        BQPoll bqPoll = new BQPoll(box);
        bqPut.start();
        bqTake.start();
        bqPoll.start();

    }

    static class BQPut extends Thread {
        private BlockingQueue box;// они разные ссылка2 на объект

        public BQPut(BlockingQueue box) {
            this.box = box;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Put->" + i);
                    box.put(i);
                    Thread.sleep(100);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class BQTake extends Thread {
        private BlockingQueue box; // они разные ссылка1 на объект

        public BQTake(BlockingQueue box) {
            this.box = box;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Take->" + box.take());
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    static class BQPoll extends Thread {
        private BlockingQueue box; // они разные ссылка1 на объект

        public BQPoll(BlockingQueue box) {
            this.box = box;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Poll-> " + box.remove(i));
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}