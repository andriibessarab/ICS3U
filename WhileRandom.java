public class WhileRandom {
    public static void main(String[] args) {
        int i = 0;
        while(i < 100) {
            System.out.println((int)(Math.random() * 1000));
            i++;
        }
    }
}
