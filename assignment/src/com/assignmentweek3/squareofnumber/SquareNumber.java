package com.assignmentweek3.squareofnumber;

import java.util.ArrayList;
import java.util.function.Predicate;
public class SquareNumber {
    /*
    This is the main method
     */
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(2);
        input.add(45);
        input.add(67);
        input.add(33);
        input.add(24);
        input.add(88);
        input.add(94);
        input.add(356);
        input.add(77);
        input.add(12);
        System.out.println(input);
        displayEvenNumbers(input);
        PrintNumber number = num -> System.out.println("Square is :" + num * num);
        number.print(5);
    }
    /*
    This is the method to display even numbers
     */
        private static void displayEvenNumbers(ArrayList<Integer> input ){
        Predicate<Integer> isEven = (number) -> number %2 ==0;

        input.stream()
                .filter(isEven)
                .forEach(System.out :: println);
    }
  private boolean isEven (Integer number){
        return number % 2 == 0;
   }

    interface PrintNumber{
        public void print (int num);
    }
}
