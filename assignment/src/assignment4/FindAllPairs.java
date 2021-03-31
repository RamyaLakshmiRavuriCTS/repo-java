package assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllPairs {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Enter the sum of pairs");
        int sum = in.nextInt();
        int count=0;
        System.out.println("Enter elements into Array");
        //Reading elements into array list
        while(count < 10) {
            array.add(in.nextInt());
            count++;
        }
        System.out.println("Pairs of elements whose sum is "+sum+" are:");
        //performing iteration to find the sum of pairs that are equal to given sum
        for(int i = 0;i < array.size()-1;i++) {
            for(int j=i+1;j < array.size();j++){
                if(array.get(i)+array.get(j) == sum) {
                    System.out.println(array.get(i)+" + "+array.get(j)+" = "+sum);
                }
            }
        }

    }
}
