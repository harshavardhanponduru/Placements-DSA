package TUF_Basic.Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n = hv.nextInt();
        pattern1(n);
        hv.close();
    }
}

// Output:

// *****
// *****
// *****
// *****
// *****