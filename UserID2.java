import java.util.Scanner;

public class UserID2 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter name: ");
            String name = scan.nextLine();
            scan.close();
            String fn = name.substring(0, name.indexOf(" "));
            String mn = name.substring(name.indexOf(" ") + 1, name.lastIndexOf(" "));
            String ln = name.substring(name.lastIndexOf(" ") + 1);
            System.out.println((ln + fn.charAt(0) + mn.charAt(0)).toLowerCase());
        } catch(Exception e) {
            System.out.println("Invalid name");
        }
    }
}