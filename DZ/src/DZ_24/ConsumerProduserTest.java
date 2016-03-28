package DZ_24;

//Consumer - забирает, Produser - ложит
public class ConsumerProduserTest {
    public static void main(String[] args) {
        Box box = new Box();
        Producer producer = new Producer(box);
        Consumer consumer = new Consumer(box);
        producer.start();
        consumer.start();
    }

}

class Box {

    private boolean isAvailable;
    private int value; // флажок - регулирует, могу ли Я туда, что-то положить или нет

    public Box() {
    }

    public Box(int value) {
        this.value = value;
    }

    synchronized public int getValue() throws InterruptedException {
        while (!isAvailable) {//пока недоступно я жду
            wait();
        }
        isAvailable = false;
        notifyAll();
        return value;
    }

    synchronized public void setValue(int value) throws InterruptedException {
        //isAvailable - ресурс доступен, есть, что считать (Олег положил что то в коробку)
        while (isAvailable) {//пока Женя читает значение value -> Олег будет ждать
            wait();

        }
        isAvailable = true;
        this.value = value;
        notifyAll();
    }
}

class Consumer extends Thread {
    private Box box;

    public Consumer(Box box) {
        super(Consumer.class.getName());
        this.box = box;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {

                System.out.println("c->" + box.getValue());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}


class Producer extends Thread {

    private Box box;

    public Producer(Box box) {
        super(Producer.class.getName());
        this.box = box;
    }

    public Producer() {
        super("Thread_Name");
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("p->" + i);
                box.setValue(i);
                Thread.sleep(100);
            }
        } catch (Exception e) {

        }

    }

}