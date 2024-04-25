package CPDSA.BasicsOfArrayStringGreedyBitManipulation.CountingFrequencyArray;

import java.util.*;

//Counting frequencies of array elements using Hashing (HashMaps)
//Time Complexity : O(n) 
//Auxiliary Space : O(n)

public class CountingFrequenciesOfArrayElements {
    
    static HashMap<Integer, Integer> countFreq(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        HashMap<Integer, Integer> map = countFreq(arr, n);
        for (int key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }

}
