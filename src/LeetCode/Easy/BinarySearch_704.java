package LeetCode.Easy;

public class BinarySearch_704 {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public int binarySearch(int arr[], int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = low + ((high - low) / 2);
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, high, target);
        } else {
            return binarySearch(arr, low, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        BinarySearch_704 solution = new BinarySearch_704();
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        int result = solution.search(nums, target);
        System.out.println("Index of target " + target + ": " + result);
    }
}
