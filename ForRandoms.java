public class ForRandoms {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print((int)(Math.random() * 500 + 1) + "\t");
            }
            System.out.print("\n");
        }
    }
}
