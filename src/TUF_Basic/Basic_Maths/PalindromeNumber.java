package TUF_Basic.Basic_Maths;

public class PalindromeNumber {
    public boolean isPalindrome(int n) {
        int check = n;
        int num = 0;

        while (n != 0) {
            int rem = n % 10;
            num = rem + (num * 10);
            n /= 10;
        }

        return num == check;
    }

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(12321));
    }
}

// Output:true