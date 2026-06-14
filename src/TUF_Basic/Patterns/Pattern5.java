package TUF_Basic.Patterns;

public class Pattern5
{
    public static void pattern5(int n) {

        for(int i = 0; i < n; i++)
        {
            for(int j = n; j > i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        Pattern5.pattern5(5);
    }
}

// Output: N = 5

// *****
// ****
// ***
// **
// *