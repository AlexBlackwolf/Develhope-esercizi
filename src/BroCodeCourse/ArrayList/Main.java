package BroCodeCourse.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //array of names of games therefor String, in case of Integer we would use
        //Integer which is the reference and not int which is the primitive
        ArrayList<String> games = new ArrayList<String>();
        games.add("dark souls");
        games.add("elden ring");
        games.add("monster hunter");
        //useful method of arraylist
        games.set(0, "demon souls");
        games.remove(2);
        //clear to clear all the elements
        games.clear();

        //dsiplay elements by using a for loop
        for(int i=0; i<games.size();i++) {
            System.out.println(games.get(i));
        }
    }
}
