package com.javaLearn.Exceptions;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient funds exception");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
