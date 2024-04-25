package CCC2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class S2GoodGroups {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        HashMap<String, ArrayList<String>> same = new HashMap<>();

        for (int i = 0; i < X; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            String one = str.nextToken();
            String two = str.nextToken();

            if (same.containsKey(one)) {
                same.get(one).add(two);
            }
            else {
                ArrayList<String> list = new ArrayList<>();
                list.add(two);
                same.put(one, list);
            }
        }

        int Y = Integer.parseInt(br.readLine());

        HashMap<String, ArrayList<String>> diff = new HashMap<>();

        for (int i = 0; i < Y; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            String one = str.nextToken();
            String two = str.nextToken();

            if (diff.containsKey(one)) {
                diff.get(one).add(two);
            }
            else {
                ArrayList<String> list = new ArrayList<>();
                list.add(two);
                diff.put(one, list);
            }
        }

        int G = Integer.parseInt(br.readLine());

        String[][] names = new String[G][3];

        for (int i = 0; i < G; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            names[i][0] = str.nextToken();
            names[i][1] = str.nextToken();
            names[i][2] = str.nextToken();
        }

        //solve
        int count = 0;    

        for (int i = 0; i < G; i++) {
            for (int j = 0; j < 3; j++) {
                //diff
                for (int k = 0; k < 3; k++) {
                    if (diff.get(names[i][j]) != null && diff.get(names[i][j]).contains(names[i][k])) {
                        count++;
                    }
                }
            }

            //same
            for (int j = 0; j < 3; j++) {
                if (same.get(names[i][j]) != null) {
                    for (String s : same.get(names[i][j])) {
                        boolean found = false;
                        for (int k = 0; k < 3; k++) {
                            if (names[i][k].equals(s)) {
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);

    }

}