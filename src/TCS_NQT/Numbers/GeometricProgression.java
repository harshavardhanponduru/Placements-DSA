package TCS_NQT.Numbers;

public class GeometricProgression {

    public static void main(String[] args) {
        int firstTerm = 2;
        int commonRatio = 3;
        int n = 5;
        System.out.println("The first " + n + " terms of the geometric progression are:");
        for (int i = 0; i < n; i++) {
            int term = (int) (firstTerm * Math.pow(commonRatio, i));
            System.out.print(term + " ");
        }
    }
}
