//Convert Decimal to Binary
package Day7;

public class Problem10 {
    public static String toBinary(int num) {
        return Integer.toBinaryString(num);
    }

    public static void main(String[] args) {
        System.out.println(toBinary(10)); 
    }
}
