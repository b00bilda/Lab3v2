package Subjects;

public class Glass extends Subject {
    public Glass(String name) {
        super(name);
        super.setSubjectStatus(SubjectStatus.NORMAL);
    }

    @Override
    public void beDamaged() {
        this.setSubjectStatus(SubjectStatus.DAMAGED);
        System.out.println("Бокал упал со стола и разбился");
    }
}
