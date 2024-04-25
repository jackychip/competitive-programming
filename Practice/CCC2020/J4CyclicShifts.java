package CCC2020;

import java.util.*;
import java.io.*;

public class J4CyclicShifts {

    static void findAllShifts(ArrayList<String> list, String shift) {
        String og = shift;
        list.add(shift);
        char end = shift.charAt(shift.length() - 1);
        shift = end + shift.substring(0, shift.length() - 1);

        while (!(shift.equals(og))) {
            list.add(shift);
            end = shift.charAt(shift.length() - 1);
            shift = end + shift.substring(0, shift.length() - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        String shift = br.readLine();

        ArrayList<String> allShifts = new ArrayList<>();
        findAllShifts(allShifts, shift);

        for (int i = 0; i < text.length() - shift.length() + 1; i++) {
            if (allShifts.contains(text.substring(i, i + shift.length()))) {
                System.out.println("yes");
                System.exit(0);
            }
        }

        System.out.println("no");
    }

}
