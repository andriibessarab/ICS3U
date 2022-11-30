import java.util.Scanner;

public class Password3Tries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "password";
        String guess = "";
        int tries = 0;

        // prompt user for password
        while (!guess.equals(password) && tries < 3) {
            System.out.println("Enter password: ");
            guess = scan.nextLine();
            tries++;
        }

        scan.close();

        // check if password was guessed
        System.out.println(guess.equals(password) ? "Access granted" : "Access Denied");
    }
}
