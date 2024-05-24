package Easy;

// 1. Two Sum

// Runtime: 44ms, 39.72%
// Memory: 44.13 MB, 98.47%

public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] arr = {i, j};
                    return arr;
                }
            }
        }

        return new int[2];

    }

}
