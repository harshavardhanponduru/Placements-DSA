package TCS_NQT.Numbers;

import java.util.Scanner;
public class GreatestOfTwo {

    public static void main(String[] args)
    {
        Scanner hv = new Scanner(System.in);
        int a = hv.nextInt();
        int b = hv.nextInt();
        if (a > b)
            System.out.println("The greatest number is: " + a);
        else if (b > a)
            System.out.println("The greatest number is: " + b);
        else
            System.out.println("Both numbers are equal.");
        hv.close();
    }
}
