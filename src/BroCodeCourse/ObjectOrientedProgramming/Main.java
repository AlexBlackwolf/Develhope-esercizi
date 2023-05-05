package BroCodeCourse.ObjectOrientedProgramming;

public class Main {
    public static void main(String[] args) {
        Game myGame = new Game();

        System.out.println(myGame.genre);
        System.out.println(myGame.releaseYear);

        myGame.start();
        myGame.finish();
    }
}
