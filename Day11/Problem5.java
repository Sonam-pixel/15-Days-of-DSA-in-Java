// Counting Sort  
package Day11;

import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        int max = Arrays.stream(arr).max().getAsInt();
        int[] count = new int[max + 1];
        int[] output = new int[arr.length];

        for (int num : arr) count[num]++;
        for (int i = 1; i < count.length; i++) count[i] += count[i - 1];
        for (int i = arr.length - 1; i >= 0; i--) output[--count[arr[i]]] = arr[i];
        System.arraycopy(output, 0, arr, 0, arr.length);

        for (int num : arr) System.out.print(num + " ");
    }
}
