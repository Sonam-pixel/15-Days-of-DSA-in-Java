//Function Overloading (Different Number of Parameters)
package Day7;

public class Problem4 {
    public static void show(int a) {
        System.out.println("One parameter: " + a);
    }

    public static void show(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        show(10);
        show(10, 20);
    }
}
