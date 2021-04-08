package com.assignment.lambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {

        //Creating a list oddOrEven of given input
        List<Integer> oddOrEven = new ArrayList<>(Arrays.asList(2,45,67,33,24,88,94,356,77,12));
        int number = 5;

        //Printing all even numbers in the list using Lambda Expressions
        System.out.print("Even numbers: ");
        oddOrEven.forEach(n -> {
            if (n%2 == 0)
                System.out.print(n+" ");
                }
                );
        System.out.println();

        //Implementing squares method by creating a object for that anonymous class using Lambda Expression
        SquaringNumber squaringNumber = integer -> (integer*integer);
        //Passing the given input into the instantiated method and printing them
        System.out.println(squaringNumber.squares(number));
    }
}