package CCC2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2Sunflower {

    static void printArray(int[][] arr, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] rotateArray(int[][] arr, int N) {
        int[][] temp = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp[j][N - i - 1] = arr[i][j];
            }
        }

        return temp;
    }

    static boolean isSorted(int[][] arr, int N) {
        //horizontal
        for (int i = 0; i < N; i++) {
            int prev = arr[i][0];
            for (int j = 1; j < N; j++) {
                if (arr[i][j] < prev)
                    return false;
            }
        }

        //vertical
        for (int i = 0; i < N; i++) {
            int prev = arr[0][i];
            for (int j = 1; j < N; j++) {
                if (arr[j][i] < prev)
                    return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(s.nextToken());
            }
        }

        if (isSorted(arr, N)) {
            printArray(arr, N);
            System.exit(0);
        }

        for (int i = 0; i < 3; i++) {
            arr = rotateArray(arr, N);
            if (isSorted(arr, N)) {
                printArray(arr, N);
                System.exit(0);
            }
        }
    }

}
