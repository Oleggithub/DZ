package DZ_22.bugfixing.src.main.java.com;

import java.util.Arrays;

public class Problem_4 {
    public static void main(String[] args) {
        int[] masForCopy = new int[]{1, 3, 4, 5, 6, 7, 8};
        System.out.println("before changes " + Arrays.toString(masForCopy));
        Arrays.fill(masForCopy, 3);
        System.out.println("after changes " + Arrays.toString(masForCopy));//is it the same?)))))
    }
}
