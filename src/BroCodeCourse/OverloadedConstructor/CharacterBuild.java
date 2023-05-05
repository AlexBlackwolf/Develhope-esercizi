package BroCodeCourse.OverloadedConstructor;

public class CharacterBuild {
    String weapon;
    String talisman;
    String armor;

    CharacterBuild(String weapon, String talisman, String armor) {
        this.weapon = weapon;
        this.talisman = talisman;
        this.armor = armor;
    }

    CharacterBuild(String weapon, String talisman) {
        this.weapon = weapon;
        this.talisman = talisman;

    }

    CharacterBuild(String weapon) {
        this.weapon = weapon;

    }
}
