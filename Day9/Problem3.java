//Understood how arrays behave when passed into functions
package Day9;

public class Problem3 {
    static void modifyArray(int[] a) {
        a[0] = 999;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        modifyArray(arr);
        System.out.println("Modified first element: " + arr[0]);
    }
}
