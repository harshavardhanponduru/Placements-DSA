# Class to print the ASCII value of 'A'
class ASCII:

    # Method to print the ASCII value of the character 'A'
    def value(self):

        # Assign 'A' to char variable c
        c = 'A'

        # Output the ASCII value of character 'A'
        print(f"The ASCII value of {c} is {ord(c)}")

# Main function
def main():
    # Create an object of the ASCII class
    p1 = ASCII()

    # Call the value method to print the ASCII value
    p1.value()

# Call the main function
if __name__ == "__main__":
    main()