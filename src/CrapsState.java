class CrapsState extends CrapsGameState {
    void play(int rolled) {
        System.out.println("CrapsState.play() - calling on...");
        System.out.println("CrapsGameState.play()");
        if (rolled == 7 || rolled == 11) {
            // now has 2 params
            GameController.setState("WIN", rolled);

        } else if (rolled == 2 || rolled == 3 || rolled == 12) {
            GameController.setState("LOOSE", rolled);
        } else {
            GameController.setState("POINT", rolled);
        }
    }
}
