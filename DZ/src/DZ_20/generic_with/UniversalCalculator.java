package DZ_20.generic_with;

public class UniversalCalculator <T extends Number>{
    private static double sum = 0;
    public static void main(String[] args) {
        UniversalCalculator<Float> floatUniversalCalculator = new UniversalCalculator<Float>();
        floatUniversalCalculator.sum(Float.MAX_VALUE);
        floatUniversalCalculator.sum(Float.MAX_VALUE);
        floatUniversalCalculator.sum(Float.MAX_VALUE);
        System.out.println("sum_Float = " + sum);

        UniversalCalculator<Long> longUniversalCalculator = new UniversalCalculator<Long>();
        longUniversalCalculator.sum(Long.MAX_VALUE);
        longUniversalCalculator.sum(Long.MAX_VALUE);
        longUniversalCalculator.sum(Long.MAX_VALUE);
        System.out.println("sum_Long = " + sum);

//        UniversalCalculator<String> stringUniversalCalculator = new UniversalCalculator<String>();
//        stringUniversalCalculator.sum(String.MAX_VALUE);
//        stringUniversalCalculator.sum(String.MAX_VALUE);
//        stringUniversalCalculator.sum(String.MAX_VALUE);
//        System.out.println("sum = " + sum);


    }
    public void sum(T number){
        sum += number.doubleValue();

    }
}
