package CCC2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2SymmetricMountains {

    static int[] solve(int[] m, int N) {

        int[] a = new int[N];
        a[0] = 0;

        if (N == 1) {
            return a;
        }

        // find diff of 2 size and 3 size
        int[] even = new int[N - 1];
        int val = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            int temp = Math.abs(m[i] - m[i - 1]);
            even[i - 1] = temp;
            val = Math.min(temp, val);
        }

        a[1] = val;

        if (N == 2) {
            return a;
        }

        int[] odd = new int[N - 2];
        val = Integer.MAX_VALUE;
        for (int i = 0; i < N - 2; i++) {
            int temp = Math.abs(m[i] - m[i + 2]);
            odd[i] = temp;
            val = Math.min(temp, val);
        }

        a[2] = val;

        // start calculating for rest of diffs using even and odd diffs
        int prevI = 3;
        int index = 1;
        for (int i = 3; i < N; i++) {
            if (i - prevI == 2) {
                prevI = i;
                index++;
            }
            int start = 0;
            val = Integer.MAX_VALUE;
            int tempIndex = index;
            while (start + i < N) {
                int temp = Math.abs(m[start] - m[start + i]) + (i % 2 == 0 ? odd[tempIndex] : even[tempIndex]);
                // System.out.println(i + ": " + temp + " " + tempIndex);
                if (i % 2 == 0) {
                    odd[tempIndex] = temp;
                }
                else {
                    even[tempIndex] = temp;
                }
                val = Math.min(temp, val);
                start++;
                tempIndex++;
            }
            a[i] = val;
            // System.out.println("------");
            // System.out.println("temp Index: " + index);
        }
        // System.out.println("Index: " + index);

        return a;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] m = new int[N];

        StringTokenizer s = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            m[i] = Integer.parseInt(s.nextToken());
        }

        int[] a = solve(m, N);
        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
    }
    
}
