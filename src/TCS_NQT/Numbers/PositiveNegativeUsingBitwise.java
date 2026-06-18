package TCS_NQT.Numbers;

public class PositiveNegativeUsingBitwise {

    public static void main(String[] args) {
        int number = -5; // Example number
        if ((number & Integer.MIN_VALUE) == 0) {
            System.out.println("The number " + number + " is positive.");
        } else {
            System.out.println("The number " + number + " is negative.");
        }
    }
}
