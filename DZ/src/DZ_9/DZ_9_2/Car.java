package DZ_9.DZ_9_2;

public abstract class Car implements Machine{

    final int max_speed;
    final int min_speed;
    final int max_pass;
    final int min_pass;
    final String getTrasnportName;
    final int speed_now;

    protected Car() {
        max_speed = 10;
        min_speed = 1;
        max_pass = 150;
        min_pass = 100;
        getTrasnportName = "Bogdan";
        speed_now = 7;
    }

    public String getGetTrasnportName() {
        return getTrasnportName;
    }

    public int getSpeed_now() {
        return speed_now;
    }

    @Override
    public void getTransportName() {
        System.out.println("Наименование транспорта: " + getTrasnportName);
    }
    @Override
    public void setSpeed_now() {
        System.out.println("Скорость сейчас: " + getSpeed_now());
    }



//    @Override
//    public String toString() {
//        return "Car{" +
//                "name='" + getTrasnportName + '\'' +
//                '}';
//    }
}
