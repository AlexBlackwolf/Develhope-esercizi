package BroCodeCourse.Array;
//array are used to store multiple values in a single variable
public class Main {
    public static void main(String[] args) {
        String[] cars={"BMW","Corvette","Tesla"};
        //elements are the slots inside an array it starts from 0
        cars[0] = "Mustang";
        System.out.println(cars[0]);
        //in an array all values must have the same datatype
        //if the array is of Strings all values will need to have the datatype of String

        //additional way to write an array that is by allocating the numbers of elements
        //we will need storing the value in a later time
        String[] motos = new String[4];
        motos[0] = "Harley";
        motos[1] = "Tesla";
        motos[2] = "Ducati";
        motos[3] = "Honda";
        // you can use a for loop to iterate the elements of an array
        for(int i =0; i<motos.length;i++){
            System.out.println(motos[i]);
        }
    }
}
