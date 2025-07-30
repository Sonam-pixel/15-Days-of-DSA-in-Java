// Build Substrings and Extract Tokens
package Day13;

public class Problem6 {
    public static void main(String[] args) {
        String s = "Hello World Java";
        String[] tokens = s.split(" ");
        for (String token : tokens) {
            System.out.println(token);
        }
        System.out.println("Substring: " + s.substring(6, 11));
    }
}
