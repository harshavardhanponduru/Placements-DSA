package TUF_Basic.Basic_Maths;

public class Prime_Number {

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Prime_Number obj = new Prime_Number();
        int number = 17; // Example number
        if (obj.isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

// Output: 17 is a prime number.
