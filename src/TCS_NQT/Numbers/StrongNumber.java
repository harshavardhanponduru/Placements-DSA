package TCS_NQT.Numbers;

public class StrongNumber {

    public static void main(String[] args) {
        int number = 145;
        if (isStrongNumber(number)) {
            System.out.println("The number " + number + " is a strong number.");
        } else {
            System.out.println("The number " + number + " is not a strong number.");
        }
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

// A strong number is a number whose sum of the factorial of its digits is equal to the number itself. For example, 145 is a strong number because 1! + 4! + 5! = 145.