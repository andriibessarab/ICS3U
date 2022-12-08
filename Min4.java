import java.util.Arrays;
import java.util.Scanner;

public class Min4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(min(arr));
    }


    public static int min(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
