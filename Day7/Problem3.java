//Binomial Coefficient Using Factorial
package Day7;

public class Problem3 {
    public static long fact(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    public static long binomialCoeff(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    public static void main(String[] args) {
        System.out.println(binomialCoeff(5, 2)); // Output: 10
    }
}
