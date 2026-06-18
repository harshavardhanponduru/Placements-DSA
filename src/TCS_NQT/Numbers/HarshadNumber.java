package TCS_NQT.Numbers;

public class HarshadNumber {

    public static void main(String[] args) {
        int number = 18; // Example number
        if (isHarshadNumber(number)) {
            System.out.println("The number " + number + " is a Harshad number.");
        } else {
            System.out.println("The number " + number + " is not a Harshad number.");
        }
    }

    public static boolean isHarshadNumber(int number) {
        int sumOfDigits = 0;
        int temp = number;
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        return number % sumOfDigits == 0;
    }
}

// A Harshad number (or Niven number) is an integer that is divisible by the sum of its digits. For example, 18 is a Harshad number because the sum of its digits (1 + 8 = 9) divides 18 evenly (18 % 9 == 0).