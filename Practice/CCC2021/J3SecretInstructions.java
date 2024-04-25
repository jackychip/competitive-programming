package CCC2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class J3SecretInstructions {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        ArrayList<String> list = new ArrayList<>();

        String direction = "";

        while (!line.equals("99999")) {
            int sum = Integer.parseInt(line.substring(0, 1)) + Integer.parseInt(line.substring(1, 2));

            if (sum != 0) {
                if (sum % 2 == 0) {
                    direction = "right";
                }
                else {
                    direction = "left";
                }
            }

            list.add(direction + " " + line.substring(2, 5));

            line = br.readLine();
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
    
}
