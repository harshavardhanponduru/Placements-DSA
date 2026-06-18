package TCS_NQT.Numbers;

public class GeometricProgressionSum {

    public static void main(String[] args) {
        int firstTerm = 2;
        int commonRatio = 3;
        int n = 5;
        int sum = geometricProgressionSum(firstTerm, commonRatio, n);
        System.out.println("The sum of the first " + n + " terms of the geometric progression is: " + sum);
    }

    public static int geometricProgressionSum(int firstTerm, int commonRatio, int n) {
        if (commonRatio == 1) {
            return firstTerm * n; // If common ratio is 1, all terms are the same
        }
        return (int) (firstTerm * (Math.pow(commonRatio, n) - 1) / (commonRatio - 1));
    }
}
