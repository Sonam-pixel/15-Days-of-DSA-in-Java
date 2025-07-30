// Find Lexicographically Largest String in List
package Day13;

public class Problem7 {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "pear", "zebra", "mango"};
        String max = words[0];
        for (String word : words) {
            if (word.compareTo(max) > 0) {
                max = word;
            }
        }
        System.out.println("Largest String: " + max);
    }
}
