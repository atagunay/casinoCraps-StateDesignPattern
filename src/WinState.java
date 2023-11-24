class WinState extends CrapsGameState {
    @Override
    void doEnterStateActivity() {
        System.out.println("increase credits");
        GameController.credits += 10;
        System.out.println("Credits remaining: " + GameController.credits);
        GameController.setState("CRAPS");
    }

    @Override
    void doExitStateActivity() {
        super.doExitStateActivity();
    }

    void play(int rolled) {
        System.out.println("WinState.play()");
        // User can not play when state is win
        System.out.println("You have to start a new game");
    }
}
