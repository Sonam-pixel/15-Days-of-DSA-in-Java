// Prefix Sum Array
package Day10;

public class Problem2 {
    public static int rangeSum(int[] arr, int l, int r) {
        int[] prefix = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++)
            prefix[i + 1] = prefix[i] + arr[i];
        return prefix[r + 1] - prefix[l];
    }
}
