package Kattis;

import java.util.*;

public class AmalgamatedArtichokes {

    static int p;
    static int a;
    static int b;
    static int c;
    static int d;

    public static double price(int k) {

        return p * (Math.sin(a * k + b) + Math.cos(c * k + d) + 2);

    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        p = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int n = sc.nextInt();

        double difference = 0;
        double max = price(1);

        for (int i = 2; i <= n; i++) {

            if (max - price(i) < 0) {
                max = price(i);
            }

            if (max - price(i) > difference) {
                difference = max - price(i);
            }
        }

        System.out.println(difference);

    }

}
