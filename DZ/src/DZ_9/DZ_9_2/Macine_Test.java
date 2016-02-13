package DZ_9.DZ_9_2;

public class Macine_Test {
    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            public String getGetTrasnportName() {
                return super.getGetTrasnportName();
            }

            @Override
            public int getSpeed_now() {
                return super.getSpeed_now();
            }
        };
        car.getTransportName();
        car.setSpeed_now();


    }
}
