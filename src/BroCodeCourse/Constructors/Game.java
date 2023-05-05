package BroCodeCourse.Constructors;

public class Game {
    String name;
    String genre;
    int releaseYear;
    double price;
    Game(String name, String genre, int releaseYear, double price){
        //after constructor values need to be assigned for them to work
        //use this keyword
    this.name=name;
    this.genre=genre;
    this.releaseYear=releaseYear;
    this.price=price;
    }
    void started () {
        System.out.println(this.name+ " has been started");
    }
    void cloesd () {
        System.out.println(this.name+ " has been closed");
    }
}
