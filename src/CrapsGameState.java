abstract class CrapsGameState {
    abstract void play(int rolled);

    void doEnterStateActivity() {
        ; //default: entry/doNothing


    }

    void doExitStateActivity() {
        ; //default: entry/doNothing
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }
}
