package LeetCode.Easy;

public class TwoSum_2235
{
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        TwoSum_2235 obj = new TwoSum_2235();
        int num1 = 5;
        int num2 = 10;
        int result = obj.sum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}

