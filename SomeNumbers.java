import java.util.Scanner;

public class SomeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        System.out.print("How many numbers? ");
        try {
            n = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid number");
            System.exit(1);
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            try {
                scan.nextInt();
            } catch (Exception e) {
                i--;
                scan.nextLine();
            }
        }
        scan.close();
        System.out.println("Done");
    }
}
