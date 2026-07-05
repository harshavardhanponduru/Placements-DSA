class Solution:
    # Function to find max occurring character
    def getMaxOccurringChar(self, s: str) -> str:
        # Sort the string
        arr = sorted(s)

        # Variables to store result
        maxFreq, currFreq = 1, 1
        maxChar = arr[0]

        # Traverse the sorted string
        for i in range(1, len(arr)):
            # If same char, increase count
            if arr[i] == arr[i - 1]:
                currFreq += 1
            else:
                # If frequency greater, update result
                if currFreq > maxFreq:
                    maxFreq = currFreq
                    maxChar = arr[i - 1]
                currFreq = 1

        # Final check for last character
        if currFreq > maxFreq:
            maxFreq = currFreq
            maxChar = arr[-1]

        # Return result
        return maxChar


# Input string
s = "samplestring"

# Create object of Solution
obj = Solution()

# Call function
ans = obj.getMaxOccurringChar(s)

# Print result
print("Max occurring character:", ans)
