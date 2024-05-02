package com.javaLearn.Generics;

public class List {
    private final int[] items = new int[10];
    private int count = 0;

    public void add(int item) {
        items[count++] = item;
    }

    public int get(int index) {
        return items[index];
    }
}
