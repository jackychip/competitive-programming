package CCC2018;

import java.util.*;

public class J1Telemarketer {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        sc.nextLine();
        int second = sc.nextInt();
        sc.nextLine();
        int third = sc.nextInt();
        sc.nextLine();
        int fourth = sc.nextInt();
        sc.nextLine();

        boolean b = false;

        if (first == 8 || first == 9) {
            if (fourth == 8 || fourth == 9) {
                if (second == third) {
                    b = true;
                }
            }
        }

        if (b) {
            System.out.println("ignore");
        }
        else {
            System.out.println("answer");
        }
    }

}
