package TCS_NQT.Number_System;

public class DecimalToOctal {

    public static void main(String[] args) {
        int decimalNumber = 13; // Example decimal number
        String octalString = decimalToOctal(decimalNumber);
        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Octal: " + octalString);
    }

    // Method to convert decimal integer to octal string
    public static String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 8;
            octal.insert(0, remainder);
            decimal /= 8;
        }
        return octal.toString();
    }
}
