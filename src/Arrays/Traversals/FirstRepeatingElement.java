package Arrays.Traversals;

import java.util.Scanner;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int firstRepeatingIndex = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    firstRepeatingIndex = i;
                    break;
                }
            }
            if (firstRepeatingIndex != -1) {
                break;
            }
        }
        if (firstRepeatingIndex != -1) {
            System.out.println("The first repeating element is: " + arr[firstRepeatingIndex]);
        } else {
            System.out.println("No repeating elements found.");
        }
        sc.close();
    }
}
