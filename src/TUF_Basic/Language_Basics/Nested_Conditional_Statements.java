package TUF_Basic.Language_Basics;

public class Nested_Conditional_Statements 
{
    public void studentGrade(int marks) 
    {
        if (marks >= 90)
            System.out.println("Grade A");
        else if (marks >= 70)
            System.out.println("Grade B");
        else if(marks >= 50)
            System.out.println("Grade C");
        else if(marks >= 35)
            System.out.println("Grade D");
        else
            System.out.println("Fail");
    }

    public static void main(String[] args) 
    {
        Nested_Conditional_Statements obj = new Nested_Conditional_Statements();
        obj.studentGrade(95); // Expected: Grade A
        obj.studentGrade(75); // Expected: Grade B
        obj.studentGrade(55); // Expected: Grade C
        obj.studentGrade(40); // Expected: Grade D
        obj.studentGrade(30); // Expected: Fail
    }
}
