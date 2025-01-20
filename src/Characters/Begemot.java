package Characters;

import Subjects.*;

import java.util.ArrayList;


import static Characters.Type.CAT;
import static Subjects.SubjectStatus.DAMAGED;
import static Subjects.SubjectStatus.DEAD;

public class Begemot extends Character {
    public int gunsQuantity = 1;

    public Begemot(Type type) {
        super("Бегемот", type);
        super.setStatus(CharacterStatus.NORMAL);
    }

    public void gettingReady() {
        System.out.println(this.getType() + " долго готовился к выстрелу");
        Margarita margarita = new Margarita(Type.HUMAN);
        margarita.scare();
    }

    @Override
    public boolean hitTheSubject(Subject s) {
        if (Math.random() > 0.3) {
            return true;
        } else {
            return false;
        }
    }

    public void hasTheGun(Gun g) {
        this.gunsQuantity++;
    }


    public void shoot(Gun g, Gella gella, Owl owl, Clock clock, ListOfShooters listOfShooters) {
        System.out.println(this.getName() + " выстрелил из обоих револьверов.");
        g.gunSound(gella);
        if (this.hitTheSubject(owl)) {
            owl.HP = owl.HP - 2;
            owl.beDamaged();
        } else {
            this.missTheTarget(owl);
        }
        if (this.hitTheSubject(clock)) {
            clock.HP = clock.HP - 1;
            clock.beDamaged();
        } else {
            this.missTheTarget(clock);
        }
        if ((owl.getSubStatus() == DEAD) | (clock.getSubStatus() == DAMAGED) | (owl.getSubStatus() == DAMAGED)) {
            listOfShooters.addCharacter(this);
        }
    }

    public void defend() {
        System.out.println(this.getName() + " в ответ вцепился в " + Gella.Hair.description);
        this.setStatus(CharacterStatus.AGRESSIVE);
    }

    public class BegemotsHair {
        public static String getDescription() {
            return "клок шерсти";
        }

        public static ArrayList<BegemotsHair> wool = new ArrayList<>();

        {
            wool.add(new BegemotsHair());
        }


        public static void hairAreWrested() {
            wool.clear();
        }
    }

    public void beHealed() {
        if (this.HP <= 2) {
            System.out.println(this.getName() + " старался приладить вырванный " + BegemotsHair.getDescription());
            this.HP++;
        }
    }


    public void beInjured() {
        if (this.HP <= 3) {
            System.out.println(BegemotsHair.getDescription() + " " + this.getName() + " был вырван.");
            BegemotsHair.hairAreWrested();
            this.defend();
        }
    }

    public void talking() {
        if (this.chStatus.equals(CharacterStatus.AGRESSIVE)) {
            System.out.println(this.getType() + " завывал:");
            System.out.println("— Оттащите от меня взбесившуюся чертовку!");
        } else if (this.chStatus.equals(CharacterStatus.ANNOYED)) {
            System.out.println(this.getType() + " кричал:");
            System.out.println("— Я не могу стрелять, когда под руку говорят!");
        }
    }

}