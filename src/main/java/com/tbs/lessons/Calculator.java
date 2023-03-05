package com.tbs.lessons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    protected static final Logger logger = LogManager.getLogger(Calculator.class);
    public int calculateSquareFootage(int height, int width) {
        logger.info("calculator called with {} and {}", height, width);

        if (height == 10 && width == 20) {
            return height * width;
        } else {
            logger.warn("calculator called with {} and {}", height, width);
            return 0;
        }
    }


}
