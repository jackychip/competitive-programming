package CCC2017;

import java.util.*;

public class J4FavouriteTimes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        sc.nextLine();

        int count = 0;

        for (int i = 1; i <= D; i++) {
            int hours = 12;
            int minutes = 0;

            hours = (12 + i / 60) % 12;
            if (hours == 0) {
                hours = 12;
            }

            minutes += i % 60;

            int totalNum = hours * 100 + minutes; //1684

            if (totalNum > 999) {
                int d1 = (totalNum % 10) - (totalNum / 10) % 10;
                totalNum /= 10;
                int d2 = (totalNum % 10) - (totalNum / 10) % 10;
                totalNum /= 10;
                int d3 = (totalNum % 10) - (totalNum / 10) % 10;

                if (d1 == d2 && d2 == d3) {
                    count++;
                }
            }
            else {
                int d1 = (totalNum % 10) - (totalNum / 10) % 10;
                totalNum /= 10;
                int d2 = (totalNum % 10) - (totalNum / 10) % 10;

                if (d1 == d2) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

}