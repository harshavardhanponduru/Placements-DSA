package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class ZigZagGridTraversal_3417

{
    public static List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        int m = grid.length; // Number of rows
        int n = grid[0].length; // Number of columns
        boolean skip = false; // Skip flag

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                // Traverse left-to-right for even-indexed rows
                for (int j = 0; j < n; j++) {
                    if (!skip) {
                        result.add(grid[i][j]);
                    }
                    skip = !skip; // Toggle skip flag
                }
            } else {
                // Traverse right-to-left for odd-indexed rows
                for (int j = n - 1; j >= 0; j--) {
                    if (!skip) {
                        result.add(grid[i][j]);
                    }
                    skip = !skip; // Toggle skip flag
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] grid1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(zigzagTraversal(grid1)); // [1, 3, 4, 6, 7]

        int[][] grid2 = {
                { 1, 2 },
                { 3, 4 },
                { 5, 6 }
        };
        System.out.println(zigzagTraversal(grid2)); // [1, 2, 3]

        int[][] grid3 = {
                { 1 }
        };
        System.out.println(zigzagTraversal(grid3)); // [1]
    }
}