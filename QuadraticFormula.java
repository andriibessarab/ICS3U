import java.util.Scanner;

public class QuadraticFormula
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scan.nextInt();

        System.out.print("Enter b: ");
        int b = scan.nextInt();

        System.out.print("Enter c: ");
        int c = scan.nextInt();

        System.out.println("Solution 1 is " + root1(a, b, c));
        System.out.println("Solution 2 is " + root2(a, b, c));
    }


    public static String root1(int a, int b, int c)
    {
        Double q = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        if (q.isNaN())
            return "" + -b/(2.0 * a) + " - " +  Math.sqrt(-(b * b - 4 * a * c))/2.0 + "i";
        else
            return q.toString();
    }

    public static String root2(int a, int b, int c)
    {
        Double q = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        if (q.isNaN())
            return "" + -b/(2.0 * a) + " + " +  Math.sqrt(-(b * b - 4 * a * c))/2.0 + "i";
        else
            return q.toString();
    }


}
