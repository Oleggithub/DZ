package DZ_22.bugfixing.src.main.java.com;

import java.util.ArrayList;

public class Problem_11 {
    private ArrayList<String> storedStrings = new ArrayList<>();


    public Problem_11() {
        this.breakString(storedStrings.get(0));
    }

    private void breakString(String s) {
//        if (storedStrings.isEmpty()) return;
//        for (String el:storedStrings){//проверка длины строки на соответствие условию s.length() >= 9
//            if (el.length()<)
//        }
        if (s.length() > 9) {
            storedStrings.add(0, s.substring(s.length() - 9, s.length()));
            this.breakString(s.substring(0, s.length() - 9));
        } else {
            this.storedStrings.add(0, s);
        }
    }


    public static void main(String[] args) {
        new Problem_11();
    }
}
