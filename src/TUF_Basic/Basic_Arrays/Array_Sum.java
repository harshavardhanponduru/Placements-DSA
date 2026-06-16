package TUF_Basic.Basic_Arrays;

public class Array_Sum {
    public int sum(int arr[], int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Array_Sum obj = new Array_Sum();
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int result = obj.sum(arr, n);
        System.out.println("Sum of array elements: " + result);
    }
}

// Sum of array elements: 15