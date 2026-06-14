package TUF_Basic.Patterns;

public class Pattern6 
{
    public static void pattern6(int n) {

        for(int i = 1; i <= n; i++)
        {
            int k = 1;
            for(int j = n; j >= i; j--)
            {
                System.out.print(k);
                ++k;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        Pattern6.pattern6(5);
    }
}

// Output: N = 5
// 12345
// 1234
// 123
// 12
// 1
