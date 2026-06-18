package TCS_NQT.Number_System;

public class DecimalToBinary {

    public static void main(String[] args) {
        int decimalNumber = 13; // Example decimal number
        String binaryString = decimalToBinary(decimalNumber);
        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Binary: " + binaryString);
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
