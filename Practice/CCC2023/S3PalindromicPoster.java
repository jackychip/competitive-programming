package CCC2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3PalindromicPoster {

    // subtask 1: 2/2
    // subtask 2: 0/2

    static char[][] solve(int N, int M, int R, int C) {
        // edge cases

        // size 2 N and M
        if ((N == 2 && M == 2) && Math.abs(R - C) > 0) {
            return null;
        }

        if ((N == 2) && (R == 2 && C == 1)) {
            return null;
        }

        if ((N == 2 && M == 3) && (R == 2) && (C == 2)) {
            return null;
        }

        if ((N == 2 && M % 2 == 0) && (C == 1)) {
            return null;
        }

        //map where letters go

        int[][] map = new int[N][M];
        char[][] ans = new char[N][M];

        // cols
        int startCol = M - C < Math.round(M / 2) - 1 ? M - C : Math.round(M / 2) - 1;

        int startingNum = 1;
        for (int i = startCol; i < startCol + C; i++) {
            int top = 0;
            int bottom = N - 1;
            int num = startingNum;
            while (top <= bottom) {
                map[top][i] = num;
                map[bottom][i] = num;
                top++;
                bottom--;
                num++;
            }
            startingNum++;
        }

        // rows
        int startRow = N - R < Math.round(N / 2) - 1 ? N - R : Math.round(N / 2) - 1;

        startingNum = 25;
        for (int i = startRow; i < startRow + R; i++) {
            int left = 0;
            int right = M - 1;
            int diff = 0;
            int num = 0;
            while (left <= right) {
                num = map[i][left] != 0 ? map[i][left] : startingNum - diff;
                map[i][left] = num;
                map[i][right] = num;
                left++;
                right--;
                diff++;
            }
            startingNum--;
        }

        // handle unhandled 0s
        int index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = index % 25;
                    index++;
                }
            }
        }

        // for (int i = 0; i < N; i++) {
        //     for (int j = 0; j < M; j++) {
        //         System.out.print(map[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        //map nums to characters

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 
        'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
        'w', 'x', 'y', 'z'};

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                ans[i][j] = alphabet[map[i][j]];
            }
        }

        return ans;
        
    }
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(s.nextToken()); // number of lines
        int M = Integer.parseInt(s.nextToken()); // number of letters
        int R = Integer.parseInt(s.nextToken()); // number of pal. rows
        int C = Integer.parseInt(s.nextToken()); // number of pal. cols

        char[][] ans = solve(N, M, R, C);

        if (ans == null) {
            System.out.println("IMPOSSIBLE");
            System.exit(0);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

    }   

}
