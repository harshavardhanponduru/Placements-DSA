package TCS_NQT.Numbers;

public class Sum {

    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}
