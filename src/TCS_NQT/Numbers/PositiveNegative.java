package TCS_NQT.Numbers;

import java.util.Scanner;
public class PositiveNegative {

    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        int number = hv.nextInt();
        if (number > 0)
            System.out.println("The number " + number + " is positive.");
        else if (number < 0)
            System.out.println("The number " + number + " is negative.");
        else
            System.out.println("The number is zero.");
        hv.close();
    }
}
