package Kattis;

import java.util.HashMap;
import java.util.Scanner;

public class BitEqualizer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        int numberOfCases = sc.nextInt();
        sc.nextLine();

        for (int n = 1; n <= numberOfCases; n++) {

            String S = sc.nextLine();
            String T = sc.nextLine();

            char[] input = S.toCharArray();
            char[] output = T.toCharArray();

            int length = input.length;

            //count number of 1s
            int input1s = 0, output1s = 0;

            for (char c : input) {
                if (c == '1') {
                    input1s++;
                }
            }

            for (char c : output) {
                if (c == '1') {  
                    output1s++;
                }
            }

            if (input1s > output1s) {
                hashmap.put(n, -1);
                continue;
            }

            //counting variable
            int count = 0;

            //converting ?s
            for (int i = 0; i < length; i++) {
                if (input[i] == '?') {
                    input[i] = output[i];
                    if (output[i] == '1') {
                        input1s++;
                    }
                    count++;
                }
            }
            
            //converting 0s to 1s
            int index = 0;
            while (input1s != output1s) {
                if (output[index] == '1' && input[index] == '0') {
                    input[index] = output[index];
                    input1s++;
                    count++;
                }
                index++;
            }

            //swapping (look for num of misplaced 1s and 0s)
            int misplacedCount = 0;
            for (int i = 0; i < length; i++) {
                if (input[i] != output[i]) {
                    misplacedCount++;
                }
            }

            count += misplacedCount / 2;

            hashmap.put(n, count);
        }

        //print hashmap
        for (int i = 1; i <= numberOfCases; i++) {
            System.out.println("Case " + i + ": " + hashmap.get(i));
        }
    }   
}
