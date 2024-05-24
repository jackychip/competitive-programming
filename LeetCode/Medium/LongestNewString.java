package Medium;

// 2745. Construct the Longest New String

// Runtime: 1ms, 100%
// Memory: 41.18 MB, 67.95%

public class LongestNewString {

    public int longestString(int x, int y, int z) {
        int result = 0;

        if (x < y) {
            result = x * 2 + (x + 1) * 2;
        }
        else if (y < x) {
            result = y * 2 + (y + 1) * 2;
        }
        else {
            result = x * 4;
        }

        return result + z * 2;
    }

}
