package BroCodeCourse.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer= new FileWriter("poem.txt");
            writer.write("Roses are red\nViolets are blue\nI study if could\nBut my girl decided is not due\nlaughing out loud\nwith videos on hand\nit seems my study is at the end");
            writer.append("\n(A poem by Alex)");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
