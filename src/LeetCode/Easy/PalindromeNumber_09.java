package LeetCode.Easy;

public class PalindromeNumber_09 {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int original = x;

        while (x > 0) {
            int remainder = x % 10;
            reversed = reversed * 10 + remainder;
            x = x / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        PalindromeNumber_09 obj = new PalindromeNumber_09();
        int x = 121;
        boolean result = obj.isPalindrome(x);
        if (result) {
            System.out.println(x + " is a palindrome number.");
        } else {
            System.out.println(x + " is not a palindrome number.");
        }
    }
}

// 121 is a palindrome number.