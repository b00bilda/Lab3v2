package Characters;

import Subjects.Subject;

import static Characters.CharacterStatus.NORMAL;

public class Azazello extends Character {
    public Azazello(String name, Type type) {
       super(name, type);
       super.setStatus(CharacterStatus.NORMAL);
    }

    @Override
    public void talking() {
        System.out.println(this.getName() + " что-то прорычал");
    }

    public void giveTheGun() {
        System.out.println(this.getName() + " вынул второй револьвер и протянул коту");
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

    @Override
    public void beInjured() {
        System.out.println("Рука Геллы была окровавлена.");
    }

}
