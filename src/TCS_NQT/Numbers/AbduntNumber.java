package TCS_NQT.Numbers;

public class AbduntNumber {

    public static void main(String[] args) {
        int number = 12;
        int sumOfProperDivisors = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfProperDivisors += i;
            }
        }

        if (sumOfProperDivisors > number) {
            System.out.println("The number " + number + " is an abundant number.");
        } else {
            System.out.println("The number " + number + " is not an abundant number.");
        }
    }
}

// An abundant number is a number for which the sum of its proper divisors is greater than the number itself. For example, 12 is an abundant number because its proper divisors are 1, 2, 3, 4, and 6, and their sum (1 + 2 + 3 + 4 + 6 = 16) is greater than 12.