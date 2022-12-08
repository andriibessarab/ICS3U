import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scan.nextDouble();
        scan.close();
        System.out.println("The area of the circle is " + circleArea(radius));
    }


    public static double circleArea(double r) {
        return r * r * Math.PI;
    }
}
