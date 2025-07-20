//Short Practice Problems to Test All Operator Types
package Day3;

public class Problem6 {
    public static void main(String[] args) {
        int a = 8, b = 3;
        int sum = a + b;
        int mod = a % b;
        boolean condition = (a > b) && (b != 0);
        int post = a++;
        int pre = ++b;

        System.out.println("Sum = " + sum);       
        System.out.println("Modulus = " + mod);   
        System.out.println("Condition = " + condition); 
        System.out.println("Post = " + post);     
        System.out.println("Pre = " + pre);    
    }
}
