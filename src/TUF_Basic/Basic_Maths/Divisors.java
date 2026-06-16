package TUF_Basic.Basic_Maths;

public class Divisors {

    public int[] divisors(int n) {
        int[] divisors = new int[n];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors[count++] = i;
            }
        }
        int[] result = new int[count];
        System.arraycopy(divisors, 0, result, 0, count);
        return result;
    }

    public static void main(String[] args) {
        Divisors obj = new Divisors();
        int n = 12; // Example number
        int[] result = obj.divisors(n);
        System.out.print("Divisors of " + n + " are: ");
        for (int divisor : result) {
            System.out.print(divisor + " ");
        }
        System.out.println(); // Print a newline at the end
    }
}

// Output: Divisors of 12 are: 1 2 3 4 6 12