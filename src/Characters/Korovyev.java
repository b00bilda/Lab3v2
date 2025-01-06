package Characters;

public class Korovyev extends Character {
    public Korovyev(String name, Type type) {
        super(name, type);
        super.setStatus(CharacterStatus.NORMAL);
    }

    public void blow(Character ch) {
        System.out.println("Коровьев подул и " + ch.beHealed() + ".");
    }
}
