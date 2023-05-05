package BroCodeCourse.Constructors;

public class Main {
    public static void main(String[] args) {
        Game game1 = new Game("elden ring", "rpg", 2022, 59.99);
        Game game2 = new Game("monster hunter", "rpg", 2021, 49.99);

        game2.started();
        game1.cloesd();
    }
}

