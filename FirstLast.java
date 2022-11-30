import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }
    }
}
