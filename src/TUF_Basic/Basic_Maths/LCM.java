package TUF_Basic.Basic_Maths;

public class LCM {

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        LCM obj = new LCM();
        int a = 12; // Example number
        int b = 18; // Example number
        int result = obj.lcm(a, b);
        System.out.println("LCM of " + a + " and " + b + " is: " + result);
    }
}

// Output: LCM of 12 and 18 is: 36