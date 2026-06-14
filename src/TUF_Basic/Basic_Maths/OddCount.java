package TUF_Basic.Basic_Maths;

public class OddCount {
    public int countOddDigit(int n) {

        int oddcount = 0;

        do {
            int rem = n % 10;
            if (rem % 2 != 0) {
                oddcount++;
            }
            n /= 10;
        } while (n != 0);

        return oddcount;
    }

    public static void main(String[] args) {
        OddCount c = new OddCount();
        System.out.println(c.countOddDigit(12345));
    }
}

// Output:3
