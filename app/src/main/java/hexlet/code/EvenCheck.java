package hexlet.code;

import java.util.Scanner;

public class EvenCheck {
    public static void checkEven() {
        String standardName = "Noname";
        checkEven(standardName);
    }
    public static void checkEven(String nameUser) {
        int countOfParties = 3;
        for (int i = 0; i < countOfParties; i++) {
            int startNum = 0; // Начальное значение диапазона - "от"
            int endNum = 100; // Конечное значение диапазона - "до"
            int rndNum = startNum + (int) (Math.random() * endNum);
            System.out.print("Question: " + rndNum
                    + "\nYour answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();
            userAnswer = userAnswer.toLowerCase();
            String answer = "";
            if (rndNum % 2 == 0) {
                answer = "yes";
            } else {
                answer = "no";
            }
            if (!userAnswer.equals(answer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.\n"
                        + "Let's try again, " + nameUser + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + nameUser + "!");
    }
}
