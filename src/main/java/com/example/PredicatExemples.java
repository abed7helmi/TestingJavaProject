package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicatExemples {

    public static void multiplePredicat() {
        Predicate<String> commenceParA = n -> n.startsWith("A");
        Predicate<String> plusDe3Lettre = n -> n.length() > 3;
        Predicate<String> plusDe5Lettre = n -> n.length() > 5;


        Predicate<String> condition = commenceParA.and(plusDe3Lettre).and(plusDe5Lettre);
        System.out.println("multiplePredicat : " +condition.test("Ali"));   // false
        System.out.println(condition.test("Amine")); // tru
    }

    public static void manipPredicateWithLambda() {
        Predicate<Integer> predicate = x -> x > 0 ;
        System.out.println("manipPredicateWithLambda : " +predicate.test(-1));
    }


    static void manipPredicate() {
        Predicate<Integer> pre = new Predicate<Integer> () {
            @Override
            public boolean test(Integer o) {
                return o > 0;
            }
        };

        System.out.println("manipPredicate : " +pre.test(3));


    }

    static void manipPredicateWithStream() {

        Predicate<Integer> pre = x -> x > 2 ;

        List<Integer> maListe = Arrays.asList(1,2,3,4);

        List<Integer> maNouvelleListe= maListe.stream().filter(pre).collect(Collectors.toList());

        System.out.println("manipPredicateWithStream : " +maNouvelleListe);

    }
}
