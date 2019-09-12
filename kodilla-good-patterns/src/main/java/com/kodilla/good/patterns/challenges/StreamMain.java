package com.kodilla.good.patterns.challenges;


import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

        MovieStore movie = new MovieStore();
        Map<String, List<String>> moviesMap = movie.getMovies();
        moviesMap.entrySet().stream()
                .map(entry ->entry.getValue())
                .map(e -> e.toString().replace("[","!").replace("]","!").replace(",","!"))
                .forEach(System.out::println);
    }
}
