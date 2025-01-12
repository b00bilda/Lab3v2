package Characters;

import static Characters.CharacterStatus.FEAR;

public class Margarita extends Character {
    public Margarita(Type type) {
        super("Маргарита", type);
        super.setStatus(CharacterStatus.NORMAL);
    }

    public void scare() {
        System.out.println(this.getName() + " сидела, заткнув пальцами уши.");
    }
}
