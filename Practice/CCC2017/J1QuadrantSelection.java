package CCC2017;

import java.util.*;

public class J1QuadrantSelection {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        sc.nextLine();
        int y = sc.nextInt();
        sc.nextLine();

        int quad = 0;

        if (x > 0 && y > 0) {
            quad = 1;
        }
        else if (x < 0 && y > 0) {
            quad = 2;
        }
        else if (x < 0 && y < 0) {
            quad = 3;
        }
        else {
            quad = 4;
        }

        System.out.println(quad);

    }

}
