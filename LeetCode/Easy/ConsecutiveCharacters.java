package Easy;

// 1446. Consecutive Characters

// Runtime: 1ms, 100%
// Memory: 41.98 MB, 48%

public class ConsecutiveCharacters {

    public int maxPower(String s) {

        int count = 1;
        int index = 0;
        int max = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(index) == s.charAt(i)) {
                count++;
            }
            else {
                index = i;
                count = 1;
            }
            max = Math.max(max, count);
        }

        return max;

    }

}
