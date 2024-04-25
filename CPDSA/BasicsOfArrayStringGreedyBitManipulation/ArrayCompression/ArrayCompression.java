package CPDSA.BasicsOfArrayStringGreedyBitManipulation.ArrayCompression;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Given an array with N distinct elements, convert the given array to a form where all elements are in the range from 0 to N-1. 
 * The order of elements is the same, i.e., 0 is placed in the place of the smallest element, 
 * 1 is placed for the second smallest element, … N-1 is placed for the largest element. 
 * 
 * /*Time complexity: O(N * log N)
 * Auxiliary Space: O(N) */

public class ArrayCompression {

    public static void convert(int arr[], int n) {
        //create copy of array
        int temp[] = arr.clone();

        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();

        //add sorted elements of array to hashmap with values of 0 to n-1
        int value = 0;
        for (int i = 0; i < n; i++)
            map.put(temp[i], value++);

        //change array to hashmap values
        for (int i = 0; i < n; i++) 
            arr[i] = map.get(arr[i]);
    }

    public static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 12, 11, 50};
        int n = arr.length;
 
        System.out.println("Given Array is ");
        printArr(arr, n);
 
        convert(arr, n);
 
        System.out.println("\n\nConverted Array is ");
        printArr(arr, n);
    }

}
