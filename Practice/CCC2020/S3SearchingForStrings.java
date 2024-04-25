package CCC2020;
import java.io.*;
import java.util.*;

public class S3SearchingForStrings {

    static boolean isPerm(String og, String s) {

        HashMap<Character, Integer> freqS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freqS.containsKey(c)) {
                freqS.put(c, freqS.get(c) + 1);
            }
            else {
                freqS.put(c, 1);
            }
        }

        HashMap<Character, Integer> freqO = new HashMap<>();
        for (int i = 0; i < og.length(); i++) {
            char c = og.charAt(i);
            if (freqO.containsKey(c)) {
                freqO.put(c, freqO.get(c) + 1);
            }
            else {
                freqO.put(c, 1);
            }
        }

        for (char c : freqO.keySet()) {
            if (!freqS.containsKey(c)) {
                return false;
            }

            if (freqS.get(c) != freqO.get(c)) {
                return false;
            }

        }

        return true;
        
    }
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        String H = br.readLine();

        int count = 0;

        ArrayList<String> perms = new ArrayList<>();

        for (int i = 0; i <= H.length() - N.length(); ++i) {

            String sub = H.substring(i, i + N.length());

            if (isPerm(N, sub)) {
                if (!perms.contains(sub)) {
                    count++;
                    perms.add(sub);
                }
            }
        }


        System.out.println(count);

    }

}

