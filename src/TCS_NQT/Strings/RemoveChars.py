# Solution class
class Solution:
    # Function to remove characters from str1 that are in str2
    def removeChars(self, str1, str2):
        # Step 1: Create a set of characters to be removed
        remove_set = set(str2)

        # Initialize result string
        result = ""

        # Step 2: Traverse str1 and add only characters not in remove_set
        for ch in str1:
            if ch not in remove_set:
                result += ch

        return result

# Main function
def main():
    # Input strings
    str1 = "computer"
    str2 = "cat"

    # Create object of Solution
    sol = Solution()

    # Call the function
    result = sol.removeChars(str1, str2)

    # Print result
    print("Result:", result)

# Run main
main()
