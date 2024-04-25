package CCC2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class S3NailedIt {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] wood = new int[N];

        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            wood[i] = Integer.parseInt(str.nextToken());
        }

        HashMap<Integer, Integer> lengths = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> usedIndexes = new HashMap<>();

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                int height = wood[i] + wood[j];

                if (lengths.containsKey(height)) {
                    if (usedIndexes.get(height).contains(i) || usedIndexes.get(height).contains(j)) {
                        continue;
                    }
                    lengths.put(height, lengths.get(height) + 1);
                }
                else {  
                    lengths.put(height, 1);
                }

                if (usedIndexes.containsKey(height)) {
                    usedIndexes.get(height).add(i);
                    usedIndexes.get(height).add(j);
                }
                else {
                    usedIndexes.put(height, new ArrayList<>());
                    usedIndexes.get(height).add(i);
                    usedIndexes.get(height).add(j);
                }
            }
        }

        //find max length
        int diffHeights = 0;
        int maxLength = 0;
        for (int height : lengths.keySet()) {
            if (lengths.get(height) > maxLength) {
                diffHeights = 1;
                maxLength = lengths.get(height);
            }
            else if (lengths.get(height) == maxLength) {
                diffHeights++;
            }
        }

        System.out.println(maxLength + " " + diffHeights);
        
    }
}
