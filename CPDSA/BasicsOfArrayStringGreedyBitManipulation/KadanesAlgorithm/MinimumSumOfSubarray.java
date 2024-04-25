package CPDSA.BasicsOfArrayStringGreedyBitManipulation.KadanesAlgorithm;

import java.io.*;
import java.util.*;

public class MinimumSumOfSubarray {
    
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer s = new StringTokenizer(br.readLine());
            int arr[] = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(s.nextToken());
            }

            //alg
            String result = "";

            for (int k = 0; k < N; k++) {
                int currSum = Integer.MAX_VALUE;
                int minSum = 0;

                for (int j = k; j < N; j++) {
                    minSum += arr[j];
                    if (currSum > minSum) {
                        currSum = minSum; 
                    }
                    if (minSum > 0) {
                        minSum = 0; 
                    }
                }

                result = result + Integer.toString(currSum) + " ";
            }

            list.add(result);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }

}
