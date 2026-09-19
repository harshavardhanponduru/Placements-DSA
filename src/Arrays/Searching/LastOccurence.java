package Arrays.Searching;

import java.util.Scanner;

public class LastOccurence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to find last occurrence for: ");
        int target = scanner.nextInt();
        int index = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("The last occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println(target + " is not present in the array.");
        }
         scanner.close();
    }
}