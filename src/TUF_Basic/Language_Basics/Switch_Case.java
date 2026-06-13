package TUF_Basic.Language_Basics;

public class Switch_Case 
{
    public void whichWeekDay(int day) 
    {
        String day2 = "";
        switch (day)
        {
            case 1 -> day2 = "Monday";
            case 2 -> day2 = "Tuesday";
            case 3 -> day2 = "Wednesday";
            case 4 -> day2 = "Thursday";
            case 5 -> day2 = "Friday";
            case 6 -> day2 = "Saturday";
            case 7 -> day2 = "Sunday";
            default -> day2 = "Invalid";
        }
        System.out.println(day2);
    }

    public static void main(String[] args) 
    {
        Switch_Case obj = new Switch_Case();
        obj.whichWeekDay(1); // Expected: Monday
        obj.whichWeekDay(5); // Expected: Friday
        obj.whichWeekDay(7); // Expected: Sunday
        obj.whichWeekDay(0); // Expected: Invalid
    }
}
