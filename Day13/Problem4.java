// Convert Directions to Shortest X-Y Coordinates
package Day13;

public class Problem4 {
    public static void main(String[] args) {
        String path = "NSNEEW";
        int x = 0, y = 0;
        for (char dir : path.toCharArray()) {
            if (dir == 'N') y++;
            else if (dir == 'S') y--;
            else if (dir == 'E') x++;
            else if (dir == 'W') x--;
        }
        System.out.println("Final coordinates: (" + x + ", " + y + ")");
    }
}
