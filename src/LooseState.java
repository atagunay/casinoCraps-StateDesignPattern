class LooseState extends CrapsGameState {
    @Override
    void doEnterStateActivity() {
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

    @Override
    void doExitStateActivity() {
        super.doExitStateActivity();
    }

    void play(int rolled) {
        System.out.println("LooseState.play() - rolled: " + rolled);
        // User can not play when state is lose
        System.out.println("You have to start a new game");
    }
}
