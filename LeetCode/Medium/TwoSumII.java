package Medium;

// 167. Two Sum II - Input Array Is Sorted

// Runtime: 2ms, 91.94%
// Memory: 47.26 MB, 22.2%

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length -1;

        while (left < right) {
            int l = numbers[left];
            int r = numbers[right];
            if (l + r == target) {
                int[] arr = {left + 1, right + 1};
                return arr;
            }
            else if (l + r < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[2];

    }
}
