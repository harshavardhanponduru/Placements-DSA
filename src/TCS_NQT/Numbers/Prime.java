package TCS_NQT.Numbers;

public class Prime {

    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = isPrime(number);
        System.out.println("Is the number " + number + " a prime number? " + isPrime);
    }

    public static boolean isPrime(int number) {
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
}
