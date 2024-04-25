package CCC2017;

import java.util.*;

public class J3ExactlyElectrical {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        sc.nextLine();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        sc.nextLine();

        int numberOfMoves = sc.nextInt();
        sc.nextLine();

        int mod = (Math.abs(x1 - x2)) + (Math.abs(y1 - y2));
        
        if (mod <= numberOfMoves && ((numberOfMoves % 2) == (mod % 2))) {
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
    }

}
