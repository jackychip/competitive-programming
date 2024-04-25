package CPDSA.BasicsOfArrayStringGreedyBitManipulation.SumOfDigits;

public class SumOfDigits {
    
    static int getSum(int num) {
        
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 687;

        System.out.println(getSum(n));
    }

}
