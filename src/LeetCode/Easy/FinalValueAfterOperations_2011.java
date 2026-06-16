package LeetCode.Easy;

import java.util.Scanner;

public class FinalValueAfterOperations_2011 {
    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String operation : operations) {
            if (operation.equals("--X") || operation.equals("X--"))
                X -= 1;
            if (operation.equals("++X") || operation.equals("X++"))
                X += 1;
        }
        return X;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of operations: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] operations = new String[n];
        System.out.println("Enter the operations (one per line):");
        for (int i = 0; i < n; i++) {
            operations[i] = scanner.nextLine();
        }

        int result = finalValueAfterOperations(operations);
        System.out.println("Final value of X after operations: " + result);

        scanner.close();
    }
}
