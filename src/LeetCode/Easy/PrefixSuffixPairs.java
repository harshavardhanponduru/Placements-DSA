package LeetCode.Easy;

public class PrefixSuffixPairs {

    public static boolean isPrefixAndSuffix(String str1, String str2) {
        // Check if str1 is both a prefix and a suffix of str2
        return str2.startsWith(str1) && str2.endsWith(str1);
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        int n = words.length;

        // Iterate over all pairs (i, j) with i < j
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] words = {"abc", "abcde", "de", "xyz", "abc"};
        int result = countPrefixSuffixPairs(words);
        System.out.println("Number of prefix-suffix pairs: " + result);
    }
}