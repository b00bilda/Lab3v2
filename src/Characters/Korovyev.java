package Characters;

public class Korovyev extends Character {
    public Korovyev(Type type) {
        super("Коровьев", type);
        super.setStatus(CharacterStatus.NORMAL);
    }

    public void blow(Gella gella) {
        System.out.print(this.getName() + " подул и ");
        gella.setStatus(CharacterStatus.NORMAL);
        gella.HP++;
        gella.beHealed();
    }
}
