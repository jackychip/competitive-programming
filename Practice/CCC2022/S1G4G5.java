package CCC2022;

import java.util.*;

public class S1G4G5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();

        System.out.println(solve(N));
    }

    public static int solve(int num) {
        int numOfSolutions = 0;

        if (num % 5 == 0)
            numOfSolutions++;

        for (int i = num; i > 0; i -= 5) {
            if (i % 4 == 0) {
                numOfSolutions++;
            }
        }

        return numOfSolutions;
    }
}
