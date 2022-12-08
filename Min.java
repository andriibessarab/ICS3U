import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        System.out.println(min(a, b));
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }
}
