package hexlet.code;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n"
                        + "1 - Greet\n"
                        + "2 - Even\n"
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
        switch (userAnswerInt) {
            case indexGreet:
                Cli.greeting();
                break;
            case indexEven:
                String nameUser = Cli.greeting();
                EvenCheck.checkEven(nameUser);
                break;
            default:
                System.out.println("Good luck to you!");
                return;
        }
    }
}
