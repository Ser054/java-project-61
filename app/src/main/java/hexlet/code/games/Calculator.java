package hexlet.code.games;

import hexlet.code.IGame;

public class Calculator implements IGame {
    public static int getRndNum(int startNum, int endNum) {
        return startNum + (int) (Math.random() * endNum);
    }
    public String startGame(String nameUser) {
        int rndNum1 = getRndNum(0, 20);
        int rndNum2 = getRndNum(0, 20);
        int rndSign = getRndNum(0, 3);
        char charSign = ' ';
        final int indexAdd = 0;
        final int indexDeduct = 1;
        final int indexMultiply = 2;
        int result = 0;
        switch (rndSign) {
            case indexAdd:
                charSign = '+';
                result = rndNum1 + rndNum2;
                break;
            case indexDeduct:
                charSign = '-';
                result = rndNum1 - rndNum2;
                break;
            case indexMultiply:
                charSign = '*';
                result = rndNum1 * rndNum2;
                break;
            default:
                System.out.println("Something went wrong!\nTry again.");
                return "";
        }
        System.out.print("Question: " + rndNum1 + " " + charSign + " " + rndNum2
                + "\nYour answer: ");
        return Integer.toString(result);
    }
}