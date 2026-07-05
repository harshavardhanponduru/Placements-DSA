class Solution:
    def sumOfNumbers(self, s: str) -> int:
        total = 0
        temp = ""
        for c in s:
            if c.isdigit():
                temp += c
            else:
                if temp != "":
                    total += int(temp)
                    temp = ""  # Reset
        
        if temp != "":
            total += int(temp)
        
        return total

obj = Solution()
print(obj.sumOfNumbers("123xyz"))  # Output: 123
print(obj.sumOfNumbers("1xyz23"))  # Output: 24
