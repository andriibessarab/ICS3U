import java.util.Scanner;

public class Password1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Choose a password: ");
        String password = input.nextLine();
        if (password.length() >= 6) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}
