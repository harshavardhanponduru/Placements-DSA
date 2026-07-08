package TCS_NQT.Arrays;
class AverageOfArray {
    public double averageOfArray(int[] nums) {
        // Your code goes here
        int l = nums.length;
        double sum = 0;
        for (int i = 0; i < l; i++) {
            sum += nums[i];
        }

        double average = sum / l;
        return average;
    }

    public static void main(String[] args) {
        AverageOfArray avg = new AverageOfArray();
        int[] nums = { 1, 2, 3, 4, 5 };
        double result = avg.averageOfArray(nums);
        System.out.println("Average of the array: " + result);
    }
}

// Output: Average of the array: 3.0