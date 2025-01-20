import Characters.*;
import Subjects.*;


import static Subjects.SubjectStatus.DAMAGED;
import static Subjects.SubjectStatus.DEAD;


public class Main {
    public static void main(String[] args) {
        Azazello azazello = new Azazello(Type.HUMAN);
        Begemot begemot = new Begemot(Type.CAT);
        // Margarita margarita = new Margarita(Type.HUMAN);
        Gella gella = new Gella(Type.HUMAN);
        // Korovyev korovyev = new Korovyev(Type.HUMAN);
        Owl owl = new Owl();
        Gun gun = new Gun();
        Clock clock = new Clock();
        ListOfShooters list = new ListOfShooters();

        azazello.talking();
        azazello.giveTheGun(begemot, gun);

        begemot.gettingReady();


        begemot.shoot(gun, gella, owl, clock, list);

        try {
            list.getNumberOfShooters();
        } catch (ZeroShooters e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        Fight fight = new Fight(begemot, gella);
        fight.startFight();


    }
}

