import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int i = 0;
        System.out.println("Enter 10 integers: ");
        while(i < 10) {
            int n = scan.nextInt();
            if (n < smallest) {
                smallest = n;
            }
            i++;
        }
        scan.close();
        System.out.println("The smallest value is " + smallest);
    }
}
