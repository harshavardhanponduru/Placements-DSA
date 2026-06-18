package TCS_NQT.Numbers;

public class Replace0with1 {
    public static void main(String[] args) {
        int number = 1020304050; // Example number
        int replacedNumber = replace0With1(number);
        System.out.println("Original number: " + number);
        System.out.println("Number after replacing 0 with 1: " + replacedNumber);
    }

    // Method to replace all occurrences of 0 with 1 in a given number
    public static int replace0With1(int num) {
        String numStr = Integer.toString(num);
        String replacedStr = numStr.replace('0', '1');
        return Integer.parseInt(replacedStr);
    }
}
