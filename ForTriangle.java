import java.util.Scanner;

public class ForTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scan.nextInt();
        scan.close();

        for (int i = 1; i <= size; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
