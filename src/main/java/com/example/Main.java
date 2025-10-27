package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        manipPredicate();
        //manipStrem();
    }


    static void manipPredicate() {
        Predicate<Integer> pre = new Predicate<Integer> () {
            @Override
            public boolean test(Integer o) {
                return o > 0;
            }
        };

        System.out.println(pre.test(-21));

    }

    static void manipStrem(){

        List<String> l = Arrays.asList("A","Z","V") ;
       // l.add("zebi");
        l.stream().sorted().forEach(System.out::println);

        for (String s : l) {
            System.out.println(s);
        }

    }
}