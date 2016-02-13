package DZ_7;

import java.util.Arrays;

public class MethodTest {
    public static void main(String[] args) {
        Integer mas[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(mas));
        changeMasElementByIndex(mas, 0, 44);
        System.out.println(Arrays.toString(mas));
        int age = 14;
        changeAge(age,15);
        System.out.println("age after changees " + age);
        String name = "TestName";
        name = changeString(name);
        System.out.println(name);
    }
    private static String changeString(String name){
      //  name = "NewValue";
       return name.concat("newValue");
    }
    private static void changeAge(int oldAgeBalue, int newAgeValue){
        oldAgeBalue=newAgeValue;
        System.out.println(oldAgeBalue);
    }
    public static void changeMasElementByIndex(Integer[] mas, int index, int newValue){
        if (index < mas.length && index >=0){
            mas[index] = newValue;
        }
    }
}
