package CCC2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class S3SearchingForStrings {

    /* 
     * Sliding window + dynamic frequency mapping
     * 
     * Update the HashMap dynamically
     * Use int[26] (only 26 letters in alphabet no need to use HashMap)
     */

    static int[] mapLetters(String s, int length) {

        int[] map = new int[26];
        char[] c = s.toCharArray();

        for (int i = 0; i < 26; i++) {
            map[i] = 0;
        }

        for (int i = 0; i < length; i++) {
            map[((int)c[i]) - 97] += 1;
        }

        return map;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        String H = br.readLine();

        int nLength = N.length();
        int hLength = H.length();

        if (nLength > hLength) {
            System.out.println(0);
            System.exit(0);
        }

        int[] needleMap = mapLetters(N, nLength);
        HashSet<String> list = new HashSet<>();

        int[] temp = mapLetters(H.substring(0, nLength), nLength);

        for (int i = 0; i <= hLength - nLength; i++) {

            if (Arrays.equals(needleMap, temp)) {
                // System.out.println(substring);
                list.add(H.substring(i, i + nLength));
            }

            if (i + nLength < hLength) {
                temp[((int)H.charAt(i)) - 97] -= 1;
                temp[((int)H.charAt(i + nLength)) - 97] += 1;
            }
        }

        System.out.println(list.size());

    }

}
