package BroCodeCourse.ToStringMethod;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        System.out.println(game.name);
        System.out.println(game.dlc);
        System.out.println(game.releaseYear);
        System.out.println(game.genre);

        System.out.println(game.toString());
        System.out.println(game);
        //result @4e50df2e -> this is the address of this game object in memory like a street adress
        //but in the computer memory
    }
}
