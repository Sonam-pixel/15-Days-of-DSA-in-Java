//Skip even numbers using continue
package Day5;

public class Problem8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }
    }
}
