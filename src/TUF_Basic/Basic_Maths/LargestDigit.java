package TUF_Basic.Basic_Maths;

public class LargestDigit {

    public int largestDigit(int n) {
        int largestDigit = 0;

        while (n > 0) {
            int lastDigit = n % 10;

            if (lastDigit > largestDigit) {
                largestDigit = lastDigit;
            }

            n = n / 10;
        }

        return largestDigit;
    }

    public static void main(String[] args) {
        LargestDigit l = new LargestDigit();
        System.out.println(l.largestDigit(12345));
    }
}

// Output:5