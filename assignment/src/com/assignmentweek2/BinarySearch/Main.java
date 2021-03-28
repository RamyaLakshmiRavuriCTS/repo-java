package com.assignmentweek2.BinarySearch;

import java.util.Scanner;
import java.util.TreeSet;
/*
This is the main method
 */
public class Main {
    public static void main(String[] args) {
        TreeSet <Number> elementSet =new TreeSet<>();
        Scanner scanner= new Scanner(System.in);
        int inputSize = getInputSize(scanner);
        AddingElements(elementSet, scanner, inputSize);
        SearchingElement(elementSet, scanner);
    }
/*
This method is used for searching element
 */
    private static void SearchingElement(TreeSet<Number> elementSet, Scanner scanner) {
        System.out.println("Searching Element");
        int x=scanner.nextInt();
        System.out.println("Element "+ x +" exists at index "+indexOf(elementSet ,x));
    }
/*
This method is used for Adding elements
 */
    private static void AddingElements(TreeSet<Number> elementSet, Scanner scanner, int inputSize) {
        for(int i=0; i<inputSize;i++){
            elementSet.add(scanner.nextInt());
        }
        System.out.println("Input Elements" +elementSet);
    }
/*
This method is used for inputting InputSize
 */
    private static int getInputSize(Scanner scanner) {
        System.out.println("InputSize");
        return scanner.nextInt();
    }
/*
This method is used to find the index of the element
 */
    private static int indexOf(TreeSet<Number> elementSet, Number x) {
        int index = -1;
        if(elementSet.contains(x)){
            index = elementSet.headSet(x).size();
        }
        return index;
    }
    }

