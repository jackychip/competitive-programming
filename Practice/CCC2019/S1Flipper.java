package CCC2019;

import java.util.*;

public class S1Flipper {

    public static void main(String[] args) {
        int[] top = {1, 2};
        int[] bottom = {3, 4};

        Scanner sc = new Scanner(System.in);
        String commands = sc.nextLine();

        for (int i = 0; i < commands.length(); i++) {
            if (commands.charAt(i) == 'H') {
                int temp = top[0];
                top[0] = bottom[0];
                bottom[0] = temp;

                temp = top[1];
                top[1] = bottom[1];
                bottom[1] = temp;
            }
            else {
                int temp = top[0];
                top[0] = top[1];
                top[1] = temp;

                temp = bottom[0];
                bottom[0] = bottom[1];
                bottom[1] = temp;
            }
        }

        System.out.println(top[0] + " " + top[1]);
        System.out.println(bottom[0] + " " + bottom[1]);
    }
    

}