package TUF_Basic.Basic_Arrays;

public class Reverse_Array {

    public void reverse(int arr[], int n) {
        int start = 0;
        int end = n - 1;

        while (start < end) {
            // Swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Reverse_Array obj = new Reverse_Array();
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        obj.reverse(arr, n);
        System.out.print("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
