package BroCodeCourse.AccessModifiers.package1;

import BroCodeCourse.AccessModifiers.package2.*;

public class A {
    protected String protectedMessage= "this is protected";
    public static void main(String[] args) {


        //C c = new C();
        //System.out.println(c.defaultMessage);
        //no visible cause variable has no modifier

        C c = new C();
        System.out.print(c.publicMessage);
        //visible cause variable is set to public
        B b = new B();
        //System.out.println(b.privateMessage);
        //private visible only within the same class

    }
}
