package TCS_NQT.Numbers;

public class AutomorphicNumber {
    public static void main(String[] args) {
        int number = 25;
        if (isAutomorphic(number)) {
            System.out.println("The number " + number + " is an automorphic number.");
        } else {
            System.out.println("The number " + number + " is not an automorphic number.");
        }
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = Integer.toString(number);
        String squareStr = Integer.toString(square);
        return squareStr.endsWith(numStr);
    }
}

// An automorphic number is a number whose square ends with the same digits as the number itself. For example, 25 is an automorphic number because 25^2 = 625, which ends with 25.