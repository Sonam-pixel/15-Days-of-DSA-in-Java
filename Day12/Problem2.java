// Print Diagonal Sum of Square Matrix
package Day12;

public class Problem2 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i]; // Primary
            if (i != n - 1 - i)
                sum += matrix[i][n - 1 - i]; // Secondary
        }

        System.out.println("Diagonal Sum: " + sum);
    }
}
