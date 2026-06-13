package TUF_Basic.Language_Basics;

public class If_Else_Problem
{
    public void isAdult(int age) 
    {
        if (age >= 18)
            System.out.println("Adult");
        else
            System.out.println("Teen");
    }

    public static void main(String[] args) 
    {
        If_Else_Problem obj = new If_Else_Problem();
        obj.isAdult(20); // Expected: Adult
        obj.isAdult(15); // Expected: Teen
    }
}
