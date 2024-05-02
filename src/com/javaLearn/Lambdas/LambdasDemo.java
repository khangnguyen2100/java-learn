package com.javaLearn.Lambdas;


import java.util.List;
import java.util.function.*;

public class LambdasDemo {

  public static void show() {
//    lambdaExpressionDemo();
//    consumerInterfaceDemo();
//    supplierDemo();
//    functionInterfaceDemo();
    predicateDemo();
  }

  public static void lambdaExpressionDemo() {
    // anonymous inner classes: can pass implementation code inside a function without creating a new class
    greet(new Printer() {
      @Override
      public void print(String message) {
        System.out.println(message);
      }
    });

    // lambda expression: it uses like above but shorter (like arrow function in JS)
    Printer printer = message -> System.out.println("Lambda expression " + message);
    greet(printer);

  }

  public static void greet(Printer printer) {
    printer.print("hey");
  }

  // Consumer interface: take 1 argument and return NO result
  public static void consumerInterfaceDemo() {
    List<Integer> list = List.of(1, 2, 3, 4, 5);

    // example of consumer interface
    list.forEach(num -> {
      System.out.println("num = " + num);
    });

    Consumer<Integer> x10 = x -> System.out.println(x * 10);
    Consumer<Integer> x5 = x -> System.out.println(x * 5);
    list.forEach(x10.andThen(x5));
  }

  // supplier interface: take NO argument and have a return value
  public static double supplierDemo() {
    Supplier<Double> getRandom = Math::random;

    double randomNumber = getRandom.get();
    System.out.println("randomNumber = " + randomNumber);
    return randomNumber;

  }

  // function interface: take 1 argument and return 1 value
  public static void functionInterfaceDemo() {
    // transform key=value => { key: value }

    Function<String, String> replaceColon = str -> str.replace("=", ": ");
    Function<String, String> addBrackets = str -> "{ " + str + " }";

    String result1 = replaceColon.andThen(addBrackets).apply("key=value");
    System.out.println("result1 = " + result1);

    // compose is revert order of addThen
    String result2 = addBrackets.compose(replaceColon).apply("key=value");
    System.out.println("result2 = " + result2);
  }

  // take 1 argument and return a boolean value
  public static void predicateDemo() {
    Predicate<String> isLongerThan5 = str -> str.length() < 5;
    Predicate<String> isSmallerThan2 = str -> str.length() > 2;

    boolean result = isLongerThan5.and(isSmallerThan2).test("hehe");
    System.out.println("result = " + result);
  }
}
