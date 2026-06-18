package TCS_NQT.Numbers;

public class OddEven {
    public static void main(String[] args) {
        int number = 15;
        if (isEven(number)) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
