package Subjects;

import Characters.CharacterStatus;

public class Owl extends Subject {
    public Owl(String name) {
        super(name);
        super.setSubjectStatus(SubjectStatus.NORMAL);
    }

    void sleep() {
        System.out.println(this.getName() + " дремала на каминной полке.");
    }

    @Override
    public void beDamaged() {
        this.setSubjectStatus(SubjectStatus.DEAD);
        System.out.println("Убитая сова упала с камина");
    }
}
