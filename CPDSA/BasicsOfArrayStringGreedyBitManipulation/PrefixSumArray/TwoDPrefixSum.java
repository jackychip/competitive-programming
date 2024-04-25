package CPDSA.BasicsOfArrayStringGreedyBitManipulation.PrefixSumArray;

/*Given a matrix (or 2D array) a[][] of integers, find the prefix sum matrix for it. Let prefix sum matrix be psa[][]. 
The value of psa[i][j] contains the sum of all values which are above it or on the left of it.
Time Complexity: O(R*C) 
Auxiliary Space: O(R*C) */

public class TwoDPrefixSum {
    
    static void prefixSum2D(int a[][]) {
        int R = a.length;
        int C = a[0].length;

        int psa[][] = new int[R][C];

        psa[0][0] = a[0][0];

        //filling first row and first column
        for (int i = 1; i < C; i++) {
            psa[0][i] = psa[0][i - 1] + a[0][i];
        }
        for (int i = 1; i < R; i++) {
            psa[i][0] = psa[i - 1][0] + a[i][0];
        }

        //updating values using general formula
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                psa[i][j] = psa[i - 1][j] + psa[i][j - 1] - psa[i - 1][j - 1] + a[i][j];
            }
        }

        //print array
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(psa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 1, 1, 1, 1 },
                      { 1, 1, 1, 1, 1 },
                      { 1, 1, 1, 1, 1 },
                      { 1, 1, 1, 1, 1 } };
        prefixSum2D(a);
    }

}
