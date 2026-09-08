package Arrays.Traversals;

import java.util.Scanner;

public class FirstNonRepeatingElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int firstNonRepeatingIndex = -1;
        for (int i = 0; i < n; i++) {
            boolean isRepeating = false;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                firstNonRepeatingIndex = i;
                break;
            }
        }
        if (firstNonRepeatingIndex != -1) {
            System.out.println("The first non-repeating element is: " + arr[firstNonRepeatingIndex]);
        } else {
            System.out.println("No non-repeating elements found.");
        }
        sc.close();
    }
}
