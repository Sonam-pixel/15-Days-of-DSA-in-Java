//Solved problem to find Largest Element in an Array
package Day9;

public class Problem5 {
    static int findLargest(int[] arr) {
        int max = arr[0];
        for (int num : arr)
            if (num > max) max = num;
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 90, 33};
        System.out.println("Largest element: " + findLargest(arr));
    }
}
