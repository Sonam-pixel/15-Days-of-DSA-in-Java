//Printed all pairs and subarrays, improving nested loop handling
package Day9;

public class Problem8 {
    static void printPairs(int[] arr) {
        System.out.println("Pairs:");
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
    }

    static void printSubarrays(int[] arr) {
        System.out.println("Subarrays:");
        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++)
                    System.out.print(arr[k] + " ");
                System.out.println();
            }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printPairs(arr);
        printSubarrays(arr);
    }
}
