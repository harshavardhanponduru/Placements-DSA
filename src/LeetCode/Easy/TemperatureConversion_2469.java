package LeetCode.Easy;
import java.util.*;
public class TemperatureConversion_2469 {
        public static void main(String[] args) {
            Scanner hv = new Scanner(System.in);
            System.out.print("Enter the temperature in Celsius: ");
            double celsius = hv.nextDouble();
            System.out.print(Arrays.toString(convertTemperature(celsius)));
            hv.close();
        }
        public static double[] convertTemperature(double celsius) {
            double fahrenheit = celsius * 1.8 + 32;
            double kelvin = celsius + 273.15;
            return new double[]{kelvin, fahrenheit};
        }
    }

    // Example usage:
    // Input: 36.5
    // Output: [309.65, 97.7]