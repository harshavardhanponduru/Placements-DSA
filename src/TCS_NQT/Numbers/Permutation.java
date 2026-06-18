package TCS_NQT.Numbers;

// Permutations in which N people can occupy R seats in a classroom
public class Permutation {

    public static void main(String[] args) {
        int n = 5; // Total number of people
        int r = 3; // Number of seats

        int permutation = calculatePermutation(n, r);
        System.out.println("The number of permutations of " + n + " people occupying " + r + " seats is: " + permutation);
    }

    // Method to calculate permutations
    public static int calculatePermutation(int n, int r) {
        if (r > n) {
            return 0; // Not enough people to fill the seats        
        }
        int numerator = factorial(n);
        int denominator = factorial(n - r);
        return numerator / denominator;
    }

    // Method to calculate factorial
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
