package BroCodeCourse.FileClass;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\progetti\\progetti java\\Develhope-esercizi\\src\\BroCodeCourse\\Notes.txt");

        if(file.exists()) {
            System.out.println("That file exist! :D");
            System.out.println(file.getPath());//get file path inside project
            System.out.println(file.getAbsoluteFile());//get file path inside folder
            System.out.println(file.isFile());//display true if the file is a file
            //file.delete(); to delete a file//need to refresh to see file delete
        }
        else {
            System.out.println("That file does not exist! :D");
        }
    }
}
