package Subjects;

import Characters.CharacterStatus;

public class Owl extends Subject {
    public Owl() {
        super("сова");
        super.setSubjectStatus(SubjectStatus.NORMAL);
    }

    @Override
    public void beDamaged() {
        if (this.HP == 0) {
            this.setSubjectStatus(SubjectStatus.DEAD);
            System.out.println("Убитая " + this.getName() + " упала с камина");
        } else {
            System.out.println(this.getName() + " упала");
        }

    }
}
