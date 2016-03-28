package DZ_22.bugfixing.src.main.java.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Problem_1 {

    public static void main(String[] args) {
        String[] membersArray = new String[]{"1", "2", "3", "4", "5"};
        List<String> membersList = new ArrayList(Arrays.asList(membersArray));//говорили на паре - вспомните за remove и add
        // --- есть некоторые траблы) обойдти можно


        for (String member : membersList) {
            List<String> seeAlso = new ArrayList<String>();
            if (!seeAlso.contains(member)) {
                seeAlso.add(member);

            }
    //        System.out.println("seeAlso = " + seeAlso);
        }

//        for (String m : membersList) { //нужно создавать итератор см. ниже
//            membersList.remove(m);
//        }
        Iterator iterator = membersList.iterator();
        while(iterator.hasNext()){
            System.out.println("iterator = " + iterator.next());
            iterator.remove();
        }
        System.out.println("membersList = " + membersList);
    }

}

