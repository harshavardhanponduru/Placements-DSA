package Arrays.Searching;

import java.util.Scanner;

public class CountOccurences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to count occurrences for: ");
        int target = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println("The element " + target + " occurs " + count + " times in the array.");
         scanner.close();
    }
}
