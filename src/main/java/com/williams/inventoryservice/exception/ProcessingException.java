package com.williams.inventoryservice.exception;


/**
 *
 * This is an exception class
 */
public class ProcessingException extends CustomException {
    public ProcessingException(String message) {
        super(message);
    }

    public ProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
