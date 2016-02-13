package DZ_11.log_test;

import java.util.logging.Logger;

public class LogTest {
    private static Logger logger = Logger.getLogger(LogTest.class.getName());
    //private static Logger logger = Logger.getLogger("logTest.LogTest"); no gyd


    public static void main(String[] args) {
        logger.info("first message");
        logger.severe("sever");
        logger.warning("900");
        logger.info("800");
        // ниже этого уровня не будет выводить ничего т.к. он считает что это низший уровень
        logger.config("700");
        logger.fine("600");
        logger.finer("500");
        logger.finest("400");
    }

}