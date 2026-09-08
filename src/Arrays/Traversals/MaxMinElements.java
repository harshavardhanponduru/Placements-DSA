package Arrays.Traversals;
import java.util.Scanner;
import java.util.Arrays;

public class MaxMinElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("The maximum element in the array is: " + max);
        System.out.println("The minimum element in the array is: " + min);
        sc.close();
    }
}
