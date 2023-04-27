package hexlet.code.games;

import hexlet.code.IGame;

public class Prime implements IGame {
    public static boolean isPrime(int num) {
        if (num < 2) {
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
        int rndNum = getRndNum(6, 100);
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
