from collections import defaultdict

class Frequency:
    def __init__(self, arr):
        self.arr = arr

    def calculate_frequency(self):
        frequency_dict = defaultdict(int)
        for num in self.arr:
            frequency_dict[num] += 1
        return dict(frequency_dict)
    
if __name__ == "__main__":
    arr = [1, 2, 2, 3, 3, 3, 4]
    freq = Frequency(arr)
    result = freq.calculate_frequency()
    print(result)  # Output: {1: 1, 2: 2, 3: 3, 4: 1}
