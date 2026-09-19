// Check whether two arrays are equal after sorting

package Arrays.Sorting;
import java.util.Arrays;
public class EqualArrays {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 2, 4};
        int[] arr2 = {4, 2, 3, 1};

        boolean areEqual = areArraysEqual(arr1, arr2);
        if (areEqual) {
            System.out.println("The arrays are equal after sorting.");
        } else {
            System.out.println("The arrays are not equal after sorting.");
        }
    }

    private static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

}
