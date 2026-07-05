# Function to find the word with the highest number of repeated letters
def HighestRepeatedLetters(str):

    # Initialize variables for tracking the maximum number of repeated letters
    maximumword = 0
    curr_maximumword = 0
    result = ""

    # Split the string into words and iterate through each word
    words = str.split()
    for word in words:

        # Initialize frequency array for counting letter occurrences
        frequency = [0] * 26
        curr_maximumword = 0

        # Count the frequency of each letter in the word
        for char in word:
            frequency[ord(char) - ord('a')] += 1

        # Count the number of repeated letters in the word
        for count in frequency:
            if count > 1:
                curr_maximumword += 1

        # Update the result if the current word has more repeated letters
        if curr_maximumword > maximumword:
            maximumword = curr_maximumword
            result = word

    # If no word with repeated letters is found, print "-1"
    if result == "":
        print("-1")
    else:
        print(f"Word with highest number of repeated letters: {result}")

# Main function
def main():
    # Input string
    str = "abcdefg google microsoft"

    # Call the function to find the word with the highest repeated letters
    HighestRepeatedLetters(str)

# Call the main function
if __name__ == "__main__":
    main()