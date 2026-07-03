class Solution:
    def solve(self, s):
        vowels = 0
        consonants = 0
        whitespaces = 0

        s = s.lower()

        for ch in s:

            if ch in 'aeiou':
                vowels += 1

            elif 'a' <= ch <= 'z':
                consonants += 1

            elif ch == ' ':
                whitespaces += 1

        print("Vowels:", vowels)
        print("Consonants:", consonants)
        print("White Spaces:", whitespaces)

s = "Take u forward is Awesome"

obj = Solution()

obj.solve(s)
