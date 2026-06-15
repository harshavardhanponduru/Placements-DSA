package TUF_Basic.Basic_Maths;

// A perfect number is a positive integer 
// that is equal to the sum of its proper positive divisors, 
// excluding the number itself. 
// For example, 6 is a perfect number because 
// its divisors are 1, 2, and 3, and 1 + 2 + 3 = 6.

public class Perfect_Number {

    public boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Perfect_Number obj = new Perfect_Number();
        int number = 28; // Example number
        if (obj.isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}

// Output: 28 is a perfect number.
