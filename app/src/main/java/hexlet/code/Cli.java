package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String nameUser = scanner.next();
        System.out.println("Hello, " + nameUser + "!");
    }
}