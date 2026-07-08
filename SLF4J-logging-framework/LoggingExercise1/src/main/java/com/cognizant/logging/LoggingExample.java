package com.cognizant.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        // Demonstrating various logging levels
        logger.debug("Debug message - provides detailed information for debugging");
        logger.info("Application Started");
        logger.warn("This is a warning message - indicates a potential issue.");
        logger.error("This is an error message - indicates a serious problem occurred.");
        
        // Example with exception handling
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("An arithmetic error occurred", e);
        }
        
        logger.info("Application Finished");
    }
}
