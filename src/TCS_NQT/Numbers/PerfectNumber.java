package TCS_NQT.Numbers;

public class PerfectNumber {

    public static void main(String[] args) {
        int number = 28;
        boolean isPerfect = isPerfect(number);
        System.out.println("Is the number " + number + " a perfect number? " + isPerfect);
    }

    public static boolean isPerfect(int number) {
        if (number <= 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
