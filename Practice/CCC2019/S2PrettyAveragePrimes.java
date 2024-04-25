package CCC2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2PrettyAveragePrimes {

    static void printArray(int[][] arr, int T) {
        for (int i = 0; i < T; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }

    static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        if (num == 2 || num == 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i < Math.sqrt(num); i += 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[][] results = new int[T][2];

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if (isPrime(num)) {
                results[i][0] = num;
                results[i][1] = num;
                continue;
            }

            int l = num - 1;
            int r = num + 1;
            while (!isPrime(l) || !isPrime(r)) {
                l--;
                r++;
            }

            results[i][0] = l;
            results[i][1] = r;

        }

        printArray(results, T);

    }

}
