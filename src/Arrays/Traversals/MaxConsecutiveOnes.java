package Arrays.Traversals;

public class MaxConsecutiveOnes 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) 
    {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = maxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        System.out.println("The maximum number of consecutive 1s is: " + result);
    }
}