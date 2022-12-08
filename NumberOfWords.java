import java.util.Scanner;

public class NumberOfWords
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = scan.nextLine();

        System.out.println("There are " + numWords(str) + " words.");
    }


    public static int numWords(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
            {
                count++;
            }
        }
        return count;
    }

}
