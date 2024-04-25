package CCC2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2SymmetricMountains {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] input = new int[N];
        int[][] c = new int[N][N];

        StringTokenizer s = new StringTokenizer(br.readLine());

        int index = 0;
        while (s.hasMoreTokens()) {
            input[index] = Integer.parseInt(s.nextToken());
            index++;
        }

        System.out.print(0 + " ");

        for (int length = 0; length < N - 1; length++) {
            int start = 0;
            int end = length + 1;
            int minSym = Integer.MAX_VALUE;

            while (end < N) {
                c[start][end] = Math.abs(input[start] - input[end]) + c[start + 1][end - 1];
                minSym = Math.min(minSym, c[start][end]);
                start++;
                end++;
            }
            
            System.out.print(minSym + " ");
        }

        System.out.println();

    }
    
}
