package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsomerExemples {

    public static void consumerExemple() {
        Consumer<String> con = x -> System.out.println(x);
        con.accept("Hello");
        con.accept("World");

    }

    public static void consumerExempleStream() {
        Consumer<String> con = x -> System.out.println(x);

        List<String> list = Arrays.asList("Hello", "World");

        list.stream().forEach(con);

    }

    public static void consumerWithForeEachList() {
        List<String> noms = List.of("Zz","Ali", "Mouna", "Sami");

        noms.forEach(n -> System.out.println("Nom : " + n));

    }
}
