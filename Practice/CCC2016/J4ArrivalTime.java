package CCC2016;

import java.io.*;

public class J4ArrivalTime {

    static String convertMinToClock(int m) {
        int hours = m / 60;
        int minutes = m % 60;
        String sHours = Integer.toString(hours);
        if (sHours.length() == 1) {
            sHours = "0" + sHours;
        }
        String sMinutes = Integer.toString(minutes);
        if (sMinutes.length() == 1) {
            sMinutes = "0" + sMinutes;
        }

        return sHours + ":" + sMinutes;
    }

    static int convertClockToMin(String s) {
        int h = (Integer.parseInt(Character.toString(s.charAt(0))) * 10) + 
            Integer.parseInt(Character.toString(s.charAt(1)));
        int m = (Integer.parseInt(Character.toString(s.charAt(2))) * 10) + 
            Integer.parseInt(Character.toString(s.charAt(3)));

        int minutes = h * 60 + m;
        return minutes;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().replace(":", "");
        int start = convertClockToMin(input);

        int startMorningRush = 420;
        int endMorningRush = 600;
        int startAftRush = 900;
        int endAftRush = 1140;
        int commuteTime = 120;

        while (commuteTime > 0) {
            System.out.println(commuteTime);
            int speed = 2;
            if (start >= startMorningRush && start < endMorningRush) {
                speed = 1;
            }
            else if (start >= startAftRush && start < endAftRush) {
                speed = 1;
            }
            else {
                speed = 2;
            }
            start += 2;
            commuteTime -= speed;
        }

        System.out.println(convertMinToClock(start));
    }

}
