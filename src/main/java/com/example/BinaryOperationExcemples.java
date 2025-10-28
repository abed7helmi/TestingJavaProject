package com.example;

import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperationExcemples {


    public static void simple() {
        BinaryOperator<Integer> addition = (a, b) -> a + b;

        System.out.println(addition.apply(3, 4)); // 7
    }

    public static void withStream() {
        List<Integer> nombres = List.of(1, 2, 3, 4, 5);

        BinaryOperator<Integer> addition = (a, b) -> a + b;

        int somme = nombres.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(somme); // 15

    }
}
