package TCS_NQT.Numbers;

import java.util.Scanner;
public class SumRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();
        
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        
        System.out.println("The sum of numbers from " + start + " to " + end + " is: " + sum);

        sc.close();
    }
}
