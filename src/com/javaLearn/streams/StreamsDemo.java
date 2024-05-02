package com.javaLearn.streams;

import java.util.List;
import java.util.stream.Stream;

// stream is just a way to get data out of a collection
public class StreamsDemo {

  public static void main() {
    List<Movie> movies = List.of(
      new Movie("a", 10),
      new Movie("b", 3),
      new Movie("b", 15)
    );

    List<Movie> topLikeMovies = 
      movies.stream()
        .filter((movie) -> movie.getLike() > 10)
        .toList();

    System.out.println("topLikeMovies = " + topLikeMovies.toString());
  }

}
