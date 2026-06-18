package TCS_NQT.Numbers;

public class Palindrome {

    public static void main(String[] args) {
        int number = 12321;
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is the number " + number + " a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }
}
