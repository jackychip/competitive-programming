package CPDSA.BasicsOfArrayStringGreedyBitManipulation.SumOfArrayElements;

/* Java Program to find sum of elements in a given array  */
//Time Complexity: O(n)
//Auxiliary Space: O(1)

public class SumOfArrayElements {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }

}
