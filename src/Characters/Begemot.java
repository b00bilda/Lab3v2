package Characters;

import Subjects.Subject;
import Subjects.SubjectStatus;

public class Begemot extends Character {
    public Begemot(String name, Type type) {
        super(name, type);
        super.setStatus(CharacterStatus.NORMAL);
    }

    @Override
    public boolean hitTheSubject(Subject s) {
        if (Math.random() > 0.3) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean hitTheCharacter(Character ch) {
        if (Math.random() > 0.3) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void shootToSubject(Subject s) {
        if (this.gunsQuantity == 2) {
            System.out.println(this.getName() + " выстрелил из обоих револьверов.");
        }
        else {
            System.out.println(this.getName() + " выстрелил в " + toWhat(s));
        }
    }

    @Override
    public void fight(Character ch) {
        System.out.print(this.getType() + " вцепился в волосы " + toWho(ch) + ". ");
    }

    @Override
    public void fight() {
        System.out.println("Они, свившись в клубок, покатились по полу.");
    }

    public int phrases = 0;
    @Override
    public void talking() {
        if (phrases == 0) {
            System.out.print("— Оттащите от меня взбесившуюся чертовку! — " + this.say() + " " + this.getName());
            phrases++;
        } else {
            System.out.println("— Я не могу стрелять, когда под руку говорят! — " + this.say() + " " + this.getName() + this.beHealed());
        }
    }

    @Override
    public void fight(Character attacker, Character defender) {
        System.out.print(", отбиваясь от " + toWho(attacker) + ". ");
    }

    @Override
    public String beHealed() {
        return "и старался приладить на место выдранный у него на спине громадный клок шерсти. ";
    }

}
