package com.javaLearn.collections;

import java.util.*;

public class CollectionsDemo {
  public static void show() {

    // doesn't care about the INDEX
    Collection<Integer> collection = new ArrayList<>();
    collection.add(1);
    collection.add(2);
    collection.remove(1);
    collection.clear();

    // it like collection but care about INDEX
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    int secondItem = list.get(1);
    list.remove(1);

    // use when you have a list of queue in order
    Queue<Integer> queue = new ArrayDeque<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    Object front = queue.peek(); // use Object type because front could be null
    queue.poll();

    // use when you have a list of UNIQUE item
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    set1.add(1);
    set1.add(2);

    set2.add(2);
    set2.add(3);
//    set1.retainAll(set2);


    // use when you have a list of key value pair
    Map<String, Customer> map = new HashMap<>();

    Customer c1 = new Customer("khang", "khang@gmail.com");
    Customer c2 = new Customer("jhang", "jhang@gmail.com");
    Customer unknown = new Customer("unknown", "unknown@gmail.com");

    map.put(c1.getEmail(), c1);
    map.put(c2.getEmail(), c2);

    // add default value when not found
    map.getOrDefault("you cant find it", unknown);
    boolean isExistsKey = map.containsKey(c1.getEmail());

    // map to a Map
//    map.values();
//    map.keySet()
    for (Map.Entry<String, Customer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue().getEmail());
    }


  }
}
