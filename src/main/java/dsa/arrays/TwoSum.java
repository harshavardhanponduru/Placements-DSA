package dsa.arrays;

/**
 * Problem: Two Sum
 * Platform: LeetCode #1
 * Difficulty: Easy
 * Approach: HashMap — store each number's index, check if complement exists
 * Time : O(n)
 * Space: O(n)
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    static void main() {
        TwoSum sol = new TwoSum();
        int[] result = sol.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(result[0] + ", " + result[1]); // Expected: 0, 1
    }
}