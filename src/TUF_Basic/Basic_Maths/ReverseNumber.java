package TUF_Basic.Basic_Maths;

public class ReverseNumber {
    public int reverseNumber(int n) {

        int num = 0;

        while (n != 0) {
            int rem = n % 10;
            num = rem + (num * 10);
            n /= 10;
        }

        return num;
    }

    public static void main(String[] args) {
        ReverseNumber r = new ReverseNumber();
        System.out.println(r.reverseNumber(12345));
    }
}

// Output:54321
