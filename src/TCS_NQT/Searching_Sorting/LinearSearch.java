package TCS_NQT.Searching_Sorting;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2}; // Example array
        int target = 4; // Element to search for
        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }
}
