import java.util.Scanner;

class UIHandler {
    static void askPlayerToRoll() {
        String userInput = getUserInput("Press Enter to Roll");

        if (userInput.equals("")) {

        } else {
            System.out.println("quitting...");
            System.exit(-1);
        }
    }

    static String getUserInput(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }

    static int userInputTestRollValue() {
        String userInput = UIHandler.getUserInput("Enter a number between 2 and 12 to test");
        return Integer.parseInt(userInput);
    }
}
