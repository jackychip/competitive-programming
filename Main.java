import java.io.*;
import java.util.*;

public class Main {
    
    /* 
     * Sliding window + frequency mapping using HashMaps
     */

     static HashMap<Character, Integer> mapLetters(String s, int length) {

        HashMap<Character, Integer> map = new HashMap<>();
        char[] c = s.toCharArray();

        for (int i = 0; i < length; i++) {
            if (map.containsKey(c[i])) {
                map.put(c[i], map.get(c[i]) + 1);
            }
            else {
                map.put(c[i], 1);
            }
        }

        return map;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        String H = br.readLine();

        int nLength = N.length();
        int hLength = H.length();

        HashMap<Character, Integer> needleMap = mapLetters(N, nLength);
        HashSet<String> list = new HashSet<>();
        int count = 0;

        for (int i = 0; i <= hLength - nLength; i++) {
            String substring = H.substring(i, i + nLength);
            HashMap<Character, Integer> subMap = mapLetters(substring, nLength);
            if (needleMap.equals(subMap) && !list.contains(substring)) {
                list.add(substring);
                count++;
            }
        }

        System.out.println(count);

    }
}
