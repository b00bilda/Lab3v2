package Subjects;

public abstract class Subject implements BeDamaged {
    public String name;
    public SubjectStatus subStatus;
    public int HP = 2;

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
        if (this.HP == 1) {
            this.setSubjectStatus(SubjectStatus.DAMAGED);
        } if (this.HP == 0) {
            this.setSubjectStatus(SubjectStatus.DEAD);
        } else {
            this.setSubjectStatus(SubjectStatus.NORMAL);
        }
    }
}
