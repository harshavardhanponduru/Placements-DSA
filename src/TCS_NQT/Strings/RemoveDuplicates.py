# Solution class to remove duplicates using boolean array
class Solution:
    # Function to remove duplicates
    def removeDuplicates(self, s: str) -> str:
        # Boolean list to track seen characters
        seen = [False] * 26
        result = []

        # Traverse the string
        for ch in s:
            # If character not seen before
            if not seen[ord(ch) - ord('a')]:
                # Mark it as seen
                seen[ord(ch) - ord('a')] = True
                # Append to result
                result.append(ch)

        return ''.join(result)

# Driver code
if __name__ == "__main__":
    s = "bcabc"
    sol = Solution()
    print(sol.removeDuplicates(s))
