package Subjects;

public class Glass extends Subject {
    public Glass() {
        super("бокал");
        super.setSubjectStatus(SubjectStatus.NORMAL);
    }

    @Override
    public void beDamaged() {
        if (this.HP == 1) {
            this.setSubjectStatus(SubjectStatus.DAMAGED);
            System.out.println(this.getName() + " упал со стола и разбился");
        }
    }
}
