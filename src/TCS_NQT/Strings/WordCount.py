class Solution:
    # Function to count number of words in string
    def countWords(self, s: str) -> int:
        # Count spaces in the string
        spaces = 0
        for c in s:
            if c == ' ':
                spaces += 1
        # Number of words = spaces + 1
        return spaces + 1

# Driver code
if __name__ == "__main__":
    # Input string
    s = "Hello this is test"

    # Create object of Solution
    obj = Solution()

    # Call function and print result
    print(obj.countWords(s))
