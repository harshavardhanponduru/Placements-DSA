package TCS_NQT.Numbers;

public class ArithmeticProgression {

    public static void main(String[] args) {
        int firstTerm = 2;
        int commonDifference = 3;
        int n = 5;
        System.out.println("The first " + n + " terms of the arithmetic progression are:");
        for (int i = 0; i < n; i++) {
            int term = firstTerm + i * commonDifference;
            System.out.print(term + " ");
        }
    }
}
