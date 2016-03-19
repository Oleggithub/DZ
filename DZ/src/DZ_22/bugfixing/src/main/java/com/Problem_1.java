package DZ_22.bugfixing.src.main.java.com;

import java.util.Arrays;
import java.util.List;

public class Problem_1 {

    public static void main(String[] args) {
        String[] membersArray = new String[]{"1", "2", "3", "4", "5"};
        List<String> membersList = Arrays.asList(membersArray);//�������� �� ���� - ��������� �� remove � add --- ���� ��������� ������) ������� �����


        for (String member : membersList) {
            List<String> seeAlso = null;
            if (!seeAlso.contains(member)) {
                seeAlso.add(member);
            }
        }

        for (String m : membersList) {
            membersList.remove(m);
        }

    }

}

