package DZ_23;

public class FirstThreadTest {
    public static void main(String[] args) throws InterruptedException {
        MyFirstThread myFirstThread = new MyFirstThread();
        MySecondRunnable mySecondRunnable = new MySecondRunnable();
        //myFirstThread.run();// выведет только один поток главный main
        myFirstThread.start(); //для запуска потока мы дергаем метод start - создает поток
        Thread mySecondThread = new Thread(mySecondRunnable);
        //mySecondThread.setDaemon(true);
        myFirstThread.join(); // прицепить поток
        //new Thread(mySecondRunnable).start(); //Обертываем в Thread и получаем метод start
        mySecondThread.start();
        //mySecondThread.start(); //дважды один и тот же поток нельзя запускать

        AnswerYes answerYes = new AnswerYes();
        answerYes.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("no");
            Thread.sleep(100);}
        if(answerYes.isAlive()){
            answerYes.join();
            System.out.println("--> Yes is winner");
        }else {
            System.out.println("--> No is winner");
        }
    }


}


class AnswerYes extends Thread{

    public void run() {
        try {
        for (int i = 0; i < 10; i++) {
            System.out.println("yes");
                Thread.sleep(100);}}
             catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

class MyFirstThread extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + Thread.currentThread().getName());
        }
    };
}

class MySecondRunnable implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + Thread.currentThread().getName());
        }
    }
}