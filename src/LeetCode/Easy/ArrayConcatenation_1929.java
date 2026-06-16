package LeetCode.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcatenation_1929 {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = nums[i];
        }
        return ans;
    }

    static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        int n = hv.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = hv.nextInt();
        System.out.println(Arrays.toString(getConcatenation(nums)));

        hv.close();
    }
}
