import java.util.Scanner;

public class TenStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while (i <= 10) {
            System.out.print("Enter String" + i + ": ");
            scan.nextLine();
            i++;
        }
        scan.close();
    }
}
