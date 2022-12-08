import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = scan.nextInt();

        System.out.println(a + (isPrime(a) ? " is prime" : " is not prime"));
    }

    public static boolean isPrime(int a)
    {
        int count = 0;
        for (int i = 1; i <= a; i++)
        {
            if (a % i == 0)
                count++;
        }
        return count == 2;
    }
}
