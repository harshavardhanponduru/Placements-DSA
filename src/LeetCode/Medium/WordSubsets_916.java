package LeetCode.Medium;

import java.util.*;

public class WordSubsets_916 {
    public static List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26];
        for (String word : words2) {
            int[] freq = countFrequency(word);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }

        List<String> result = new ArrayList<>();
        for (String word : words1) {
            int[] freq = countFrequency(word);
            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (freq[i] < maxFreq[i]) {
                    isUniversal = false;
                    break;
                }
            }
            if (isUniversal) {
                result.add(word);
            }
        }
        return result;
    }

    private static int[] countFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of words in words1:");
        int n1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] words1 = new String[n1];
        System.out.println("Enter the words for words1:");
        for (int i = 0; i < n1; i++) {
            words1[i] = scanner.nextLine();
        }

        System.out.println("Enter the number of words in words2:");
        int n2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] words2 = new String[n2];
        System.out.println("Enter the words for words2:");
        for (int i = 0; i < n2; i++) {
            words2[i] = scanner.nextLine();
        }

        List<String> universalWords = wordSubsets(words1, words2);
        System.out.println("Universal words in words1:");
        System.out.println(universalWords);

        scanner.close();
    }
}
