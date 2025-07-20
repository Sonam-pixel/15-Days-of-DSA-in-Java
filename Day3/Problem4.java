//Building Logical Conditions for Decision-Making
package Day3;

public class Problem4 {
    public static void main(String[] args) {
        int age = 25;
        boolean hasLicense = true;

        if (age > 18 && hasLicense) {
            System.out.println("Eligible to drive");
        } else {
            System.out.println("Not eligible");
        }
    }
}
