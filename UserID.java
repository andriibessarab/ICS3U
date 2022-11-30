import java.util.Scanner;

public class UserID {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        input.close();
        try {
            System.out.println(name.substring(name.indexOf(" ") + 1) + name.charAt(0));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid name");
        }

    }
}
