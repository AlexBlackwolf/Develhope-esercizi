package BroCodeCourse.Static;

public class Game {
    String name;
    static int gamesOwned;

    Game(String name) {
        this.name=name;
        gamesOwned++;
    }
    static void displayGamesOwne() {
        System.out.println("you have "+gamesOwned+ " games");
    }
}