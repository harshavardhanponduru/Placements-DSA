package TCS_NQT.Numbers;
import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        int a = hv.nextInt();
        int b = hv.nextInt();
        int c = hv.nextInt();
        if (a > b && a > c)
            System.out.println("The greatest number is: " + a);
        else if (b > a && b > c)
            System.out.println("The greatest number is: " + b);
        else if (c > a && c > b)
            System.out.println("The greatest number is: " + c);
        else
            System.out.println("There is a tie among the numbers.");
        hv.close();
    }
}
