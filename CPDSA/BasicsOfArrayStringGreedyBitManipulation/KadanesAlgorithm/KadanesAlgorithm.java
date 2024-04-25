package CPDSA.BasicsOfArrayStringGreedyBitManipulation.KadanesAlgorithm;

/*Given an array arr[] of size N. 
The task is to find the sum of the contiguous subarray within a arr[] with the largest sum.  */

/*Time Complexity: O(N)
Auxiliary Space: O(1) */

public class KadanesAlgorithm {
    
    //Largest Sum Contiguous Subarray
    public static int LargestSum(int a[]) {
        int size = a.length;
        int currSum = Integer.MIN_VALUE;
        int maxSum = 0;

        for (int i = 0; i < size; i++) {
            maxSum += a[i];
            if (currSum < maxSum)
                currSum = maxSum;
            if (maxSum < 0)
                maxSum = 0;
        }

        return currSum;
    }

    

    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum is " + LargestSum(a));
    }
}
