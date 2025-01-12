package Characters;

import Subjects.Gun;
import Subjects.Subject;


public class Azazello extends Character {
    public Azazello(Type type) {
       super("Азазелло", type);
       super.setStatus(CharacterStatus.NORMAL);
    }

    @Override
    public void talking() {
        System.out.println(this.getName() + " что-то прорычал");
    }

    public void giveTheGun(Character ch, Gun g) {
        System.out.println(this.getName() + " вынул второй " + g.getName() + " и протянул " + toWho(ch));
    }

    @Override
    public boolean hitTheSubject (Subject s) {
        if (Math.random() > 0.7) {
            return true;
        }
        else {
            return false;
        }
    }

}
