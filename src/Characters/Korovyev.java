package Characters;

public class Korovyev extends Character {
    public Korovyev(Type type) {
        super("Коровьев", type);
        super.setStatus(CharacterStatus.NORMAL);
    }

    public void blow(Character ch) throws GellaIsStillInjured {
        if (Math.random() > 0.4) {
            ch.HP = ch.HP + 1;
        } else {
            throw new GellaIsStillInjured();
        }
        System.out.println("Коровьев подул и " + ch.beHealed() + ".");
    }
}
