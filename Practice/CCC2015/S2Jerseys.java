package CCC2015;

import java.util.*;
import java.io.*;

public class S2Jerseys {
    
    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('S', 0);
        map.put('M', 0);
        map.put('L', 0);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int J = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());

        for (int i = 0; i < J; i++) {
            char c = br.readLine().charAt(0);
            map.put(c, map.get(c) + 1);
        }
    }

}
