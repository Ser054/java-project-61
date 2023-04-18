package hexlet.code.games;

import hexlet.code.IGame;

public class EvenCheck implements IGame {
    public String startGame() {
        String standardName = "NoName";
        return startGame(standardName);
    }
    public static int getRndNum0to100() {
        int startNum = 0; // Начальное значение диапазона - "от"
        int endNum = 100; // Конечное значение диапазона - "до"
        return startNum + (int) (Math.random() * endNum);
    }
    public String startGame(String nameUser) {
        int rndNum = getRndNum0to100();
        System.out.print("Question: " + rndNum
                + "\nYour answer: ");
        String answer = "";
        if (rndNum % 2 == 0) {
            answer = "yes";
        } else {
            answer = "no";
        }
        return answer;
    }
}
