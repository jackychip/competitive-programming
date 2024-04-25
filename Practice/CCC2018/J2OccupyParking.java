package CCC2018;

import java.util.*;

public class J2OccupyParking {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        String today = sc.nextLine();
        String yesterday = sc.nextLine();

        int count = 0;

        for (int i = 0; i < N; i++) {
            if (today.charAt(i) == 'C' && yesterday.charAt(i) == 'C') {
                count++;
            }   
        }

        System.out.println(count);
    } 
}
