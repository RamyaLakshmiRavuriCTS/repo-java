package assignment1;
import java.util.*;

    public class BinarySearch {

        public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> remove) {

            HashSet<Integer> set = new HashSet<>(remove);

            return new ArrayList<>(set);
        }

        public static ArrayList<Integer> sorting(ArrayList<Integer> sort) {

            TreeSet<Integer> treeSet = new TreeSet<>(sort);

            System.out.println("Sorted elements : "+treeSet);

            return new ArrayList<>(treeSet);

        }

        public static void search(ArrayList<Integer> search, int n) {

            Integer[] arr = search.toArray(new Integer[0]);
            int res = Arrays.binarySearch(arr,n);

            if(res>=0)
                System.out.println("Element "+n+" exists at index "+res);
            else
                System.out.println("Given element doesn’t exists");

        }

    }

