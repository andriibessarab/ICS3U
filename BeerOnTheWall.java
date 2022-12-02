public class BeerOnTheWall {
    // Prints the lyrics to the song "99 Bottles of Beer on the Wall"
    public static void main(String[] args) {
        for (int i = 99; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall");
            System.out.println(i + " bottles of beer");
            System.out.println("Take one down, pass it around");
            System.out.println(i - 1 + " bottles of beer on the wall");
            System.out.println();
        }
    }
}
