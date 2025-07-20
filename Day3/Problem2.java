//Understanding Prefix vs Postfix Increment/Decrement
package Day3;

public class Problem2 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Postfix: " + (x++));  
        System.out.println("After Postfix: " + x); 

        int y = 5;
        System.out.println("Prefix: " + (++y));  
        System.out.println("After Prefix: " + y); 
    }
}
