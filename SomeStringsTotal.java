import java.util.Scanner;

public class SomeStringsTotal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        System.out.print("How many Strings? ");
        try {
            n = scan.nextInt();
            scan.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid number");
            System.exit(1);
        }
        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter String" + i + ": ");
            total += scan.nextLine().length();
        }
        System.out.println("The total is " + total);
    }
}
