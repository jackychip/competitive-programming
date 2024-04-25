package CCC2018;

import java.util.*;

public class S1VoronoiVillages {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        double[] villages = new double[N];

        for (int i = 0; i < N; i++) {
            villages[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.printf("%.1f", solve(villages, N));

    }

    public static double solve(double[] villages, int N) {
        Arrays.sort(villages, 0, N);

        double smallest = ((Math.abs(villages[1] - villages[0])) / 2) + ((Math.abs(villages[2] - villages[1])) / 2);

        for (int i = 2; i < N - 1; i++) {
            double calc = ((Math.abs(villages[i] - villages[i - 1])) / 2) + ((Math.abs(villages[i + 1] - villages[i])) / 2);
            if (calc < smallest) {
                smallest = calc;
            }
        }

        return smallest;
    }

}
