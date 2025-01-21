package Characters;

import Subjects.Glass;

public class Fight {
    Gella attacker;
    Begemot defender;
    String attackersPosition;
    String defendersPosition;

    public Fight(Begemot begemot, Gella gella) {
        attacker = gella;
        defender = begemot;
    }

    class Position {
        public void changePosition() {
            System.out.println(attacker.getName() + " и " + defender.getName() + " покатились " + getPosition());
        }

        String getPosition() {
            return "по полу";
        }

    }

    Position attackerPosition = new Position() {
        String getPosition() {
            return "верхом";
        }
        public void changePosition() {
            System.out.println(attacker.getName() + " сидела " + attackerPosition.getPosition() + " на " + defender.getName());
        }
    };

    public void stopFight() {
        defender.setStatus(CharacterStatus.ANNOYED);
        System.out.println("Дерущихся " + attacker.getName() + " и " + defender.getName() + " разняли.");
        Korovyev korovyev = new Korovyev(Type.HUMAN);
        korovyev.blow(attacker);
        defender.talking();
        defender.beHealed();
    }



    public void startFight() {
        Position position = new Position();
        attacker.reaction();
        attacker.assault(defender);
        position.changePosition();
        Glass glass = new Glass();
        if (position.getPosition() == "по полу") {
            glass.HP = glass.HP - 1;
            glass.beDamaged();
        }
        attackerPosition.changePosition();
        defender.talking();
        this.stopFight();
    }




}
