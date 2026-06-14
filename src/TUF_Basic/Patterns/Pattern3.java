package TUF_Basic.Patterns;

public class Pattern3 {
    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern3.pattern3(5);
    }
}

// Output: N = 4

// 1
// 12
// 123
// 1234
