package BroCodeCourse.OverloadedMethods;

public class Main {
    public static void main(String[] args) {
        int x = add(1,2, 3);
        double y = add(1.1,2.2,3.3);
        System.out.println(x);
        System.out.println(y);
    }
    static int add(int a, int b) {
        System.out.println("this overloaded method n.1");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("this overloaded method n.2");
        return a + b + c;
    }

    static double add(double y, double x) {
        System.out.println("this overloaded double method n.1");
        return y + x;
    }
    static double add(double y, double x, double z){
        System.out.println("this overloaded double method n.2");
        return y + x + z;
    }
}
//they need different parameters so they can give a unique signature