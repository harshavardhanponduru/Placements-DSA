package TCS_NQT.Number_System;

public class OctalToBinary {

    public static void main(String[] args) {
        String octalString = "15"; // Example octal number
        int decimalValue = octalToDecimal(octalString);
        String binaryValue = decimalToBinary(decimalValue);
        System.out.println("Octal: " + octalString);
        System.out.println("Binary: " + binaryValue);
    }

    // Method to convert octal string to decimal integer
    public static int octalToDecimal(String octal) {
        int decimal = 0;
        int length = octal.length();
        for (int i = 0; i < length; i++) {
            char digit = octal.charAt(length - 1 - i);
            decimal += Character.getNumericValue(digit) * Math.pow(8, i);
        }
        return decimal;
    }

    // Method to convert decimal integer to binary string
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }
        return binary.toString();
    }
}
