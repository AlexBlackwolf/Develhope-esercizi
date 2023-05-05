package BroCodeCourse.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Action action = new Action();
        Rpg rpg = new Rpg();
        Mmo mmo = new Mmo();

        Game[] storyGenre = {action,rpg,mmo};
        for (Game x : storyGenre) {
            x.play();
        }
    }
}
