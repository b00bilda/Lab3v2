package Subjects;

public abstract class Subject implements BeDamaged {
    public String name;
    public SubjectStatus subStatus;

    public Subject(String name) {
        this.name = name;
    }

    public void setSubjectStatus(SubjectStatus subStatus) {
        this.subStatus = subStatus;
    }

    public SubjectStatus getSubStatus() {
        return this.subStatus;
    }

    public String getName() {
        return this.name;
    }


    public void beDamaged() {
        this.setSubjectStatus(SubjectStatus.DAMAGED);
    }
}
