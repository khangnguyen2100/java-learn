package com.javaLearn.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class ExceptionsDemo {
    public static void show() {
        Account account = new Account();
        System.out.println("num" + Math.pow(2, 0));
        try {
            account.deposit(45);
            account.withdraw(50);
            account.withdraw(70);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (AccountException e) {
            System.out.println(e.getCause().getMessage());
        }
    }


    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
