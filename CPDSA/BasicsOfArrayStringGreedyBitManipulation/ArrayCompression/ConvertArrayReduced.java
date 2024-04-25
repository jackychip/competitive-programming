package CPDSA.BasicsOfArrayStringGreedyBitManipulation.ArrayCompression;

import java.util.Arrays;
import java.util.HashMap;

/*Given an array with N distinct elements, convert the given array to a reduced form 
where all elements are in range from 0 to N-1. The order of elements is same, i.e., 0 is
placed in place of smallest element, 1 is placed for second smallest element, 
and N-1 is placed for the largest element. */

public class ConvertArrayReduced {
    void convert(int[] arr, int n) {
        int temp[] = arr.clone();
        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();

        int value = 0;
        for (int i = 0; i < n; i++)
            map.put(temp[i], value++);

        for (int i = 0; i < n; i++)
            arr[i] = map.get(arr[i]);

    }
}
