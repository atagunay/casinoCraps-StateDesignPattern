import java.util.HashMap;
import java.util.Map;

class GameController {
    static Map<String, CrapsGameState> possibleStates = new HashMap<String, CrapsGameState>();
    static CrapsGameState gameState;
    static int credits;


    GameController() {
        possibleStates.put("CRAPS", new CrapsState());
        possibleStates.put("POINT", new PointState());
        possibleStates.put("WIN", new WinState());
        possibleStates.put("LOOSE", new LooseState());
        gameState = possibleStates.get("CRAPS");
        credits = 30;
    }

    void start() {
        while (true) {
            UIHandler.askPlayerToRoll();
            play(UIHandler.userInputTestRollValue());
        }
    }

    void play(int rolled) {
        gameState.play(rolled); //"delegation" to this.gameState.play() (i.e. INITIAL 1st time)
    }

    static void setState(String gameStateName) {
        System.out.println("setState( :" + gameStateName + ")");
        gameState = getState(gameStateName);
        gameState.doEnterStateActivity();
    }

    static void setState(String gameStateName, int rollValue) {
        CrapsGameState passedIn = getState(gameStateName);

        // ***********************************************
        if (passedIn instanceof WinState || passedIn instanceof LooseState) {
            passedIn.play(rollValue);
        }

        if (passedIn instanceof PointState) {
            ((PointState) passedIn).storePointValueAs(rollValue);
        }
        setState(gameStateName);
    }

    static CrapsGameState getState(String gameStateLookUp) {
        return possibleStates.get(gameStateLookUp);
    }
}
