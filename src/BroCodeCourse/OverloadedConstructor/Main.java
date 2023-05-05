package BroCodeCourse.OverloadedConstructor;

public class Main {
    public static void main(String[] args) {


        CharacterBuild characterBuild = new CharacterBuild("mace", "holy prayer", "heavy armor");

        System.out.println("here are specs for your cleric build: ");
        System.out.println(characterBuild.weapon);
        System.out.println(characterBuild.talisman);
        System.out.println(characterBuild.armor);

        System.out.println("");

        CharacterBuild characterBuild1 = new CharacterBuild("knife", "thief charm");
        System.out.println("you removed your armor, you gain light roll");
        System.out.println(characterBuild1.weapon);
        System.out.println(characterBuild1.talisman);

        System.out.println("");

        CharacterBuild characterBuild2 = new CharacterBuild("broken sword");
        System.out.println("new game +7?");
        System.out.println(characterBuild2.weapon);
    }
}
