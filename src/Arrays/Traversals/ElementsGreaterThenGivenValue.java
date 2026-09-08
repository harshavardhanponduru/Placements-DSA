package Arrays.Traversals;

import java.util.Scanner;

public class ElementsGreaterThenGivenValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value to compare: ");
        int value = sc.nextInt();
        System.out.println("Elements greater than " + value + " are: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] > value) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
