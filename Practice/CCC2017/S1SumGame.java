package CCC2017;

import java.util.*;

public class S1SumGame {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        int[] teamOne = new int[N];
        int[] teamTwo = new int[N];

        for (int i = 0; i < N; i++) {
            teamOne[i] = sc.nextInt();
        }

        sc.nextLine();

        for (int i = 0; i < N; i++) {
            teamTwo[i] = sc.nextInt();
        }

        sc.nextLine();

        int largestIndex = 0;
        int one = 0;
        int two = 0;

        for (int i = 0; i < N; i++) {
            one += teamOne[i];
            two += teamTwo[i];

            if (one == two) {
                largestIndex = i + 1;
            }
        }

        System.out.println(largestIndex);
    }

}
