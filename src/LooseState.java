class LooseState extends CrapsGameState {

    void play(int rolled) {
        System.out.println("LooseState.play() - rolled: " + rolled);
        System.out.println("decrease credits");
        if (GameController.credits == 10) {
            System.out.println("0 credits remaining. Game Over.");
            System.exit(0);
        } else {
            GameController.credits -= 10;
            System.out.println("Credits remaining: " + GameController.credits);
            GameController.setState("CRAPS");
        }
    }
}
