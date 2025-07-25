// Solid & Hollow Rhombus
package Day8;

public class Problem7 {
    public static void main(String[] args) {
        int n = 5;

        // Solid Rhombus
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= n; j++) System.out.print("*");
            System.out.println();
        }

        System.out.println();

        // Hollow Rhombus
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
