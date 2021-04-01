package com.assignment2.binarysearch;
import java.util.*;
/**
 * creating a class for binary search
 */
public class BinarySearch<T>{
    public static void main(String[] args) {

    Set<Integer> intInput =new HashSet<Integer>();
        intInput.add(1);
        intInput.add(2);
        intInput.add(4);
        intInput.add(3);
    Set<Float> floatInput =new HashSet<Float>();
        floatInput.add( 5.2f);
        floatInput.add( 9.3f);
        floatInput.add( 12.8f);
        floatInput.add( 3.9f);
    Set<Double> doubleInput =new HashSet<Double>();
        doubleInput.add( 6.5);
        doubleInput.add( 9.9);
        doubleInput.add( 12.4);
        doubleInput.add(3.85);
    processIntData(intInput);
    processDoubleData(doubleInput);
    processFloatData(floatInput);

}

    //This method is to process Int data
    private static void processIntData(Set intInput){
        TreeSet <Number> intSet =new TreeSet<>(intInput);
        int searchNumber=3;
        searchingElement(intSet,3);
    }

    //This method is to process Float data
    private static void processFloatData(Set floatInput){
        TreeSet <Number> floatSet =new TreeSet<>(floatInput);
        float searchNumber= (float) 9.3;

        searchingElement(floatSet,9.3);
    }

    //This method is to process Double data
    private static void processDoubleData(Set doubleInput){
        TreeSet <Number> doubleSet =new TreeSet<>(doubleInput);
        double searchNumber =12.4;
        searchingElement(doubleSet,12.4);
    }

    //This method is used for searching element
    private static void searchingElement(TreeSet<Number> elementSet , Number searchNumber) {


        System.out.println("Element "+ searchNumber +" exists at index "+indexOf(elementSet ,searchNumber));
    }
    
    //This is method is used to search index
    private static int indexOf(TreeSet<Number> elementSet, Number searchNumber) {
        int index = -1;
        if (elementSet.contains(searchNumber)) {
            index = elementSet.headSet(searchNumber).size();
        }
        return index;

    }
}
