package com.tbs.lessons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MyLoggingApp {

    protected static final Logger logger = LogManager.getLogger(MyLoggingApp.class);

    public static void main(String[] args) {
        logger.fatal("I am writing FATAL message");
        logger.error("I am writing a ERROR message");
        logger.warn("I am writing a WARN message");
        logger.info("I am writing a INFO message");
        logger.debug("I am writing a DEBUG message");
        logger.trace("I am writing a TRACE message");

        // examples of why you would log things
        /*
        Calculator calculator = new Calculator();
        logger.info("Calling calculator to get correct result...");
        int roomSqFt = calculator.calculateSquareFootage(10, 20);
        if (roomSqFt == 200) {
            logger.info("Calculator was correct, got expected amount");
        } else {
            logger.error("Calculator sucks and is wrong");
        }

        logger.info("Calling calculator to get bogus result...");
        roomSqFt = calculator.calculateSquareFootage(10, 30);
        if (roomSqFt == 200) {
            logger.info("Calculator was correct, got expected amount");
        } else {
            logger.error("Calculator sucks and is wrong");
        }
        */
    }



}
