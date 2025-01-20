package Subjects;

import Characters.CharacterStatus;
import Characters.Gella;

public class Gun extends Subject {
    public Gun() {
        super("револьвер");
    }

    public void gunSound(Gella gella) {
        gella.setStatus(CharacterStatus.FEAR);
        gella.HP = gella.HP - 1;
        gella.reaction();
    }
}
