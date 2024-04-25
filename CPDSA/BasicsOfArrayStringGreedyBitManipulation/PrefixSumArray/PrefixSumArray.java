package CPDSA.BasicsOfArrayStringGreedyBitManipulation.PrefixSumArray;

//Given an array arr[] of size N, find the prefix sum of the array. 
//A prefix sum array is another array prefixSum[] of the same size, 
//such that the value of prefixSum[i] is arr[0] + arr[1] + arr[2] . . . arr[i].

/*Time Complexity: O(N)
Auxiliary Space: O(N) */

public class PrefixSumArray {
    
    static void fillPrefixSum(int arr[], int n, int prefixSum[]) {
        prefixSum[0] = arr[0];
        
        for (int i = 1; i < n; ++i) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 4, 16, 20 }; 
        int n = arr.length;
        int prefixSum[] = new int[n];

        fillPrefixSum(arr, n, prefixSum);
        for (int i = 0; i < n; i++) {
            System.out.print(prefixSum[i] + " ");
        }
        System.out.println();
    }

}
