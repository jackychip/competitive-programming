package Kattis;

import java.util.*;

public class Pascal {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int counter = 0;

        if (N % 2 == 0) {
            counter = N / 2;
        }
        else if (N == 1) {
            counter = 0;
        }
        else {
            for (counter = 3; counter < N/2; counter+=2) {
                if (N % counter == 0) {
                    break;
                }
            }
            counter = N - N / counter;
        }

        System.out.println(counter);

    }

}
