package CCC2016;

import java.io.*;
import java.util.*;

public class S1Ragaman {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String output = br.readLine();

        HashMap<Character, Integer> inputMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (inputMap.containsKey(c)) {
                inputMap.put(c, inputMap.get(c) + 1);
            }
            else {
                inputMap.put(c, 1);
            }
        }
        
        int ast = 0;

        for (int i = 0; i < output.length(); i++) {
            char c = output.charAt(i);
            if (c == '*') {
                ast++;
                continue;
            }

            if (!(inputMap.containsKey(c))) {
                System.out.println("N");
                System.exit(0);
            }
            else {
                inputMap.put(c, inputMap.get(c) - 1);
            }
        }

        int count = 0;

        for (char key : inputMap.keySet()) {
            int n = inputMap.get(key);
            if (n < 0) {
                System.out.println("N");
                System.exit(0);
            }

            if (n > 0) {
                count += n;
            }
        }

        System.out.println(ast == count ? "A" : "N");

    }

}
