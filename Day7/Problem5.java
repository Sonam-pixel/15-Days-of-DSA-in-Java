//Function Overloading (Different Data Types)
package Day7;

public class Problem5 {
    public static void print(int a) {
        System.out.println("Integer: " + a);
    }

    public static void print(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        print(7);
        print("Hello");
    }
}
