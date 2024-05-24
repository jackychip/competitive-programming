package Medium;

// 650. 2 Keys Keyboard

// Runtime: 0ms, 100%
// Memory: 39.86 MB, 97.27%

public class TwoKeysKeyboard {

    public int minSteps(int n) {
        if (n == 1) {
            return 0;
        }

        if (n < 4) {
            return n;
        }

        int result = 0;
        
        while (n != 1) {
            int factor = 1;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    factor = i;
                }
            }

            result += n / factor;
            n = factor;
        }

        return result;
    }
    
}
