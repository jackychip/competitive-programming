package CCC2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1CrazyFencing {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] fences = new int[N + 1];
        int[] dists = new int[N];

        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 0; i < N + 1; i++) {
            fences[i] = Integer.parseInt(str.nextToken());
        }

        str = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            dists[i] = Integer.parseInt(str.nextToken());
        }

        double accum = 0;

        for (int i = 0; i < N; i++) {
            accum += (double)(dists[i] * (fences[i] + fences[i + 1])) / 2;
        }

        System.out.println(accum);

    }

}
