package TCS_NQT.Numbers;

public class Palindrome_Range {

    public static void main(String[] args) {
        int start = 100;
        int end = 200;
        System.out.println("Palindrome numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
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
