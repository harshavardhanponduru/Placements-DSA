def MaxLengthWords(str):
    # Initialize variables for tracking the min and max word length
    n = len(str)
    i = 0
    j = 0
    max_length = 0
    max_start = 0

    # Traverse through the string to find the longest word
    while j <= n:
        # Increase j until we reach a space or the end of the string
        if j < n and str[j] != ' ':
            j += 1
        else:
            # Calculate the length of the current word
            curr_length = j - i

            # If the current word is longer than the previous longest, update max length
            if curr_length > max_length:
                max_length = curr_length
                max_start = i
            j += 1  # Move past the space
            i = j  # Update the start of the next word

    # Extract and return the longest word from the string
    return str[max_start:max_start + max_length]

# Main function
def main():
    # Input string
    str = "Google Docs"

    # Call the function to find the longest word
    maxWord = MaxLengthWords(str)

    # Output the result
    print(f"Largest Word is: {maxWord}")


# Call the main function
if __name__ == "__main__":
    main()