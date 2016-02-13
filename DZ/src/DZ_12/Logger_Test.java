package DZ_12;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logger_Test {
    static Logger logger = Logger.getLogger(Logger_Test.class.getName());

    public static void main(String[] args) throws IOException {
        Handler handler = new FileHandler("./test.log", 1024, 5);
        logger.addHandler(handler);
        handler.setFormatter(new SimpleFormatter());
        logger.info("some mesage");
    }

}

