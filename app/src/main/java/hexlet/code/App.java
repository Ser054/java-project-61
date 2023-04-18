package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenCheck;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n"
                        + "1 - Greet\n"
                        + "2 - Even\n"
                        + "3 - Calc\n"
                        + "0 - Exit\n"
                        + "Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String userAnswerStr = scanner.next();
        int userAnswerInt = 0;
        if (StringUtils.isNumeric(userAnswerStr)) {
            userAnswerInt = Integer.parseInt(userAnswerStr);
        }
        final int indexGreet = 1;
        final int indexEven = 2;
        final int indexCalc = 3;
        String nameUser = "NoName";
        switch (userAnswerInt) {
            case indexGreet:
                Cli.greeting();
                break;
            case indexEven:
                nameUser = Cli.greeting();
                System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
                Engine.start(nameUser, new EvenCheck());
                break;
            case indexCalc:
                nameUser = Cli.greeting();
                System.out.println("What is the result of the expression?");
                Engine.start(nameUser, new Calculator());
                break;
            default:
                System.out.println("Good luck to you!");
                return;
        }
    }
}
