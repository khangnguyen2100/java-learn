package com.javaLearn.streams;

public class Movie {
  private String title;
  private int like;


  public Movie(String title, int like) {
    this.title = title;
    this.like = like;
  }

  public int getLike() {
    return like;
  }

  @Override
  public String toString() {
    return this.title;
  }
}
