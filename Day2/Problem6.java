//Type Promotion in Expressions
package Day2;

public class Problem6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        int result = a * b; // byte promoted to int
        System.out.println("Result = " + result);
    }
}
