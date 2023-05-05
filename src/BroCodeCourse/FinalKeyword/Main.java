package BroCodeCourse.FinalKeyword;
//anything that is declared as final cannot be updated or changed within your program
public class Main {
    public static void main(String[] args) {
        final double pi = 3.134567;
                //pi = 4;
        System.out.println(pi);
        //before final once is updated by pi = 4 it will be 4 but
        //if we put final we will have an error cause if u put final
        //variables cannot be updated therefor we need to remove the updated pi
    }
}
