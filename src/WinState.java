class WinState extends CrapsGameState {

    void play(int rolled) {
        System.out.println("WinState.play()" + rolled);
        System.out.println("increase credits");
        GameController.credits += 10;
        System.out.println("Credits remaining: " + GameController.credits);
        GameController.setState("CRAPS");
    }
}
