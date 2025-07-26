//Understood Binary Search, its edge cases & dry-run
package Day9;

public class Problem6 {
    static int binarySearch(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArr = {10, 20, 30, 40, 50};
        int result = binarySearch(sortedArr, 30);
        System.out.println("Element found at index: " + result);
    }
}
