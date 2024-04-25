package Kattis;

import java.util.*;

public class Digits {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Long> numbers = new ArrayList<>();

        String currentString = "";
        while (true) {
            currentString = sc.nextLine();
            if (currentString.equals("END")) {
                break;
            }

            numbers.add(Long.parseLong(currentString));
        }

        for (long number : numbers) {
            if (number == 1) {
                System.out.println("1");
                continue;
            }

            int length = (int) Math.log10(number) + 1;

            if (length > 9) {
                System.out.println("4");
            }
            else if (length == 1) {
                System.out.println("2");
            }
            else {
                System.out.println("3");
            }
        }

    }

}
