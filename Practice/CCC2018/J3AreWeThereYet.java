package CCC2018;

import java.util.Scanner;

public class J3AreWeThereYet {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] d = new int[4];
        d[0] = sc.nextInt();
        d[1] = sc.nextInt();
        d[2] = sc.nextInt();
        d[3] = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < 5; i++) {
            int accumulator = 0;
            int direction = -1;
            //find starting number
            for (int j = 0; j < i; j++) {
                accumulator += d[j];
            }
            System.out.print(accumulator + " ");

            for (int j = 0; j < 4; j++) {
                if (accumulator == 0) {
                    direction = 1;
                }
                accumulator +=d[j] * direction;  
                System.out.print(accumulator + " ");
            }
            System.out.println();
        }
    } 

}
