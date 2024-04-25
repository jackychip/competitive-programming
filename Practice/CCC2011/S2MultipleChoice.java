package CCC2011;

import java.util.*;

public class S2MultipleChoice {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String[] responses = new String[N];
        String[] answers = new String[N];

        for (int i = 0; i < N; i++) {
            responses[i] = sc.nextLine();
        }

        for (int i = 0; i < N; i++) {
            answers[i] = sc.nextLine();
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            if (responses[i].equals(answers[i])) {
                count++;
            }
        }

        System.out.println(count);
        
    }

}
