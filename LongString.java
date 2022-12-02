import java.util.Scanner;

public class LongString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a String: ");
            String ln = scan.nextLine();
            if(ln.length() > 10) {
                break;
            }
        }
        scan.close();
    }
}
