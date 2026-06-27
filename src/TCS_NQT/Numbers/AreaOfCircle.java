package TCS_NQT.Numbers;

public class AreaOfCircle {

    public double areaOfCircle(int r) {
        // Your code goes here
        double area = 3.14 * r * r;
        return area;
    }

    public static void main(String[] args) {
        AreaOfCircle area = new AreaOfCircle();
        int radius = 5;
        double result = area.areaOfCircle(radius);
        System.out.println("Area of the circle: " + result);
    }
}
