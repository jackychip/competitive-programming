package Medium;

// 7. Reverse Integer

// Runtime: 1ms, 80.15%
// Memory: 40.78 MB, 50.63%

public class ReverseInteger {

    public int reverse(int x) {
        int length = 0;
        int copy = x;
        while (copy != 0) {
            copy /= 10;
            length++;
        }

        long result = 0;

        copy = x;
        while (length > 0) {
            int num = copy % 10;
            result += num * Math.pow(10, length - 1);
            copy /= 10;
            length--;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result;
    }

}
