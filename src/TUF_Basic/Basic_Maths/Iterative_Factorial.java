package TUF_Basic.Basic_Maths;

public class Iterative_Factorial {
    public int factorial(int n) {
        int factorial = 1;

        if (n < 0) {
            return -1;
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i; // Multiplies: 1 * 2 * 3 * 4 * 5
            }
        }
        return factorial;
    }

    public static void main(String[] args) {
        Iterative_Factorial obj = new Iterative_Factorial();
        int result = obj.factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }
}

//Output: Factorial of 5 is: 120