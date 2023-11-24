class CrapsState extends CrapsGameState {
    void play(int rolled) {
        System.out.println("CrapsState.play() - calling on...");
        super.play(rolled);
    }
}
