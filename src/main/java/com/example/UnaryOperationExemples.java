package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperationExemples {

    public static void simple () {
        UnaryOperator<Integer> doubleValue = n -> n * 2;

        System.out.println(doubleValue.apply(5)); // 10
        System.out.println(doubleValue.apply(12));
    }

    public static void withStream () {
        UnaryOperator<Integer> increment = x -> x + 1;

        List<Integer> nombres = List.of(1, 2, 3, 4);

        List<Integer> incrementes = nombres.stream()
                .map(increment)
                .toList();

        System.out.println(incrementes);
    }

}
