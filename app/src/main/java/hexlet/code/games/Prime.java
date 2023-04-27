package hexlet.code.games;

import hexlet.code.IGame;

public class Prime implements IGame {
    public static boolean isPrime(int num) {
        final int minDiv = 2;
        if (num < minDiv) {
            return false;
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int getRndNum(int startNum, int endNum) {
        return startNum + (int) (Math.random() * endNum);
    }
    public String startGame(String nameUser) {
        final int rangeNumStart = 6;
        final int rangeNumEnd = 100;
        int rndNum = getRndNum(rangeNumStart, rangeNumEnd);
        System.out.print("Question: " + rndNum
                + "\nYour answer: ");
        String answer = "";
        if (isPrime(rndNum)) {
            answer = "yes";
        } else {
            answer = "no";
        }
        return answer;
    }
}
