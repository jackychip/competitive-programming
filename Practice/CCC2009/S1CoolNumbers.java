package CCC2009;

import java.util.*;

public class S1CoolNumbers {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        sc.nextLine();

        int max = sc.nextInt();
        sc.nextLine();

        int counter = 0;

        for (int i = min; i <= max; i++) {

            if (Math.sqrt(i) == (int)Math.sqrt(i) && Math.cbrt(i) == (int)Math.cbrt(i)) {
                counter++;
            }
        }

        System.out.println(counter);

    } 

}
