package TCS_NQT.Number_System;

public class BinaryToDecimal {

    public static void main(String[] args) {
        String binaryString = "1101"; // Example binary number
        int decimalValue = binaryToDecimal(binaryString);
        System.out.println("Binary: " + binaryString);
        System.out.println("Decimal: " + decimalValue);
    }

    // Method to convert binary string to decimal integer
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(length - 1 - i);
            if (bit == '1') {
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }
}
