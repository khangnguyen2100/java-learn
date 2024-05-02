package com.javaLearn.Exceptions;

public class AccountException extends Exception {
    public AccountException(Exception cause) {
        super(cause);
    }

    public AccountException() {
        super("Account exception....");
    }

}
