package CCC2015;

import java.util.*;

public class S1ZeroThatOut {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        sc.nextLine();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++) {
            int num = sc.nextInt();
            sc.nextLine();

            if (num != 0) {
                stack.push(num);
            }
            else {
                stack.pop();
            }
        }

        int accum = 0;

        for (int num : stack) {
            accum += num;
        }

        System.out.println(accum);
        
    }

}
