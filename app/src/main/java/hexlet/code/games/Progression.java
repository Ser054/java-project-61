package hexlet.code.games;

import hexlet.code.IGame;

public class Progression implements IGame {
    public static int getRndNum(int startNum, int endNum) {
        return startNum + (int) (Math.random() * endNum);
    }
    public String startGame(String nameUser) {
        int rndNumStart = getRndNum(5, 20);
        int rndStep = getRndNum(4, 10);
        int rndPosition = getRndNum(1, 10);
        System.out.print("Question: ");
        String result = "";
        for (int i = 1; i <= 10; i++) {
            if (i == rndPosition) {
                result += Integer.toString(rndNumStart);
                System.out.print(".. ");
                rndNumStart += rndStep;
                continue;
            }
            System.out.print(rndNumStart + " ");
            rndNumStart += rndStep;
        }
        System.out.print("\nYour answer: ");
        return result;
    }
}
