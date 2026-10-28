package Arrays.Traversals;

public class RotateArrayByOneToLeft
{
    public void rotateArrayByOne(int[] nums) {
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
    }

    public static void main(String[] args) {
        RotateArrayByOneToLeft rotateArray = new RotateArrayByOneToLeft();
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        rotateArray.rotateArrayByOne(nums);

        System.out.println("Array after rotating by one to the left: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}