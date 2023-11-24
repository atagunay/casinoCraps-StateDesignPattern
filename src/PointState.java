class PointState extends CrapsGameState {

    int pointValue;

    void play(int rolled) {
        System.out.println("PointState.play()");
        if (rolled == pointValue) {
            resetPointValue();
            GameController.setState("WIN");
        } else if (rolled == 7) {
            resetPointValue();
            GameController.setState("LOOSE");
        } else {
            ; //do nothing
        }
    }

    void storePointValueAs(int rolled) {
        pointValue = rolled;
    }

    void resetPointValue() {
        pointValue = 0;
    }
}
