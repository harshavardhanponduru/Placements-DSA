package TUF_Basic.Basic_Hashing;

public class MostFrequentElement {

    public int mostFrequentElement(int[] nums) {

        int maxCount = 0;
        int mostFrequent = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = nums[i];
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        MostFrequentElement mfe = new MostFrequentElement();
        int[] nums = { 1, 3, 2, 1, 4, 1, 3 };
        int result = mfe.mostFrequentElement(nums);
        System.out.println("Most frequent element: " + result);
    }
}
