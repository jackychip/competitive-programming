import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] hats = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            hats[i] = Integer.parseInt(br.readLine());
        }

        int add = N/2;
        int accum = 0;

        for (int i = 1; i <= N/2; i++) {
            if (hats[i] == hats[i + add]) {
                accum += 2;
            }
        }

        System.out.println(accum);

    }

}