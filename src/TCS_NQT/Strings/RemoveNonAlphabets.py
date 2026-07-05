class Solution:
    # Function to remove non-alphabet characters
    def removeNonAlphabets(self, s: str) -> str:
        result = ""
        for c in s:
            # Check if character is alphabet
            if ('a' <= c <= 'z') or ('A' <= c <= 'Z'):
                result += c
        return result

# Driver code
if __name__ == "__main__":
    s = "He!!llo W@orld123"
    sol = Solution()
    print("Original String:", s)
    print("Filtered String:", sol.removeNonAlphabets(s))
