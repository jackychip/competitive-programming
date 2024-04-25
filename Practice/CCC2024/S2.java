import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class S2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(str.nextToken());
        int N = Integer.parseInt(str.nextToken());

        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            HashMap<Character, Integer> freq = new HashMap<>();

            for (int j = 0; j < N; j++) {
                char c = line.charAt(j);
                if (freq.containsKey(c)) {
                    freq.put(c, freq.get(c) + 1);
                }
                else {
                    freq.put(c, 1);
                }
            }

            boolean isHeavy = freq.get(line.charAt(0)) == 1;
            String output = "T";

            for (int j = 0; j < N; j++) {
                char c = line.charAt(j);
                if ((freq.get(c) > 1 && isHeavy) || (freq.get(c) == 1 && !isHeavy)) {
                    output = "F";
                    break;
                }
                isHeavy = !isHeavy;
            }

            System.out.println(output);
        }

    }
    
}
