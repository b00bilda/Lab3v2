import Characters.*;
import Subjects.*;

import static Characters.Character.assaultTo;
import static Characters.Character.stopFighting;
import static Subjects.SubjectStatus.DAMAGED;
import static Subjects.SubjectStatus.DEAD;


public class Main {
    public static void main(String[] args) {
        Azazello azazello = new Azazello("Азазелло", Type.HUMAN);
        Begemot begemot = new Begemot("Бегемот", Type.CAT);
        Margarita margarita = new Margarita("Маргарита", Type.HUMAN);
        Gella gella = new Gella("Гелла", Type.HUMAN);
        Korovyev korovyev = new Korovyev("Коровьев", Type.HUMAN);
        Owl owl = new Owl("сова");
        Gun gun = new Gun("револьвер");
        Clock clock = new Clock("часы");
        Glass glass = new Glass("бокал");
        ListOfShooters list = new ListOfShooters();

        azazello.talking();
        begemot.getTheGun();
        // System.out.println(begemot.gunsQuantity);
        if (begemot.gunsQuantity > 1) {
            azazello.giveTheGun();
        }

        begemot.gettingReady();
        margarita.beInjured();

        begemot.shootToSubject(owl);
        if (begemot.hitTheSubject(owl) == true) {
            owl.beDamaged();
            // list.addCharacter(begemot);
        } else {
            begemot.missTheTarget(owl);
        }
        if (begemot.gunsQuantity > 1) {
            if (begemot.hitTheSubject(clock) == true) {
                clock.beDamaged();
            } else {
                begemot.missTheTarget(clock);
            }
        }

        if ((owl.getSubStatus() == SubjectStatus.DEAD) | (clock.getSubStatus() == SubjectStatus.DAMAGED)) {
            list.addCharacter(begemot);
        }

        azazello.gettingReady();
        azazello.shootToSubject(glass);
        if (azazello.hitTheSubject(glass) == true) {
            glass.beDamaged();
            list.addCharacter(azazello);
        } else {
            azazello.missTheTarget(glass);
        }

        //int shooters = list.getNumberOfShooters();
        try {
            list.getNumberOfShooters();
        } catch (ZeroShooters e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }


        assaultTo(gella, begemot);
        gella.beInjured();
        begemot.fight(gella);
        begemot.fight();


        begemot.talking();
        begemot.fight(gella, begemot);
        stopFighting(gella, begemot);
        korovyev.blow(gella);
        begemot.talking();

    }
}

