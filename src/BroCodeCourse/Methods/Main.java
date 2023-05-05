package BroCodeCourse.Methods;

public class Main {
    public static void main(String[] args) {
        //all that is called within the curly brackets belongs to Main method
        //to call the hello method from the static method of main we need to
        //insert static to call hello from outside the curly brackets

        //hello();

        //we can pass a string variable to the method
        String name = "Alex";
        int age = 30;
        //to pass a variable to a method just put the variable into the brackets
        //the values or variable passed to a method are called arguments
        //and can be confused with parameters
        hello(name);
        //to make int work we need to set int as argument and parameter
        hello1(name, age);
        //
        int exercise1 = exercise1();
    }

    //void is a return type
    //inside the method we need to put matching set of arguments and parameters
    //to set up a parameter fo the method, we need to list the data type the value
    //our method is expecting, so we pass String as an argument, therefore we Pass
    //string as a parameter
    //we insert String and name inside the brackets
    static void hello(String name) {
        System.out.println("hello " + name);
        //argument and parameter don't have to be matching only datatype
        //we can change the variable name to title
    }

    static void hello1(String name, int age) {
        System.out.println("Hello " + name + ",your age is " + age);

    }


    static int exercise1() {
    int x = 3;
    int y = 4;

    int z = add(x,y);
    System.out.println(z);
        return x;
    }
    static int add(int x, int y) {
        int z = x + y;
        return z;
    }
}
