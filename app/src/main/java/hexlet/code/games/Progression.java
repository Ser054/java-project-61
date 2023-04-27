package hexlet.code.games;

import hexlet.code.IGame;

public class Progression implements IGame {
    public static int getRndNum(int startNum, int endNum) {
        return startNum + (int) (Math.random() * endNum);
    }
    public String startGame(String nameUser) {
        final int rangeNumStart = 5;
        final int rangeNumEnd = 20;
        final int rangeStepStart = 4;
        final int rangeStepEnd = 10;
        final int rangePositionStart = 1;
        final int rangePositionEnd = 10;
        int rndNumStart = getRndNum(rangeNumStart, rangeNumEnd);
        int rndStep = getRndNum(rangeStepStart, rangeStepEnd);
        int rndPosition = getRndNum(rangePositionStart, rangePositionEnd);
        System.out.print("Question: ");
        String result = "";
        for (int i = rangePositionStart; i <= rangePositionEnd; i++) {
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
