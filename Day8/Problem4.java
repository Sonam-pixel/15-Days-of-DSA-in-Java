// Floyd's Triangle
package Day8;

public class Problem4 {
    public static void main(String[] args) {
        int n = 5, num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(num++ + " ");
            System.out.println();
        }
    }
}
