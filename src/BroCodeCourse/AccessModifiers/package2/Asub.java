package BroCodeCourse.AccessModifiers.package2;

import BroCodeCourse.AccessModifiers.package1.*;
//add * instead of A to import all of the package

public class Asub extends A {
    public static void main(String[] args) {

        //C c = new C();
        //System.out.println(c.defaultMessage);

        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);

    }
}

