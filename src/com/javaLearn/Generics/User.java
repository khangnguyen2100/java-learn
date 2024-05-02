package com.javaLearn.Generics;

public class User implements Comparable<User> {
    public int getPoints() {
        return points;
    }

    private final int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User o) {
        return this.points - o.points;
    }
}
