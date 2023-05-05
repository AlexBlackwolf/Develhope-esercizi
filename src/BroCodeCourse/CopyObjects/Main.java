package BroCodeCourse.CopyObjects;

public class Main {
    public static void main(String[] args) {
        Sword sword1= new Sword("claymore","steel",1934);
        //Sword sword2= new Sword("Katana","steel",1935);
        Sword sword2 = new Sword(sword1);
        sword2.copy(sword1);

        System.out.println(sword1);
        System.out.println(sword2);
        System.out.println(sword1.getType());
        System.out.println(sword1.getMetal());
        System.out.println(sword1.getYear());
        System.out.println("");
        System.out.println(sword2.getType());
        System.out.println(sword2.getMetal());
        System.out.println(sword2.getYear());
    }
}
