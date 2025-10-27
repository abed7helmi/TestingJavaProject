package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExemples {

    public static void transformStringEnInt(){
        Function<String, Integer> f = s -> s.length();

        System.out.println(f.apply("Java"));   // 4
        System.out.println(f.apply("Python")); // 6
    }

    public static void withStream(){

        List<String> list = Arrays.asList("Java", "Python");
        Function<String, Integer> f = s -> s.length();
        List<Integer> formatedResult = list.stream()
                .map(f) // map prend un Function
                .collect(Collectors.toList());

    }

    public static void plusieursFunction(){
        Function<Integer, Integer> doubler = x -> x * 2;
        Function<Integer, String> toString = x -> "Résultat: " + x;

        Function<Integer, String> chain = doubler.andThen(toString);

        System.out.println(chain.apply(5)); // Résultat: 10

    }
}
