package BroCodeCourse.LocalGlobalVariables;

import java.util.Random;

public class DiceRoller {
    Random random;
    int number;
    DiceRoller(){
        random = new Random();
        roll();
    }
    void roll (){
        //variable cannot be seen due to them being outside method
        //we need to declare them as Global declared outside of the method
        //but within the class
        number = random.nextInt(6)+1;
        System.out.println(number);

    }
}
