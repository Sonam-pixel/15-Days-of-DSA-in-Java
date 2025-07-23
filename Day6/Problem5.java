// Character Pattern (A, AB, ABC...)
package Day6;

public class Problem5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
