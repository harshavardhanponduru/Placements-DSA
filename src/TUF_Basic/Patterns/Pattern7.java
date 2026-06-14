package TUF_Basic.Patterns;

public class Pattern7 {
    public void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++)
                System.out.print(" ");

            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");

            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Pattern7 p = new Pattern7();
        p.pattern7(5);
    }
}
