package Characters;

public class Gella extends Character {
    public Gella(String name, Type type) {
        super(name, type);
        super.setStatus(CharacterStatus.NORMAL);
    }

    @Override
    public String beHealed() {
        return "простреленный палец Геллы зажил";
    }
}
