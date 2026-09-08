package Arrays.Traversals;

import java.util.Scanner;
import java.util.Arrays;

public class MaxMinDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[n - 1];
        int min = arr[0];
        int difference = max - min;
        System.out.println("The maximum element is: " + max);
        System.out.println("The minimum element is: " + min);
        System.out.println("The difference between the maximum and minimum elements is: " + difference);
        sc.close();
    }
}
