package CPDSA.FastIO;

import java.io.*;
import java.util.*;

public class FastIO {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
