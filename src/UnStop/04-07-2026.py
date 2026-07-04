class Node:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def valid_partition(head, x):
    # Find the first node with value >= x
    curr = head
    found = False

    while curr:
        if curr.val >= x:
            found = True
            break
        curr = curr.next

    # No partition possible if all elements are < x
    # or the first element itself is >= x
    if not found or curr == head:
        return "NO"

    # Remaining nodes must all be >= x
    while curr:
        if curr.val < x:
            return "NO"
        curr = curr.next

    return "YES"

def main():
    import sys
    input = sys.stdin.read
    data = input().strip().split()
    
    n = int(data[0])  # Number of elements in the linked list
    x = int(data[1])  # Partition value
    values = list(map(int, data[2:n+2]))  # Values of the linked list
    
    # Construct the linked list from the input values
    head = None
    tail = None
    for value in values:
        node = Node(value)
        if head is None:
            head = tail = node
        else:
            tail.next = node
            tail = node
    
    # Call the user logic function and print the output
    result = valid_partition(head, x)
    print(result)

if __name__ == "__main__":
    main()