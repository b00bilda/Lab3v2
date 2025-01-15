package Characters;

import Subjects.Clock;
import Subjects.Gun;
import Subjects.Owl;
import Subjects.Subject;

import java.util.Objects;

import static Characters.Type.CAT;
import static Characters.Type.HUMAN;

public class Character implements Shoot, WayOfTalking, GetTheGun, HitTheTarget, ToWhat, AssaultTo, Fight, BeHealed, BeInjured {
    String name;
    CharacterStatus chStatus;
    Type type;
    public int gunsQuantity;
    public int HP = 5;

    public Character(String name, Type type) {
        this.type = type;
        this.name = name;
    }

    public boolean equals(Character ch) {
        if ((this.name == ch.name) & (this.type == ch.type)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return getType() + " " + getName();
    }

    public void setStatus(CharacterStatus chStatus) {
        this.chStatus = chStatus;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        if (this.type == CAT) {
            return "Кот";
        } else {
            return "Человек";
        }
    }


    public String toWhat(Subject s) {
        switch(s.getClass().getSimpleName()) {
            case "Owl":
                return "сову";
            case "Clock":
                return "часы";
            case "Glass":
                return "бокал";
            default:
                return "";
        }
    }

    public String toWho(Character ch) {
        switch(ch.getClass().getSimpleName()) {
            case "Gella":
                return "Геллы";
            case "Korovyev":
                return "Коровьева";
            case "Azazello":
                return "Азазелло";
            case "Begemot":
                return "коту";
            default:
                return "";
        }
    }

    public static String whom(Character ch) {
        switch(ch.getClass().getSimpleName()) {
            case "Gella":
                return "Геллу";
            case "Korovyev":
                return "Коровьева";
            case "Azazello":
                return "Азазелло";
            case "Margarita":
                return "Маргариту";
            case "Begemot":
                return "Бегемота";
            default:
                return "";
        }
    }



    public void shootToSubject(Subject s) {
        System.out.println(this.getName() + " выстрелил в " + toWhat(s));
        if (this.hitTheSubject(s) == true) {
            s.HP = s.HP - 1;
            s.beDamaged();
        } else {
            this.missTheTarget(s);
        }
    }

    public void getTheGun() {
        if (Math.random() > 0.5) {
            this.gunsQuantity = 2;
        }
        else {
            this.gunsQuantity = 1;
        }
    }

    public String say() {
        switch(this.getClass().getSimpleName()) {
            case "Gella":
                return "завизжала";
            case "Korovyev":
                return "";
            case "Azazello":
                return "прорычал";
            case "Begemot":
                if (Math.random() > 0.5) {
                    return "завывал";
                } else {
                    return "кричал";
                }
            default:
                return "";
        }
    }

    public void talking() {}

    public boolean hitTheSubject(Subject s) {
        return true;
    }
    public boolean hitTheCharacter(Character ch) {
        return true;
    }

    public void gettingReady() {
        switch (this.getType()) {
            case "Кот" -> System.out.println(this.getType() + " долго готовился к выстрелу");
            case "Человек" -> System.out.println(this.getName() + " приготовился к выстрелу");
        }
    }

    public void missTheTarget(Subject s) {
        if (Math.random() > 0.5) {
            System.out.println(this.getName() + " не попал в " + toWhat(s));
        } else {
            System.out.println(this.getName() + " промахнулся, стреляя в " + toWhat(s));
        }
    }

    public static void assaultTo(Character attacker, Character defender) {
        switch(attacker.getClass().getSimpleName()) {
            case "Gella" -> System.out.print(attacker.getName() + " вцепилась в ");
            default -> System.out.print(attacker.getName() + " напал на ");
        }
        switch(defender.getClass().getSimpleName()) {
            case "Begemot" -> System.out.println("кота");
            default -> whom(defender);
        }
        defender.HP = defender.HP - 1;
        defender.beInjured();
    }

    @Override
    public String beHealed() {
        return "";
    }

    @Override
    public String beInjured() {
        return "";
    }

    public void fight(Character attacker, Character defender) {}
    public void fight() {}
    public void fight(Character ch) {}

    public static void stopFighting(Character ch, Character ch1) {
        System.out.print("Дерущихся " + whom(ch) + " и " + whom(ch1) + " разняли. ");
    }
}
