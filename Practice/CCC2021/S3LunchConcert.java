package CCC2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3LunchConcert {

    static int calculateTime(int c, int[] p, int[] w, int[] d, int N) {
        int time = 0;
        for (int i = 0; i < N; i++) {
            int distance = Math.abs(c - p[i]) - d[i];

            if (distance > 0) {
                time += distance * w[i];
            }
        }

        return time;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] positions = new int[N];
        int[] speeds = new int[N];
        int[] distances = new int[N];

        int high = Integer.MAX_VALUE;
        int low = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int position = Integer.parseInt(str.nextToken());
            positions[i] = position;
            low = Math.min(low, position);
            high = Math.max(high, position);

            speeds[i] = Integer.parseInt(str.nextToken());
            distances[i] = Integer.parseInt(str.nextToken());
        }

        int mid = 0;
        long s = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            s = calculateTime(mid, positions, speeds, distances, N);

            long left = calculateTime(mid - 1, positions, speeds, distances, N);
            long right = calculateTime(mid + 1, positions, speeds, distances, N);

            if (s <= left && s <= right) {
                System.out.println(s);
                System.exit(0);
            }

            if (s < right) {
                high = mid - 1;
            }
            else if(s < left) {
                low = mid + 1;
            }
        }

    }    

}
