// Search in Sorted 2D Matrix (O(n + m))
package Day12;

public class Problem3 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };
        int target = 5;
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Found at: " + row + "," + col);
                return;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Not found");
    }
}
