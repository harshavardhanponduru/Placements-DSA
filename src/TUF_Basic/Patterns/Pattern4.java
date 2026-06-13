package TUF_Basic.Patterns;

class Pattern4 
{
    public static void pattern4(int n) 
    {
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        Pattern4.pattern4(5);
    }
}

// Output : N = 4

// 1
// 22
// 333
// 4444

