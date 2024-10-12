package hexlet.code;

import java.util.Scanner;

public class Welcome {
    public static String getName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}