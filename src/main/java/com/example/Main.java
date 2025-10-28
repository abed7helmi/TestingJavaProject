package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // predicat
        PredicatExemples.manipPredicate();
        PredicatExemples.manipPredicateWithLambda();
        PredicatExemples.multiplePredicat();
        PredicatExemples.manipPredicateWithStream();

        //Function
        FunctionExemples.transformStringEnInt();
        FunctionExemples.withStream();
        FunctionExemples.plusieursFunction();

        // Consumer
        ConsomerExemples.consumerExempleStream();
        ConsomerExemples.consumerExemple();
        ConsomerExemples.consumerWithForeEachList();

        //Supplier
        SupplierExemples.retourObject();
        SupplierExemples.retourString();
        SupplierExemples.withStream();

    }




}