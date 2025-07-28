// Built-in Arrays.sort()  
package Day11;

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        Arrays.sort(arr);

        for (int num : arr) System.out.print(num + " ");
    }
}
