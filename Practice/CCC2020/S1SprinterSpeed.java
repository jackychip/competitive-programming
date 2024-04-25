package CCC2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class S1SprinterSpeed {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        int[] keys = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int key = Integer.parseInt(str.nextToken());
            keys[i] = key;
            map.put(key, Integer.parseInt(str.nextToken()));
        }

        Arrays.sort(keys);

        double speed = Integer.MIN_VALUE;

        for (int i = 1; i < N; i++) {
            double s = (double)Math.abs(map.get(keys[i]) - map.get(keys[i - 1])) / (keys[i] - keys[i - 1]);
            if (s > speed) {
                speed = s;
            }
        }

        System.out.println(speed);

    }

}
