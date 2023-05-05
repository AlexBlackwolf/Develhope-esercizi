package BroCodeCourse.ForEachLoop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*String[] manga = {"onepiece", "berserk", "dragonball"};
        //first part inside brackets insert the data type of our collection
        //than index which is i
        //than colum : which represent the word in
        //than last list the collection/array at the end
        for (String i : manga) {
            System.out.println(i);*/

            ArrayList<String> games = new ArrayList<String>();
            games.add("mh3");
            games.add("mh3u");
            games.add("mh4u");
            for (String j : games) {
                System.out.println(j);
            }
        }
    }
