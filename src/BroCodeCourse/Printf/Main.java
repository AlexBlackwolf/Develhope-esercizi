package BroCodeCourse.Printf;

public class Main {
    public static void main(String[] args) {
        //System.out.printf("this is a format string % ", 123);
        //%d will add this decimal value %d this will make 123 appear where is placed
        //if i put it at the start it will print 123 before this is the format string
        boolean myBoolean = true;
        char myChar = '@';
        String myString= "Alex";
        int myInt = 30;
        double myDouble= 1000.000;

        //System.out.printf("%b",myBoolean);
        //System.out.printf("%c",myChar);
        //System.out.printf("%s",myString);
        //System.out.printf("%d",myInt);
        //System.out.printf("%f",myDouble);

        //width
        //to add width if you put - it will move the word behind
        //minimum number of characters to be written as output
        System.out.printf("Hello %30s", myString);

        //precision
        //this will limit the amount of digits that will appear after decimal
        //it will limit a number of digits of precision when out putting floating-point
        // values
        //System.out.printf("you have this much money %.1f", myDouble);

        //flags
        //adds an effects to output based on the flag added to format specifier
        // -: left-justify
        // +: output a plus (+) or a minus (-) sign for numeric values
        // 0: numeric values are zero-padded
        // ,: comma grouping separator if numbers > 1000

        //System.out.printf(" you have this money %-20f",myDouble);
        //100.000000
        //System.out.printf(" you have this money %020f",myDouble);
        //0000000000100.000000
        //will add a coma
        //System.out.printf(" you have this money %,f",myDouble);
        //1,000.000000
    }
}
