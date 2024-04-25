package CCC2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1Trianglane {

    static int solve(int[] first, int[] second, int N) {
        //count number of edges (by 3)
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (first[i] == 1) {
                count += 3;
            }
            if (second[i] == 1) {
                count += 3;
            }
        }

        for (int i = 0; i < N; i++) {
            if (first[i] == 1 && second[i] == 1 && i % 2 == 0) {
                count -= 2;
            }
            if (i + 1 < N && first[i] == 1 && first[i + 1] == 1) {
                count -= 2;
            }
            if (i + 1 < N && second[i] == 1 && second[i + 1] == 1) {
                count -= 2;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        StringTokenizer s = new StringTokenizer(br.readLine());
        int[] first = new int[C];
        int[] second = new int[C];

        int index = 0;
        while (s.hasMoreTokens()) {
            first[index] = Integer.parseInt(s.nextToken());
            index++;
        }

        s = new StringTokenizer(br.readLine());
        index = 0;

        while (s.hasMoreTokens()) {
            second[index] = Integer.parseInt(s.nextToken());
            index++;
        }

        System.out.println(solve(first, second, C));
    }

}
