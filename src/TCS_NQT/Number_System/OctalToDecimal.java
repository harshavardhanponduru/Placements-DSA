package TCS_NQT.Number_System;

public class OctalToDecimal {

    public static void main(String[] args) {
        String octalString = "15"; // Example octal number
        int decimalValue = octalToDecimal(octalString);
        System.out.println("Octal: " + octalString);
        System.out.println("Decimal: " + decimalValue);
    }

    // Method to convert octal string to decimal integer
    public static int octalToDecimal(String octal) {
        int decimal = 0;
        int length = octal.length();
        for (int i = 0; i < length; i++) {
            char digit = octal.charAt(length - 1 - i);
            if (digit >= '0' && digit <= '7') {
                decimal += (digit - '0') * Math.pow(8, i);
            } else {
                throw new IllegalArgumentException("Invalid octal digit: " + digit);
            }
        }
        return decimal;
    }
}
