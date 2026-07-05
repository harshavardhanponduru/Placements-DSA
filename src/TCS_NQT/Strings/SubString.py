# return index using built-in str.find
def found_index(text: str, pattern: str) -> int:
    # delegate to str.find (returns -1 if not found)
    return text.find(pattern)

def main():
    # define the text
    text = "takeuforward"
    # define the pattern
    pattern = "forward"
    # compute index using built-in search
    found_idx = found_index(text, pattern)
    # print the result index
    print(f"The substring starts from the index: {found_idx}")

# program entry point
if __name__ == "__main__":
    main()