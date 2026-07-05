class Solution:
    def print_frequency(self, s: str) -> None:
        freq = [0] * 26

        for ch in s:
            freq[ord(ch) - ord('a')] += 1 

        for i in range(26):
            if freq[i] != 0:
                print(f"{chr(i + ord('a'))}{freq[i]}", end=" ")

sol = Solution()
sol.print_frequency("takeuforward")
