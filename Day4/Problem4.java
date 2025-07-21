package Day4;

public class Problem4 {
    public static void main(String[] args) {
        int x = 45, y = 78, z = 22;

        if (x >= y && x >= z) {
            System.out.println("Largest: " + x);
        } else if (y >= x && y >= z) {
            System.out.println("Largest: " + y);
        } else {
            System.out.println("Largest: " + z);
        }
    }
}
