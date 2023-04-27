package hexlet.code.games;

import hexlet.code.IGame;

public class GCD implements IGame {
    public static int getRndNum1to100() {
        final int startNum = 1; // Начальное значение диапазона - "от"
        final int endNum = 100; // Конечное значение диапазона - "до"
        return startNum + (int) (Math.random() * endNum);
    }
    public String startGame(String nameUser) {
        int rndNum1 = getRndNum1to100();
        int rndNum2 = getRndNum1to100();
        System.out.print("Question: " + rndNum1 + " " + rndNum2
                + "\nYour answer: ");
        String answer = "";
        while (rndNum1 != rndNum2) {
            if (rndNum1 > rndNum2) {
                rndNum1 = rndNum1 - rndNum2;
            } else {
                rndNum2 = rndNum2 - rndNum1;
            }
        }
        answer += Integer.toString(rndNum1);
        return answer;
    }
}
