package com.williams.inventoryservice.exception;


/**
 *
 * This is an exception class
 */
public class CustomException extends RuntimeException{
    CustomException(String message) {
        super(message);
    }

    CustomException(String message, Throwable cause) {
        super(message, cause);
        if (this.getCause() == null && cause != null) {
            this.initCause(cause);
        }
    }
}
