package Characters;

import Subjects.Clock;
import Subjects.Gun;
import Subjects.Owl;
import Subjects.Subject;

import java.util.Objects;

import static Characters.Type.CAT;
import static Characters.Type.HUMAN;
import static java.util.Objects.hash;

abstract class Character implements BeHealed, BeInjured, Shoot, WayOfTalking, HitTheTarget, ToWhat {
    String name;
    CharacterStatus chStatus;
    Type type;
    final int gunsQuantity = 0;
    public int HP = 3;

    public Character(String name, Type type) {
        this.type = type;
        this.name = name;
    }

    public static int getHP(Character ch) {
        return ch.HP;
    }

    public boolean equals(Character ch) {
        if ((this.name == ch.name) & (this.type == ch.type)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(CharacterStatus chStatus) {
        if ((this.hashCode() == chStatus.hashCode())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return hash(this) * 5;
    }

    @Override
    public String toString() {
        return getType() + " " + getName();
    }

    public void beHealed() {}

    public void beInjured() {

    }

    public void setStatus(CharacterStatus chStatus) {
        this.chStatus = chStatus;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        if ((this.type.equals(Type.CAT))) {
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


    public void missTheTarget(Subject s) {
        if (Math.random() > 0.5) {
            System.out.println(this.getName() + " не попал в " + toWhat(s));
        } else {
            System.out.println(this.getName() + " промахнулся, стреляя в " + toWhat(s));
        }
    }


}
