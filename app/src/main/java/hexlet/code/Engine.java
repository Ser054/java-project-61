package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void start(String nameUser, IGame iGame) {
        int countOfParties = 3;
        for (int i = 0; i < countOfParties; i++) {
            String result = iGame.startGame(nameUser);
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();
            userAnswer = userAnswer.toLowerCase();
            if (!userAnswer.equals(result)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + result + "'.\n"
                        + "Let's try again, " + nameUser + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + nameUser + "!");
    }
}
