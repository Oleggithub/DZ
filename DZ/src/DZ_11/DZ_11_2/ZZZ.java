package DZ_11.DZ_11_2;

import java.util.logging.Logger;

public class ZZZ {
    private static Logger logger = Logger.getLogger(ZZZ.class.getName());

    public static void main(String[] args) {

        int i,j,k,l = 0;
        k = l++;
        j = ++k;
        i = j++;
        logger.info("i= ");
        logger.getFilter();
        System.out.println("i= " +i);
    }
}
