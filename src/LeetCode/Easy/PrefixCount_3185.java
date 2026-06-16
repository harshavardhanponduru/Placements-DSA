package LeetCode.Easy;

public class PrefixCount_3185 {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        PrefixCount_3185 solution = new PrefixCount_3185();
        String[] words = { "pay", "attention", "practice", "attend" };
        String pref = "at";
        int result = solution.prefixCount(words, pref);
        System.out.println("Number of words with prefix '" + pref + "': " + result);
    }
}