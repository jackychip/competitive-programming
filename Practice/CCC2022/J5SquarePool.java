package CCC2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J5SquarePool {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] yard = new int[N][N];
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            yard[Integer.parseInt(s.nextToken()) - 1][Integer.parseInt(s.nextToken()) - 1] = 1;
        }

        

    }   

}
