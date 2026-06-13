package TUF_Basic.Language_Basics;
import java.util.Scanner;
public class Input_Output 
{
    public void printNumber(Scanner sc) 
    {
        int n = sc.nextInt();
        System.out.println(n);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Input_Output obj = new Input_Output();
        obj.printNumber(sc);
        sc.close();
    }
}
