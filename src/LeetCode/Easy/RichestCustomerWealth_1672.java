package LeetCode.Easy;

public class RichestCustomerWealth_1672 {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] customer : accounts) {
            int currentWealth = 0;
            for (int bank : customer) {
                currentWealth += bank;
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 2, 3 },
                { 3, 2, 1 },
                { 4, 5, 6 }
        };

        int result = maximumWealth(accounts);
        System.out.println("The richest customer's wealth is: " + result);
    }
}
