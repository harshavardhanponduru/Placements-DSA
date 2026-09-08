package Arrays.Traversals;

import java.util.Scanner;

public class SumOfElementsAtEvenAndOddIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evenIndexSum = 0;
        int oddIndexSum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenIndexSum += arr[i];
            } else {
                oddIndexSum += arr[i];
            }
        }
        System.out.println("The sum of elements at even indices is: " + evenIndexSum);
        System.out.println("The sum of elements at odd indices is: " + oddIndexSum);
        sc.close();
    }
}
