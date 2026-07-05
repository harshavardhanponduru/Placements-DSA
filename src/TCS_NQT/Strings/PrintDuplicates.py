# Solution class containing the logic
class Solution:
    # Function to print characters that occur more than once
    def print_duplicates(self, string):
        # List to store frequency of 26 lowercase letters
        freq = [0] * 26

        # Loop through the string and count character frequency
        for ch in string:
            freq[ord(ch) - ord('a')] += 1

        # Print characters that appear more than once
        for i in range(26):
            if freq[i] > 1:
                print(f"{chr(i + ord('a'))} - {freq[i]}")

# Driver code
if __name__ == "__main__":
    # Sample input string
    string = "sinstriiintng"

    # Create object of Solution class
    sol = Solution()

    # Call the function to print duplicates
    sol.print_duplicates(string)
