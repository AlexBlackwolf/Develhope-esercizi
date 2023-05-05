package BroCodeCourse.Encapsulation;
public class Main {
    public static void main(String[] args) {

        Sword sword = new Sword("claymore", "steel", 1913);


        sword.setYear(1914);

        System.out.println(sword.getType());
        System.out.println(sword.getMetal());
        System.out.println(sword.getYear());

    }
}
