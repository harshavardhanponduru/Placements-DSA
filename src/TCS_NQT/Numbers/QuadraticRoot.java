package TCS_NQT.Numbers;

public class QuadraticRoot {

    public static void main(String[] args) {
        double a = 1; // Coefficient of x^2
        double b = -3; // Coefficient of x
        double c = 2; // Constant term

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and different.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The roots are real and the same.");
            System.out.println("Root: " + root);
        } else {
            System.out.println("The roots are complex and different.");
        }
    }
}
