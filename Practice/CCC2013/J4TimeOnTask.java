package CCC2013;

import java.util.*;

public class J4TimeOnTask {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        int numberOfChores = sc.nextInt();
        sc.nextLine();

        int[] chores = new int[numberOfChores];

        for (int i = 0; i < numberOfChores; i++) {
            chores[i] = sc.nextInt();
            sc.nextLine();
        }

        int accum = 0;

        Arrays.sort(chores);
        int index = 0;
        while (true) {
            accum += chores[index];
            if (accum > T) {
                break;
            }
            index++;
        }

        System.out.println(index);
    }

}
