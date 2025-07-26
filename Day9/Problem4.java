//Implemented Linear Search and explored time complexity
package Day9;

public class Problem4 {
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 9, 12};
        int index = linearSearch(nums, 9);
        System.out.println("Element found at index: " + index);
    }
}
