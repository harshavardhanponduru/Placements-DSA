package LeetCode.Medium;

import java.util.HashMap;
import java.util.Map;

public class KPalindromeStrings_1400 {

    public static boolean canConstruct(String s, int k) {
        // If k is greater than the length of the string, it's impossible
        if (k > s.length()) {
            return false;
        }

        // Count the frequency of each character
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Count characters with odd frequencies
        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // We can construct k palindromes if oddCount <= k
        return oddCount <= k;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("annabelle", 2)); // true
        System.out.println(canConstruct("leetcode", 3)); // false
        System.out.println(canConstruct("aabb", 1)); // true
        System.out.println(canConstruct("abc", 3)); // true
        System.out.println(canConstruct("abc", 4)); // false
    }
}
