//Method Scope vs Block Scope
package Day7;

public class Problem11 {
    public static void methodScope() {
        int a = 5; // method scope
        {
            int b = 10; // block scope
            System.out.println("Inside block: a=" + a + ", b=" + b);
        }
        System.out.println("Outside block: a=" + a);
    }

    public static void main(String[] args) {
        methodScope();
    }
}
