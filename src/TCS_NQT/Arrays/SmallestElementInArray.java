package TCS_NQT.Arrays;

public class SmallestElementInArray {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int smallest = findSmallestElement(arr);
        int smallestUsingSorting = findSmallestElementUsingSorting(arr);
        System.out.println("The smallest element in the array is: " + smallest);
        System.out.println("The smallest element in the array (using sorting) is: " + smallestUsingSorting);
    }

    public static int findSmallestElement(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static int findSmallestElementUsingSorting(int[] arr) {
        java.util.Arrays.sort(arr);
        return arr[0];
    }
}
