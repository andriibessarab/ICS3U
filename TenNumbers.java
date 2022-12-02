import java.util.Scanner;

public class TenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            try {
                scan.nextInt();
            } catch (Exception e) {
                i--;
                scan.nextLine();
            }
        }
        System.out.println("Done");
    }
}
