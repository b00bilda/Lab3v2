package Characters;

public class Margarita extends Character {
    public Margarita(String name, Type type) {
        super(name, type);
        super.setStatus(CharacterStatus.NORMAL);
    }

    @Override
    public void beInjured() {
        System.out.println("Маргарита сидела, заткнув пальцами уши.");
    }
}
