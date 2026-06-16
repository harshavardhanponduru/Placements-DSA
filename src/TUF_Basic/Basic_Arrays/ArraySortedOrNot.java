package TUF_Basic.Basic_Arrays;

public class ArraySortedOrNot {

    public boolean isSorted(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArraySortedOrNot obj = new ArraySortedOrNot();
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        boolean result = obj.isSorted(arr, n);
        if (result) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
