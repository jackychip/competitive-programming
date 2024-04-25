package CCC2015;

import java.util.*;

public class J4WaitTime {
    
    public static void main(String[] args) {
        HashMap<Integer, Boolean> isAnswered = new HashMap<>();
        HashMap<Integer, Integer> answers = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int numberOfInputs = sc.nextInt();
        sc.nextLine();

        int timePassed = 0;

        for (int i = 0; i < numberOfInputs; i++) {
            char c = sc.next().charAt(0);
            int number = sc.nextInt();
            sc.nextLine();

            if (c == 'R') {
                timePassed += 1;
            }
            else if (c == 'S') {
                
            }
            else {
                timePassed += number;
            }
        }
    }

}
