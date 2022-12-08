import java.util.Scanner;

public class ATM
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int balance = 1000;

        menu();

        System.out.print("Enter choice: ");
        int x = scan.nextInt();

        while (x != 4)
        {
            if (x == 1)
            {
                System.out.print("How much to deposit? ");
                int d = scan.nextInt();
                balance += d;
            }
            else if (x == 2)
            {
                System.out.print("How much to withdraw? ");
                int w = scan.nextInt();
                balance -= w;
            }
            else if (x == 3)
            {
                System.out.println("Your balance is $" + balance);
            }

            menu();

            System.out.print("Enter choice: ");
            x = scan.nextInt();
        }

        System.out.println("Goodbye");
    }


    public static void menu()
    {
        System.out.println("Choose one of the following:");
        System.out.println("1) Deposit");
        System.out.println("2) Withdraw");
        System.out.println("3) Check Funds");
        System.out.println("4) Quit");
    }

}
