package TUF_Basic.Language_Basics;

public class First_Last_Sum 
{
    public int sumOfFirstAndLast(int[] nums) {
        int size = nums.length - 1;
        int last = nums[size];
        int first = nums[0];
        return first + last;
    }

    public static void main(String[] args) 
    {
        First_Last_Sum obj = new First_Last_Sum();
        int[] nums = {1, 2, 3, 4, 5};
        int result = obj.sumOfFirstAndLast(nums);
        System.out.println("Sum of first and last elements: " + result); // Expected: 6
    }
}
