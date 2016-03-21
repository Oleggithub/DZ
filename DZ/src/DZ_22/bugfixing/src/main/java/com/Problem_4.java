package DZ_22.bugfixing.src.main.java.com;

import java.util.Arrays;

public class Problem_4 {
    public static void main(String[] args) {
        int[] masForCopy = new int[]{1, 3, 4, 5, 6, 7, 8};
        int[] second;
        System.out.println("before changes " + Arrays.toString(masForCopy));
        //Arrays.copyOf(masForCopy, 3);
        System.out.println("after changes " + Arrays.toString(Arrays.copyOfRange(masForCopy, masForCopy.length-3, masForCopy.length)));
        //is it the same?)))))
        System.out.println("after changes1 " + Arrays.toString(Arrays.copyOf(masForCopy, 3)));


//        int[] masForCopy = new int[]{1, 3, 4, 5, 6, 7, 8};
//        int[] masForCopyNEW;
//
//        masForCopyNEW = Arrays.copyOf(masForCopy, masForCopy.length);
//        System.out.println(Arrays.equals(masForCopy, masForCopyNEW));
//
//        Arrays.sort(masForCopy);
//        System.out.println(Arrays.equals(masForCopy, masForCopyNEW));
//        System.out.println(Arrays.toString(masForCopy));
//        System.out.println(Arrays.toString(masForCopyNEW));
//
//        Arrays.copyOfRange(masForCopy, masForCopy.length - 3, masForCopy.length);
//        System.out.println(Arrays.toString(Arrays.copyOfRange(masForCopy, masForCopy.length-3, masForCopy.length)));


    }
}
