import java.util.Scanner;

public class Triangles
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of first triangle: ");
        int x = scan.nextInt();
        System.out.print("Enter size of second triangle: ");
        int y = scan.nextInt();
        triangle2(y);
        triangle1(x);
        triangle2(y);

    }


    public static void triangle1(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }


    public static void triangle2(int n)
    {
        for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }

}
