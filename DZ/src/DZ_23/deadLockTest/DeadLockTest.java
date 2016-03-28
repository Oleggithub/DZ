package DZ_23.deadLockTest;

public class DeadLockTest {
    private static Object object1 = new Object();
    private static Object object2 = new Object();

    public static void main(String[] args) {
        MyThreadFirst myThreadFirst = new MyThreadFirst();
        MyThreadSecond myThreadSecond = new MyThreadSecond();
//        System.out.println("myThreadSecond = " + myThreadSecond);
//        System.out.println("myThreadFirst = " + myThreadFirst);
        myThreadFirst.start();
        myThreadSecond.start();//зависнем

    }

    static class MyThreadFirst extends Thread {
        public void run() {

            try {
                System.out.println("try hold object1");
                synchronized (object1) {
                    Thread.sleep(1000);
                    System.out.println("try hold object2");
                    synchronized (object2) {
                        System.out.println("inside object1");
                    }
                }
            } catch (Exception e) {

            }
        }
    }
    static class MyThreadSecond extends Thread {
        public void run() {

            try {
                System.out.println("try hold object2");
                synchronized (object2) {
                    Thread.sleep(1000);
                    System.out.println("try hold object1");
                    synchronized (object1) {
                        System.out.println("inside object1");
                    }
                }
            } catch (Exception e) {

            }
        }
    }

}

