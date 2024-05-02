package com.javaLearn.collections;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
  private String name;
  private String email;

  public Customer(String name, String email) {
    this.name = name;
    this.email = email;
  }

  @Override
  public String toString() {
    return this.name;
  }


  public String getEmail() {
    return email;
  }


  @Override
  public int compareTo(Customer o) {
    return this.name.length() - o.name.length();
  }
}
