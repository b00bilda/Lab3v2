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

    public void giveTheGun(Begemot begemot, Gun g) {
        System.out.println(this.getName() + " вынул второй " + g.getName() + " и протянул " + begemot.getName());
        begemot.hasTheGun(g);
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
