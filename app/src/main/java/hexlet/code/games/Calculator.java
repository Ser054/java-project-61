package hexlet.code.games;

import hexlet.code.IGame;

public class Calculator implements IGame {
    public static int getRndNum(int startNum, int endNum) {
        return startNum + (int) (Math.random() * endNum);
    }
    public String startGame(String nameUser) {
        final int rndNumStartWith = 0;
        final int rndNumEndWith = 20;
        final int rndSignEndWith = 3;
        int rndNum1 = getRndNum(rndNumStartWith, rndNumEndWith);
        int rndNum2 = getRndNum(rndNumStartWith, rndNumEndWith);
        int rndSign = getRndNum(rndNumStartWith, rndSignEndWith);
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
