//Use do-while loop to print menu until exit
package Day5;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Say Hello");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Hello!");
            }

        } while (choice != 2);
    }
}
