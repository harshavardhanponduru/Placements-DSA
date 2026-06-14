package TUF_Basic.Basic_Maths;

public class CountDigit {
    public int countDigit(int n) {

        int count = 0;

        do {
            n /= 10;
            count++;
        } while (n != 0);

        return count;
    }

    public static void main(String[] args) {
        CountDigit c = new CountDigit();
        System.out.println(c.countDigit(12345));
    }
}