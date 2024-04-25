package CCC2016;

import java.util.*;
import java.io.*;

public class S2TandemBicycle {

    static int findMax(int[] speeds1, int[] speeds2, int N) {
        //greedy alg (find the N largest numbers in both arrays)
        int[] combine = new int[speeds1.length + speeds2.length];

        //copying array to larger array
        System.arraycopy(speeds1, 0, combine, 0, speeds1.length);
        System.arraycopy(speeds2, 0, combine, speeds1.length, speeds2.length);
        Arrays.sort(combine);

        int result = 0;

        for (int i = N; i < combine.length; i++) {
            result += combine[i];
        }

        return result;
    }

    static int findMin(int[] speeds1, int[] speeds2, int N) {

        //YOU MUST sort the list first before comparing to ensure that
        //the lowest values are compared with the lowest values and highest compared to highest
        int result = 0;

        Arrays.sort(speeds1);
        Arrays.sort(speeds2);

        for (int i = 0; i < N; i++) {
            if (speeds1[i] > speeds2[i]) {
                result += speeds1[i];
            }
            else {
                result += speeds2[i];
            }
        }

        return result;
    }
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isDescending = Integer.parseInt(br.readLine()) == 1;
        int N = Integer.parseInt(br.readLine());

        int[] speeds1 = new int[N];
        int[] speeds2 = new int[N];

        StringTokenizer s1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            speeds1[i] = Integer.parseInt(s1.nextToken());
        }
        s1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            speeds2[i] = Integer.parseInt(s1.nextToken());
        }

        System.out.println(isDescending ? findMin(speeds1, speeds2, N) : findMax(speeds1, speeds2, N));

    }

}
