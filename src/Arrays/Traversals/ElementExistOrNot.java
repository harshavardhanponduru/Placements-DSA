package Arrays.Traversals;

import java.util.Scanner;
public class ElementExistOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to check its existence: ");
        int x = sc.nextInt();
        boolean exists = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                exists = true;
                break;
            }
        }
        if (exists) {
            System.out.println("The element " + x + " exists in the array.");
        } else {
            System.out.println("The element " + x + " does not exist in the array.");
        }
        sc.close();
    }
}
