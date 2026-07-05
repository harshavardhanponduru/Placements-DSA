class Solution:
    def capitalizeFirstLast(self, s: str) -> str:
        arr = list(s)
        n = len(arr)
        start = 0

        while start < n:
            while start < n and arr[start] == ' ':
                start += 1

            if start >= n:
                break

            end = start

            while end < n and arr[end] != ' ':
                end += 1

            if arr[start].islower():
                arr[start] = arr[start].upper()

            if end - 1 > start and arr[end - 1].islower():
                arr[end - 1] = arr[end - 1].upper()

            start = end

        return ''.join(arr)

if __name__ == "__main__":
    sol = Solution()
    s = "hello world from chatgpt"
    print(sol.capitalizeFirstLast(s))