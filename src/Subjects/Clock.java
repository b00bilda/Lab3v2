package Subjects;

public class Clock extends Subject {
    public Clock() {
        super("часы");
        super.setSubjectStatus(SubjectStatus.NORMAL);
    }

    @Override
    public void beDamaged() {
        if (this.HP == 1) {
            this.setSubjectStatus(SubjectStatus.DAMAGED);
            System.out.println(this.getName() + " разбились и остановились");
        }
    }


}
