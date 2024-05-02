package com.javaLearn.Exceptions;

import java.io.IOException;

public class Account {
    private int balance;

    public void deposit(int value) throws IOException {
        if (value <= 0)
            throw new IOException("Your input is invalid");
        this.balance = value;
        System.out.println("Deposit successfully!");
    }

    public void withdraw(int value) throws AccountException {
        if (value > this.balance) {
            throw new AccountException(new InsufficientFundsException());
        }
        this.balance -= value;
        System.out.println("Withdraw " + value + '$' + " successfully!");
    }
}
