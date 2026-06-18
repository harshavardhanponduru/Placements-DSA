package TCS_NQT.Arrays;

public class LargestElementInArray {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int largest = findLargestElement(arr);
        int largestUsingSorting = findLargestElementUsingSorting(arr);
        System.out.println("The largest element in the array is: " + largest);
        System.out.println("The largest element in the array (using sorting) is: " + largestUsingSorting);
    }

    public static int findLargestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int findLargestElementUsingSorting(int[] arr) {
        java.util.Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
