package CCC2011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1EnglishOrFrench {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int s = 0;
        int t = 0;

        for (int i = 0; i < N; i++) {
            String line = br.readLine().toLowerCase();
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 's') {
                    s++;
                }
                else if (line.charAt(j) == 't') {
                    t++;
                }
            }
        }

        if (t > s) {
            System.out.println("English");
        }
        else {
            System.out.println("French");
        }

    }

}
