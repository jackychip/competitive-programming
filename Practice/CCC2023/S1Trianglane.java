package CCC2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1Trianglane {

    static int solve(int[][] tiles, int N) {
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (tiles[0][i] == 1) {
                count += 3;
            }
            if (tiles[1][i] == 1) {
                count += 3;
            }
        }

        int prev = tiles[0][0];
        for (int i = 1; i < N; i++) {
            if (tiles[0][i] == 1 && prev == 1) {
                count -= 2;
            }
            prev = tiles[0][i];
        }   

        for (int i = 0; i < N; i++) {
            if (i > 0 && tiles[1][i - 1] == 1 && tiles[1][i] == 1) {
                count -= 2;
            }
            if (i % 2 == 0 && tiles[0][i] == 1 && tiles[1][i] == 1) {
                count -= 2;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] tiles = new int[2][N];

        StringTokenizer s = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tiles[0][i] = Integer.parseInt(s.nextToken());
        }

        s = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tiles[1][i] = Integer.parseInt(s.nextToken());
        }

        System.out.println(solve(tiles, N));

    }

}
