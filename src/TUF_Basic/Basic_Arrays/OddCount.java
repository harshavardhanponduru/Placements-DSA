package TUF_Basic.Basic_Arrays;

public class OddCount {
    public int countOdd(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        OddCount obj = new OddCount();
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int result = obj.countOdd(arr, n);
        System.out.println("Count of odd numbers in the array: " + result);
    }
}

// Count of odd numbers in the array: 3