package Arrays.Traversals;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargestElement {
    
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
        System.out.println("The third largest element is: " + arr[n - 3]);
        sc.close();
    }
}
