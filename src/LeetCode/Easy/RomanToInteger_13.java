package LeetCode.Easy;

import java.util.Map;
import java.util.Scanner;

public class RomanToInteger_13 {
    static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        String roman = hv.nextLine();
        System.out.println(romanToInt(roman));
        hv.close();
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> values = Map.of(
                'I', 1, 'V', 5, 'X', 10,
                'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = values.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? values.get(s.charAt(i + 1)) : 0;
            sum += (current < next) ? -current : current;
        }
        return sum;
    }
}
