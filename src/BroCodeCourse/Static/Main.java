package BroCodeCourse.Static;
//static = modifier a single copy of a variable/method
//is created and shared the class "owns" the static member
//can make multiple objects all instance on single variable
public class Main  {
    public static void main(String[] args) {

        Game game1 = new Game("nier");
        Game game2 = new Game("bioshock");
        Game game3 = new Game("legend of zelda");
        Game game4= new Game("pacman");

        //System.out.println(Game.gamesOwned);
        Game.displayGamesOwne();
    }
}
