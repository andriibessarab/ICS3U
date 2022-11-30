public class WhileRandom {
    public static void main(String[] args) {
        int i = 0;
        while(i < 100) {
            int j = 0;
            while (j < 10) {
                System.out.print((int)(Math.random() * 1000) + 1 + "\t");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
