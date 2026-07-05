# Function to find non-repeating characters in a string
def non_repeating(st, n):
    
    # Initialize frequency array
    freq = [0] * 200  

    # Count frequency of each character
    for i in range(n):
        if st[i] == ' ':  # Ignoring spaces in the string
            continue
        else:
            # Incrementing each character's frequency
            freq[ord(st[i]) - ord('a')] += 1  

    # Print non-repeating characters
    for i in range(n):
        if freq[ord(st[i]) - ord('a')] == 1 and st[i] != ' ':
            # Output the non-repeating character
            print(st[i], end=" ")  

# Main function
if __name__ == "__main__":
    
    # Input string
    st = "blockchain technology"  
    
    # Get length of the string
    n = len(st)  

    # Print message
    print("Non-Repeating characters: ")  

    # Call method to print non-repeating characters
    non_repeating(st, n)  