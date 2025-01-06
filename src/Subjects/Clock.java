package Subjects;

public class Clock extends Subject {
    public Clock(String name) {
        super(name);
        super.setSubjectStatus(SubjectStatus.NORMAL);
    }

    @Override
    public void beDamaged() {
        this.setSubjectStatus(SubjectStatus.DAMAGED);
        System.out.println("Часы разбились и остановились");
    }

    // public String stop() {
        // return " и остановились";
    // }
}
