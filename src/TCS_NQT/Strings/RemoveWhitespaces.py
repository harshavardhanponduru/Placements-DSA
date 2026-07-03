# Class to hold solution logic
class Solution:
    # Function to remove all whitespaces from a string
    def removeWhitespaces(self, s):
        # Create a new string to store the result
        result = ""
        
        # Loop through each character of the input string
        for c in s:
            # If the character is not a space, tab, or newline
            if c != ' ' and c != '\t' and c != '\n':
                # Append it to the result
                result += c
        return result

# Main driver code
if __name__ == "__main__":
    input_str = "  Hello   World! This is   Python  "
    sol = Solution()

    # Call the function to remove whitespaces
    output = sol.removeWhitespaces(input_str)

    # Print the final string without whitespaces
    print(output)
