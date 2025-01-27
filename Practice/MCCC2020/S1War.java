package MCCC2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1War {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());

        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(str.nextToken());
        }

        str = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(str.nextToken());
        }

        int battleCount = 0;
        boolean battleBegun = false;

        for (int i = 0; i < N; i++) {
            if (!battleBegun && (A[i] == B[i])) {
                battleCount++;
                battleBegun = true;
            }
            if (battleBegun && (A[i] != B[i])) {
                battleBegun = false;
            }
        }

        System.out.println(battleCount);
    }

}
