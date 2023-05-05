package BroCodeCourse.LogicalOperator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp = 25;
        if (temp > 30) {
            System.out.println("it is hot outside");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("it is warm outside");
        } else {
            System.out.println("it is cold outside");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! press q or Q to quit");
        String response = scanner.next();
        if (response.equals("q") || response.equals("Q")) {
            System.out.println("you quit the game");
        } else {
            System.out.println("you resume the game");
        }

        System.out.println("You died,return to checkpoint?");
        String resumeGameCheckpoint = scanner.next();
        if (!resumeGameCheckpoint.equals("no") && !response.equals("yes")) {
            System.out.println("return to checkpoint");
        } else {
            System.out.println("Load last savegame");
        }
    }
}
