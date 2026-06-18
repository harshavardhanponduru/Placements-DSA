package TCS_NQT.Numbers;

public class MaxMinDigit {

    public static void main(String[] args) {
        int number = 12345; // Example number
        int maxDigit = findMaxDigit(number);
        int minDigit = findMinDigit(number);
        System.out.println("The maximum digit in " + number + " is: " + maxDigit);
        System.out.println("The minimum digit in " + number + " is: " + minDigit);
    }

    public static int findMaxDigit(int number) {
        int max = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            number /= 10;
        }
        return max;
    }

    public static int findMinDigit(int number) {
        int min = 9;
        while (number != 0) {
            int digit = number % 10;
            if (digit < min) {
                min = digit;
            }
            number /= 10;
        }
        return min;
    }
}
