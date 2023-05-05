package BroCodeCourse.ArrayOfObjects;

public class Main {
    public static void main(String[] args) {
        Game [] gamesCollection = new Game[3];
        Game game1 = new Game("ds1");
        Game game2 = new Game("ds2");
        Game game3 = new Game("ds3");

        gamesCollection[0] = game1;
        gamesCollection[1] = game2;
        gamesCollection[2] = game3;

        //without.name it will print the adresss
        System.out.println(gamesCollection[0].name);
        System.out.println(gamesCollection[1].name);
        System.out.println(gamesCollection[2].name);

        //other method to write shorter is
        //Game [] gamesCollection1 = {game1,game2,game3};

    }
}
