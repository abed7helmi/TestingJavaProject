package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemples {


    public static void retourString() {
        Supplier<String> salut = () -> "Bonjour le monde !";

        System.out.println(salut.get());
    }


    public static void retourObject() {
        Supplier<ArrayList> createur = () -> new ArrayList(List.of("A","B"));

        ArrayList p = createur.get();
        System.out.println(p);
    }

    public static void withStream() {
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(10);

        Stream.generate(randomSupplier)
                .limit(5)
                .forEach(System.out::println);
    }
}
