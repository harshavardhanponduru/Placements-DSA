package TCS_NQT.Numbers;

public class PrimeFactors {

    public static void main(String[] args) {
        int number = 60;
        System.out.println("The prime factors of " + number + " are:");
        primeFactors(number);
    }

    public static void primeFactors(int number) {
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
    }
}
