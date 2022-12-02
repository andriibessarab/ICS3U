import java.util.Scanner;

public class SomeNumbersTotal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            try {
                total += scan.nextInt();
            } catch (Exception e) {
                i--;
                scan.nextLine();
            }
        }
        System.out.println("The total is " + total);
    }
}
