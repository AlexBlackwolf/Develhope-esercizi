package BroCodeCourse.ToStringMethod;

public class Game {
    String name = "mh world";
    String dlc = "ice borne";
    int releaseYear = 2019;
    String genre = "rpg";


    //you can override toString method
    public String toString(){
        String myString= name +"\n"+ dlc +"\n"+ releaseYear +"\n"+ genre;
        return myString;
        //or
        //return name +"\n"+ dlc +"\n"+ releaseYear +"\n"+ genre;
    }
    //instead of void we gonna be returning a String so put String

    /*public Game(String name, String dlc, int releaseYear, String genre) {
        this.name = name;
        this.dlc = dlc;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }*/
}
