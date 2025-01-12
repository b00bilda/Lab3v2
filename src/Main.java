import Characters.*;
import Subjects.*;

import static Characters.Character.assaultTo;
import static Characters.Character.stopFighting;
import static Subjects.SubjectStatus.DAMAGED;
import static Subjects.SubjectStatus.DEAD;


public class Main {
    public static void main(String[] args) {
        Azazello azazello = new Azazello(Type.HUMAN);
        Begemot begemot = new Begemot(Type.CAT);
        Margarita margarita = new Margarita(Type.HUMAN);
        Gella gella = new Gella(Type.HUMAN);
        Korovyev korovyev = new Korovyev(Type.HUMAN);
        Owl owl = new Owl();
        Gun gun = new Gun();
        Clock clock = new Clock();
        Glass glass = new Glass();
        ListOfShooters list = new ListOfShooters();

        azazello.talking();
        begemot.getTheGun();

        if (begemot.gunsQuantity > 1) {
            azazello.giveTheGun(begemot, gun);
        }

        begemot.gettingReady();
        margarita.scare();

        begemot.shootToSubject(owl);
        begemot.shootToSubject(clock);

        if ((owl.getSubStatus() == DEAD) | (clock.getSubStatus() == DAMAGED) | (owl.getSubStatus() == DAMAGED)) {
            list.addCharacter(begemot);
        }

        azazello.gettingReady();
        azazello.shootToSubject(glass);
        if (glass.getSubStatus() == DAMAGED) {
            list.addCharacter(azazello);
        }

        try {
            list.getNumberOfShooters();
        } catch (ZeroShooters e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }


        assaultTo(gella, begemot);
        gella.beInjured();
        try {
            list.hasCharacter(begemot);
        } catch (BegemotIsNotShooter b) {
            System.out.println(b.getMessage());
            System.exit(0);
        }
        begemot.fight(gella);
        begemot.fight();


        begemot.talking();
        begemot.fight(gella, begemot);
        stopFighting(gella, begemot);
        try {
            korovyev.blow(gella);
        } catch (GellaIsStillInjured g) {
            System.out.println(g.getMessage());
            System.exit(0);
        }
        begemot.talking();

    }
}

