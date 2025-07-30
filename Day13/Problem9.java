// Convert Lowercase to Uppercase using ASCII
package Day13;

public class Problem9 {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append((char)(c - 'a' + 'A'));
        }
        System.out.println(sb.toString());
    }
}
