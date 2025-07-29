// Non-Square Matrix Traversal
package Day12;

public class Problem6 {
    public static void main(String[] args) {
        int[][] nonSquare = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };

        for (int i = 0; i < nonSquare.length; i++) {
            for (int j = 0; j < nonSquare[i].length; j++) {
                System.out.print(nonSquare[i][j] + " ");
            }
            System.out.println();
        }
    }
}
