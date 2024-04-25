package CCC2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2ModernArt {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        boolean[] rows = new boolean[M];
        boolean[] cols = new boolean[N];

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            String command = str.nextToken();
            int index = Integer.parseInt(str.nextToken());
            if (command.equals("R")) {
                rows[index - 1] = !rows[index - 1];
            }
            else {
                cols[index - 1] = !cols[index - 1];
            }
        }

        boolean[][] canvas = new boolean[M][N];

        //rows
        for (int i = 0; i < M; i++) {
            if (rows[i]) {
                for (int j = 0; j < N; j++) {
                    canvas[i][j] = !canvas[i][j];
                }
            }
        }

        //cols
        for (int i = 0; i < N; i++) {
            if (cols[i]) {
                for (int j = 0; j < M; j++) {
                    canvas[j][i] = !canvas[j][i];
                }
            }
        }

        int accum = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (canvas[i][j]) {
                    accum++;
                }
            }
        }

        System.out.println(accum);
    }

}
