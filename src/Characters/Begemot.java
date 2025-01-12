package Characters;

import Subjects.Subject;
import Subjects.SubjectStatus;

public class Begemot extends Character implements BeInjured {
    public Begemot(Type type) {
        super("Бегемот", type);
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
            if (this.hitTheSubject(s) == true) {
                if (Math.random() > 0.8) {
                    s.HP = s.HP - 1;
                } else {
                    s.HP = s.HP - 2;
                }
                s.beDamaged();
            } else {
                this.missTheTarget(s);
            }
            this.gunsQuantity = this.gunsQuantity - 1;
        }
        else {
            System.out.println(this.getName() + " выстрелил в " + toWhat(s));
            if (this.hitTheSubject(s) == true) {
                s.HP = s.HP - 1;
                s.beDamaged();
            } else {
                this.missTheTarget(s);
            }
        }
    }

    @Override
    public void fight(Character ch) {
        System.out.print(this.getType() + " вцепился в волосы " + toWho(ch) + ". ");
        ch.HP = ch.HP - 1;
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
        attacker.HP = attacker.HP - 1;
    }

    @Override
    public String beHealed() {
        if (this.HP >= 3) {
            return " и старался приладить на место" + this.beInjured();
        } else {
            return "";
        }
    }

    public String beInjured() {
        if (this.HP <= 4) {
            return " выдранный у него на спине громадный клок шерсти. ";
        } else {
            return this.getName() + "не был ранен";
        }
    }

}
