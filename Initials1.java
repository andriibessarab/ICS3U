import java.util.Scanner;

public class Initials1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        scan.close();
        System.out.println(name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1) + ".");
    }
}
