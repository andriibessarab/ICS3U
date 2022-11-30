import java.util.Scanner;

public class Password2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Choose a password: ");
        String password = input.nextLine();
        System.out.println(
                password.length() >= 6 && !Character.isLowerCase(password.charAt(0)) ? "valid" : "invalid");
    }
}