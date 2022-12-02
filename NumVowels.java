import java.util.Scanner;

public class NumVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numofVowels = 0;
        System.out.println("Enter a String: ");
        String str = scan.nextLine();
        scan.close();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                numofVowels++;
            }
        }
        System.out.println("There are " + numofVowels + " vowels.");
    }
}
