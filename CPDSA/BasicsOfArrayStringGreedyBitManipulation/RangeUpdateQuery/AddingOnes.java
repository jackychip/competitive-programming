package CPDSA.BasicsOfArrayStringGreedyBitManipulation.RangeUpdateQuery;

/*
 * You start with an array A of size N. 
 * Initially all elements of the array A are zero. You will be given K positive integers. 
 * Let j be one of these integers, you have to add 1 to all A[i], where i ≥ j. 
 * Your task is to print the array A after all these K updates are done.
 */

public class AddingOnes {

    public static void update(int a[], int n, int updates[], int k)
    {
        for (int i = 0; i < k; i++) {
            for (int j = updates[k] - 1; j < n; j++) {
                a[j]++;
            }
        }
    }

}
