package TUF_Basic.Basic_Maths;

public class GCD {

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        GCD obj = new GCD();
        int a = 48; // Example number
        int b = 18; // Example number
        int result = obj.gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result);
    }
}

// Output: GCD of 48 and 18 is: 6
