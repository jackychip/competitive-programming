package CCC2014;

import java.util.Scanner;

public class J2VoteCount {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String line = sc.nextLine();

        int A = 0;
        int B = 0;

        for (int i = 0; i < N; i++) {
            if (line.charAt(i) == 'A') {
                A++;
            }
            else {
                B++;
            }
        }

        if (A > B) {
            System.out.println("A");
        }
        else if (B > A) {
            System.out.println("B");
        }
        else {
            System.out.println("Tie");
        }
    }

}
