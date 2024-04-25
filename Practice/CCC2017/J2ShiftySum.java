package CCC2017;

import java.util.*;

public class J2ShiftySum {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        int k = sc.nextInt();
        sc.nextLine();

        int accum = 0;
        int multi = 1;

        for (int i = 0; i <= k; i++) {
            accum += multi * N;
            multi *= 10;
        }

        System.out.println(accum);

    }

}
