package Characters;

import static Characters.CharacterStatus.FEAR;
import static Characters.CharacterStatus.INJURED;

public class Gella extends Character {
    public Gella(Type type) {
        super("Гелла", type);
        super.setStatus(CharacterStatus.NORMAL);
    }


    class GellasArm {
        public String condition;
        public final String description = "рука";

        public void setCondition(Gella gella) {
            if (getHP(gella) <= 2) {
                this.condition = "окровавлена";
            } else {
                this.condition = "зажила";
            }
        }
    }

    public void assault(Begemot begemot) {
        System.out.println(this.getName() + " вцепилась в " + begemot.getName());
        begemot.HP = begemot.HP - 1;
        begemot.beInjured();
    }

    class Hair {
        public static String description = "волосы";
        static int number = 3;
    }


    Gella.GellasArm gellasArm = new Gella.GellasArm();

    public void beHealed() {
        if (this.HP >= 3) {
            gellasArm.setCondition(this);
            System.out.println(gellasArm.description + " " + this.getName() + " " + gellasArm.condition);
        }
    }

    @Override
    public void beInjured() {
        this.setStatus(INJURED);
        gellasArm.setCondition(this);
        System.out.println(gellasArm.description + " " + this.getName() + " " + gellasArm.condition);
    }

    public void reaction() {
        if (this.chStatus.equals(FEAR)) {
            System.out.println(this.getName() + " взвизгнула после звука выстрела.");
            this.beInjured();
        } else if (this.chStatus.equals(INJURED)) {
            System.out.print(this.getName() + " завыла. ");
        }
    }
}
