class CharShift:
    def __init__(self, s):
        self.s = s
        self.length = len(s)

    def solve(self):
        result = []

        for i in range(self.length):
            ascii_val = ord(self.s[i])  # Get ASCII value

        if ascii_val == 90:  # If 'Z', wrap to 'A'
            result.append(chr(65))
        elif ascii_val == 122:  # If 'z', wrap to 'a'
            result.append(chr(97))
        elif (65 <= ascii_val < 90) or (97 <= ascii_val < 122):
            result.append(chr(ascii_val + 1))  # Shift to next character
        else:
            result.append(self.s[i])  # Leave other characters unchanged
            
        return ''.join(result)


# Input
str_val = "abcdxyz"
length = len(str_val)

print("Original String:")
print(str_val)

print("New string:")
char_shift = CharShift(str_val)
print(char_shift.solve())
