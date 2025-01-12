package Characters;

public class Gella extends Character implements BeInjured {
    public Gella(Type type) {
        super("Гелла", type);
        super.setStatus(CharacterStatus.NORMAL);
    }

    @Override
    public String beHealed() {
        if (this.HP >= 3) {
            return "простреленный палец Геллы зажил";
        } else {
            return "";
        }
    }

    @Override
    public String beInjured() {
        if (this.HP <= 4) {
            return "Рука Геллы была окровавлена";
        } else {
            return "";
        }
    }
}
