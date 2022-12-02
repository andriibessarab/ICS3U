public class RandomChars {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print((char) ('a' + Math.random() * ('z' - 'a' + 1)) + "\t");
            }
            System.out.print("\n");
        }
    }
}
