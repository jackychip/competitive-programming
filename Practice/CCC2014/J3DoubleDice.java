package CCC2014;

import java.util.Scanner;

public class J3DoubleDice {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int a = 100;
        int b = 100;

        for (int i = 0; i < N; i++) {
            int one = sc.nextInt();
            int two = sc.nextInt();

            if (one != two) {
                if (two > one) {
                    a -= two;
                }
                else {
                    b -= one;
                }
            }
        }

        System.out.println(a);
        System.out.println(b);

    }

}
