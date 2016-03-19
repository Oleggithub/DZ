package DZ_22.bugfixing.src.main.java.com;

import java.util.Arrays;
import java.util.List;

public class Problem_2 {
    public static void main(String[] args) {
        Integer[] arr =new Integer[] {12,34,56,78,98,23};
        List<Integer> aList = Arrays.asList(arr);
        System.out.println(arr[2]);
        aList.set(2, 22);
        System.out.println(arr[2]);
    }
}
