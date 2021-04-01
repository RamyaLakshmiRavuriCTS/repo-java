package com.assignment.search;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet <Number> elementSet =new TreeSet<>();
        Scanner scanner= new Scanner(System.in);
        int inputSize = getInputSize(scanner);
        AddingElements(elementSet, scanner, inputSize);
        SearchingElement(elementSet, scanner);
    }

    private static void SearchingElement(TreeSet<Number> elementSet, Scanner scanner) {
        System.out.println("Searching Element");
        float x=scanner.nextFloat();
        System.out.println("Element "+ x +" exists at index "+indexOf(elementSet ,x));
    }

    private static void AddingElements(TreeSet<Number> elementSet, Scanner scanner, int inputSize) {
        for(int i=0; i<inputSize;i++){
            elementSet.add(scanner.nextFloat());
        }
        System.out.println("Input Elements" +elementSet);
    }

    private static int getInputSize(Scanner scanner) {
        System.out.println("InputSize");
        return scanner.nextInt();
    }

    private static int indexOf(TreeSet<Number> elementSet, Number x) {
        int index = -1;
        if(elementSet.contains(x)){
            index = elementSet.headSet(x).size();
        }
        return index;
    }
}
