package TUF_Basic.Basic_Maths;

// An armstrong number is a number which is equal 
// to the sum of the digits of the number, 
// raised to the power of the number of digits.

public class Armstrong_Number {

    public boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Armstrong_Number obj = new Armstrong_Number();
        int number = 153; // Example number
        if (obj.isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}

// Output: 153 is an Armstrong number.