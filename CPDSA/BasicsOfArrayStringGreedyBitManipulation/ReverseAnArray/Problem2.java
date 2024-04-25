package CPDSA.BasicsOfArrayStringGreedyBitManipulation.ReverseAnArray;

import java.util.*;
import java.io.*;

public class Problem2 {
    /*Reena had been given an array arr[] of positive integers of size N.Help her to find the value A.

    A = arr[n]*arr[n] - arr[n-1]*arr[n-1] + arr[n-2]*arr[n-2] - ......... upto index 1

    Input:
    1. The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
    2. The first line of each test case contains a single integer N.
    3. The second line contains N space-separated positive integers represents array arr.

    Output: For each test case, print the value of A in a single line */

    static void reverseArray(int[] arr, int size) {
        int temp;
        int start = 0;
        int end = size - 1;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        int[] sums = new int[T];

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer s = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(s.nextToken());
            }
            reverseArray(arr, N);
            int accum = arr[0]*arr[0];
            for (int j = 1; j < N; j++) {
                if (j % 2 == 0) {
                    accum += arr[j]*arr[j];
                }
                else {
                    accum -= arr[j]*arr[j];
                }
            }

            sums[i] = accum;
        }

        for (int i = 0; i < T; i++) {
            System.out.println(sums[i]);
        }
    }
}
