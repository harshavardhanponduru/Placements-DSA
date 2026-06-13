package TUF_Basic.Language_Basics;

public class Iteration_Basics
{
    public void printX(int X, int N) 
    {
        for(int i = 0; i < N; i++) 
            {
            System.out.print(X);
            
            if(i < N - 1)
                System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Iteration_Basics obj = new Iteration_Basics();
        int X = 5;
        int N = 3;
        obj.printX(X, N); // Expected output: "5 5 5"
    }
}
