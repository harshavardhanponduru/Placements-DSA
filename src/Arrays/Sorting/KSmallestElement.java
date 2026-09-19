package Arrays.Sorting;

public class KSmallestElement {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int kthSmallest = findKthSmallest(arr, k);
        System.out.println(k + "rd smallest element is: " + kthSmallest);
    }

    private static int findKthSmallest(int[] arr, int k) {
        java.util.Arrays.sort(arr);
        return arr[k - 1];
    }

}
