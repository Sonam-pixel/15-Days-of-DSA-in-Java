//Factorial Using Method
package Day7;

public class Problem2 {
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); 
    }
}

