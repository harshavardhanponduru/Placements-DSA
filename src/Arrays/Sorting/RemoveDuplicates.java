package Arrays.Sorting;
import java.util.Scanner;
import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
         scanner.close();
    }

    private static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return new int[0];
        }
        Arrays.sort(arr);
        int uniqueCount = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }
        int[] uniqueArr = new int[uniqueCount];
        uniqueArr[0] = arr[0];
        int index = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueArr[index++] = arr[i];
            }
        }
        return uniqueArr;
    }
}
