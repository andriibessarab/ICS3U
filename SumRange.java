import java.util.Scanner;

public class SumRange
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scan.nextInt();

        System.out.print("Enter the second number: ");
        int b = scan.nextInt();

        System.out.println("The sum is " + sumRange(a, b));
    }


    public static int sumRange(int a, int b)
    {
        int sum = 0;
        for (int i = a; i <= b; i++)
        {
            sum += i;
        }
        return sum;
    }


}
