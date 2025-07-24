//Convert Binary to Decimal
package Day7;

public class Problem9 {
    public static int toDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {
        System.out.println(toDecimal("1010")); 
    }
}
