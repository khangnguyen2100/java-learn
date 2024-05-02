package com.javaLearn.Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
  private final ArrayList<T> items = new ArrayList<>();
  private int size = 0;

  public void add(T item) {
    items.add(item);
    size++;
  }

  public T get(int index) {
    return items.get(index);
  }

  @Override
  public Iterator<T> iterator() {
    return new ListIterator(this);
  }

  // use to map to an array
  public class ListIterator implements Iterator<T> {
    private final GenericList<T> list;
    private int index = 0;

    public ListIterator(GenericList<T> list) {
      this.list = list;
    }

    @Override
    public boolean hasNext() {
      return index < list.size;
    }

    @Override
    public T next() {
      return list.items.get(index++);
    }
  }
}
