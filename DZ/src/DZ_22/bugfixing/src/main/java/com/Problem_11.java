package DZ_22.bugfixing.src.main.java.com;

import java.util.ArrayList;

public class Problem_11 {
    private ArrayList<String> storedStrings;


    public Problem_11() {
        this.breakString(storedStrings.get(0));
    }

    private void breakString(String s) {
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
