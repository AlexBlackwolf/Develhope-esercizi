package BroCodeCourse.WrapperClass;

public class Main {
    public static void main(String[] args) {
        //reference data types
        //autoboxing when the value is assigned and converted from prim. to refer.
        Boolean a = true;
        Character b = '@';
        Integer C = 123;
        Double d = 3.14;
        //string is already a refence noticed by the CAP S
        String e = "Hunter";
        //unboxing, by using var.into methods they will be treated as prim.
        if(a==true) {
            System.out.println("this is true");
        }
        //accessing the value still takes more step compared to a primitive value
    }
}
