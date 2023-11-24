import java.util.Random;

class Dice {
    static int rollDice() {
        Random random = new Random();
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        int rolled = die1 + die2;
        System.out.println("...rolled: " + rolled);
        return rolled;
    }
}
