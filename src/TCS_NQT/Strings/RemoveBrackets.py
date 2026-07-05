class Solution:
    def removeBrackets(self, expr):
        result = ""
        for ch in expr:
            if ch != '(' and ch != ')':
                result += ch

        return result

def main():
    expression = "a+(b*c)-(d/e)"
    sol = Solution()
    result = sol.removeBrackets(expression)
    print("Expression without brackets:", result)
    
main()
